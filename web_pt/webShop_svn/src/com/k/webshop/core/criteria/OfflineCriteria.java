package com.k.webshop.core.criteria;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;

public class OfflineCriteria extends DetachedCriteria {

	/** member: serialVersionUID field type: long */
	private static final long serialVersionUID = 2960644886982500646L;

	private Class entityClass;

	private ArrayList criterions = new ArrayList();

	private ArrayList associations = new ArrayList();

	private ArrayList orders = new ArrayList();

	private Projection projection;

	/**
	 * @param entityClass
	 */
	public OfflineCriteria(Class entityClass) {
		super(entityClass.getName());
		this.entityClass = entityClass;
	}

	public OfflineCriteria(Criteria c) {
		this(c.getClass());
	}

	public DetachedCriteria add(Criterion criterion) {
		criterions.add(criterion);
		return this;
	}

	public DetachedCriteria createCriteria(String associationPath)
			throws HibernateException {
		return createCriteria(associationPath, null, INNER_JOIN);
	}

	public DetachedCriteria createAlias(String associationPath, String alias)
			throws HibernateException {
		return createAlias(associationPath, alias, INNER_JOIN);
	}

	public DetachedCriteria createAlias(String associationPath, String alias,
			int joinType) {
		return createCriteria(associationPath, alias, joinType);
	}

	public DetachedCriteria createCriteria(String associationPath, String alias)
			throws HibernateException {
		return createCriteria(associationPath, alias, INNER_JOIN);
	}

	public DetachedCriteria createCriteria(String associationPath, int joinType)
			throws HibernateException {
		return createCriteria(associationPath, null, joinType);
	}

	public DetachedCriteria createCriteria(String associationPath,
			String alias, int joinType) throws HibernateException {
		// sub OfflineCriteria
		OfflineCriteria oc = new OfflineCriteria(entityClass);
		Association association = new Association(associationPath, alias,
				joinType, oc);
		this.associations.add(association);
		return oc;
	}

	public DetachedCriteria addOrder(Order order) {
		orders.add(order);
		return this;
	}

	public DetachedCriteria setProjection(Projection projection) {
		this.projection = projection;
		return this;
	}

	// ---------------------------------------------------------------------------

	/**
	 * Creates an instance of Criteria with session <br>
	 * the returned instance doesn't contain orderby and projections on the
	 * first-level criteria, but the sub criterias do you can later introduce
	 * orderby and projection into the criteria informations with the invocation
	 * below: <br>
	 * Criteria criteria = oc.getPlainCriteria(Session session); <br>
	 * oc.importOrders(criteria); <br>
	 * oc.importProjection(criteria);
	 * 
	 * <br>
	 * or get the Criteria with another method: <br>
	 * Criteria criteria = oc.getExecutableCriteria(Session session); <br>
	 * getExecutableCriteria method will return a criteria with full information
	 * 
	 * @see com.ericsson.ec.core.dao.criteria.OfflineCriteria#getExecutableCriteria(Session
	 *      session)
	 * @see org.hibernate.criterion.DetachedCriteria#getExecutableCriteria(org.hibernat??e.Session)
	 */
	public Criteria getPlainCriteria(Session session) {
		Criteria instance = session.createCriteria(entityClass);

		importCriterions(instance);

		importAssociations(instance);

		return instance;
	}

	/**
	 * get all criterions method: importCriterions
	 * 
	 * @param instance
	 * @return return type: Criteria
	 */
	private Criteria importCriterions(Criteria instance) {
		for (Iterator i = criterions.iterator(); i.hasNext();) {
			Criterion criterion = (Criterion) i.next();
			instance.add(criterion);
		}
		return instance;
	}

	/**
	 * get all associations under this ReuseableDetatchedCriteria(oc) and its
	 * sub(oc)s
	 * 
	 * method: fillAssociations
	 * 
	 * @param instance
	 * @return return type: Criteria
	 */
	private Criteria importAssociations(Criteria instance) {
		for (int i = 0; i < associations.size(); i++) {
			// retrieve associations that were added previously
			Association a = (Association) this.associations.get(i);

			String associationPath = a.getPath();
			String alias = a.getAlias();
			int joinType = a.getJoinType();
			OfflineCriteria oc = a.getSubCriteria();
			// create criteria instance with stored association info(s)
			Criteria c = instance.createCriteria(associationPath, alias,
					joinType);
			// put previously added criteria info(s) into the sub(oc)
			oc.importCriterions(c);
			// put previously added order info(s) into the sub(oc)
			oc.importOrders(c);
			// put previously added projection info(s) into the sub(oc)
			oc.importProjection(c);
			// put previously added association info(s) into the sub(oc)
			// this is a recursion if encountered a multi-level(oc) situation
			oc.importAssociations(c);
		}
		return instance;
	}

	/**
	 * method: getOrderedCriteria return the instance that includes orderby
	 * 
	 * @param session
	 * @return return type: Criteria
	 */
	public Criteria getOrderedCriteria(Session session) {
		Criteria c = getPlainCriteria(session);
		importOrders(c);
		return c;
	}

	/**
	 * method: getProjectedCriteria return the instance that includes projection
	 * 
	 * @param session
	 * @return return type: Criteria
	 */
	public Criteria getProjectedCriteria(Session session) {
		Criteria c = getPlainCriteria(session);
		importProjection(c);
		return c;
	}

	/**
	 * method: getExecutableCriteria return the instance that includes full
	 * information
	 * 
	 * @param session
	 * @return
	 */
	public Criteria getExecutableCriteria(Session session) {
		Criteria result = getPlainCriteria(session);
		importOrders(result);
		importProjection(result);
		return result;
	}

	/**
	 * introduce the orderby information
	 * 
	 * @param criteria
	 * @return
	 */
	public Criteria importOrders(Criteria criteria) {
		for (Iterator i = orders.iterator(); i.hasNext();) {
			Order order = (Order) i.next();
			criteria.addOrder(order);
		}

		return criteria;
	}

	/**
	 * introduce the projection information
	 * 
	 * @param criteria
	 * @return
	 */
	public Criteria importProjection(Criteria criteria) {
		if (projection != null)
			criteria.setProjection(projection);
		return criteria;
	}

}
