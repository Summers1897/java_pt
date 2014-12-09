package com.k.webshop.core;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.k.webshop.core.criteria.OfflineCriteria;
import com.k.webshop.core.hql.HQLCallBack;
import com.k.webshop.core.page.CountHQLCallBack;
import com.k.webshop.core.page.LocateHQLRecordsCallBack;
import com.k.webshop.util.page.Page;
import com.k.webshop.util.page.PageFactory;
public class BaseHibernate {
	public void deleteall(List list) throws Exception {
		deleteAll(list);
	}
	public List getListById(String id, String fieldName, Class clazz) throws Exception {
		final String tableFieldName = fieldName;
		final String tableid = id;
		final Class ObjectClass = clazz;
		List ObjectList = (List) support().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				List list = session.createCriteria(ObjectClass).add(Restrictions.eq(tableFieldName, tableid)).list();
				return list;
			}
		});
		return ObjectList;
	}
	public List findByCriteria(OfflineCriteria oc) throws Exception {
		return agent.getHibernateTemplate().findByCriteria(oc);
	}
	public List findByHQL(String hql, Object[] param) throws Exception {
		List list = support().find(hql, param);
		return list;
	}
	protected HibernateAgent agent = new HibernateAgent();
	protected static Log log = LogFactory.getLog(BaseHibernate.class);
	/**
	 * findByHQL
	 * 
	 * @param
	 * @return List
	 * @throws Exception
	 */
	public List findByHQL(String hql) {
		return support().find(hql);
	}
	public final void setSessionFactory(SessionFactory sessionFactory) {
		agent.setSessionFactory(sessionFactory);
	}
	/**
	 * method: createCriteria
	 * 
	 * @param clazz
	 * @return
	 * @date 2007-4-23
	 */
	protected Criteria createCriteria(Class clazz) {
		return agent.createCriteria(clazz);
	}
	/**
	 * Ϊ����д�����?method: support
	 * 
	 * @return return type: HibernateTemplate
	 */
	protected HibernateTemplate support() {
		return agent.getHibernateTemplate();
	}
	protected Session supportSession() {
		return agent.getSessionFactory().getCurrentSession();
	}
	/**
	 * judging if the field is worthy of wraping into a query field method:
	 * isMeaningful
	 * 
	 * @param string
	 * @return return type: boolean
	 */
	protected boolean isMeaningful(String string) {
		return string != null && string.length() > 0;
	}
	protected boolean isMeaningful(Long tempID) {
		return tempID != null;
	}
	protected String getLikeStr(String string) {
		return getLikeStr(string, true, true);
	}
	protected String getLikeStr(String string, boolean front, boolean back) {
		StringBuffer buffer = new StringBuffer();
		if (front) {
			buffer.append("%");
		}
		buffer.append(string);
		if (back) {
			buffer.append("%");
		}
		return buffer.toString();
	}
	protected String getLikeAfterStr(String string) {
		return getLikeAfterStr(string, false, true);
	}
	protected String getLikeAfterStr(String string, boolean front, boolean back) {
		StringBuffer buffer = new StringBuffer();
		if (front) {
			buffer.append("%");
		}
		buffer.append(string);
		if (back) {
			buffer.append("%");
		}
		return buffer.toString();
	}
	/**
	 * method: get
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 * @date 2007-4-23
	 */
	public Object get(Class clazz, Serializable id) {
		// return agent.getHibernateTemplate().load(clazz, id);
		// ��get�������Ա����ӳټ���
		return agent.getHibernateTemplate().get(clazz, id);
	}
	/**
	 * method: getLocatedRecords
	 * 
	 * @param hql
	 * @param values
	 * @param offset
	 * @param length
	 * @return return type: List
	 */
	private List getLocatedRecords(String hql, List values, int offset, int length) {
		HibernateCallback callback = new LocateHQLRecordsCallBack(hql, offset, length, values);
		List list = agent.getHibernateTemplate().executeFind(callback);
		return list;
	}
	private int getTotalNoByHQL(String hql, List values) {
		return getTotalNoByHQL(hql, values, true);
	}
	private int getTotalNoByHQL(String hql, List values, boolean removeOrderby) {
		HibernateCallback callback = new CountHQLCallBack(hql, removeOrderby, values);
		Integer count = (Integer) agent.getHibernateTemplate().execute(callback);
		return count.intValue();
	}
	/**
	 * method: getPage
	 * 
	 * @param rdc
	 * @param page
	 * @return
	 * @date 2007-4-23
	 */
	protected Page getPage(OfflineCriteria rdc, Page page) {
		int total = getTotalNo(rdc);
		page = PageFactory.createPage(page, total);
		int offset = page.getCurrentRecNo();
		int length = page.getMaxNo();
		Order[] orders = new Order[]{page.getOrder()};
		List result = getLocatedRecords(orders, rdc, offset, length);
		page.setLst(result);
		return page;
	}
	/**
	 * 
	 * @param rdc
	 * @param page
	 * @return
	 */
	protected Page getPageByBank(String sql, OfflineCriteria rdc, Page page) {
		int total = getTotalNoBySql(sql);
		page = PageFactory.createPage(page, total);
		int offset = page.getCurrentRecNo();
		int length = page.getMaxNo();
		Order[] orders = new Order[]{page.getOrder()};
		List result = getLocatedRecords(orders, rdc, offset, length);
		page.setLst(result);
		return page;
	}
	private int getTotalNoBySql(String sql) {
		return agent.getSessionFactory().getCurrentSession().createSQLQuery(sql).list().size();
	}
	private List getLocatedRecords(Order[] orders, OfflineCriteria c, int offset, int length) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null) {
				c.addOrder(orders[i]);
			}
		}
		return agent.getHibernateTemplate().findByCriteria(c, offset, length);
	}
	private int getTotalNo(OfflineCriteria c) {
		Criteria cr = agent.createPlainCriteria(c);
		return getTotalNo(cr);
	}
	private int getTotalNo(Criteria c) {
		c.setProjection(Projections.rowCount());
		Integer count = (Integer) c.uniqueResult();
		return count.intValue();
	}
	/**
	 * method: getPageByHQL
	 * 
	 * @param hql
	 * @param page
	 * @return
	 * @date 2007-4-23
	 */
	protected Page getPageByHQL(String hql, Page page) {
		return getPageByHQL(hql, null, page);
	}
	/**
	 * method: getPageByHQL
	 * 
	 * @param hql
	 * @param values
	 * @param page
	 * @return
	 * @date 2007-4-23
	 */
	protected Page getPageByHQL(String hql, List values, Page page) {
		int total = getTotalNoByHQL(hql, values);
		page = PageFactory.createPage(page, total);
		int offset = page.getCurrentRecNo();
		int length = page.getMaxNo();
		List result = getLocatedRecords(hql, values, offset, length);
		page.setTotalNo(total);
		page.setLst(result);
		return page;
	}
	/**
	 * method: insert
	 * 
	 * @param entity
	 * @return
	 * @date 2007-4-23
	 */
	public Serializable insert(Object entity) {
		return agent.getHibernateTemplate().save(entity);
	}
	/**
	 * method: saveOrUpdate
	 * 
	 * @param entity
	 * @date 2007-4-23
	 */
	public void saveOrUpdate(Object entity) {
		agent.getHibernateTemplate().saveOrUpdate(entity);
	}
	public void merg(Object entity) {
		agent.getHibernateTemplate().merge(entity);
	}
	/**
	 * method: delete
	 * 
	 * @param entity
	 * @date 2007-4-23
	 */
	public void delete(Object entity) {
		agent.getHibernateTemplate().delete(entity);
	}
	/**
	 * method: deleteById
	 * 
	 * @param clazz
	 * @param id
	 * @date 2007-4-23
	 */
	public void deleteById(Class clazz, Serializable id) {
		delete(get(clazz, id));
	}
	/**
	 * method: deleteAll
	 * 
	 * @param entities
	 * @date 2007-4-23
	 */
	protected void deleteAll(List entities) {
		agent.getHibernateTemplate().deleteAll(entities);
	}
	/**
	 * method: list
	 * 
	 * @param entity
	 * @return
	 * @date 2007-4-23
	 */
	protected List list(Object entity) {
		return agent.getHibernateTemplate().findByExample(entity);
	}
	/**
	 * method: getAll
	 * 
	 * @param clazz
	 * @return
	 * @date 2007-4-23
	 */
	protected List getAll(Class clazz) {
		return agent.getHibernateTemplate().loadAll(clazz);
	}
	/**
	 * method: list
	 * 
	 * @param criteria
	 * @return
	 * @date 2007-4-23
	 */
	protected List list(DetachedCriteria criteria) {
		return agent.getHibernateTemplate().findByCriteria(criteria);
	}
	/**
	 * method: list
	 * 
	 * @param hql
	 * @return
	 * @date 2007-4-23
	 */
	protected List list(String hql) {
		return agent.getHibernateTemplate().find(hql);
	}
	protected List list(String hql, Object arg1) {
		return agent.getHibernateTemplate().find(hql, arg1);
	}
	protected List list(String hql, Object[] arg1) {
		return agent.getHibernateTemplate().find(hql, arg1);
	}
	/**
	 * method: executeUpdate
	 * 
	 * @param hql
	 * @return
	 * @date 2007-4-23
	 */
	public long executeUpdate(String hql) {
		return executeUpdate(hql, null);
	}
	/**
	 * method: executeUpdate
	 * 
	 * @param hql
	 * @param values
	 * @return
	 * @date 2007-4-23
	 */
	public long executeUpdate(String hql, List values) {
		HibernateCallback callback = new HQLCallBack(hql, values);
		Integer result = (Integer) agent.getHibernateTemplate().execute(callback);
		return result.longValue();
	}
	/**
	 * method: getSize
	 * 
	 * @param rdc
	 * @return
	 * @date 2007-4-23
	 */
	protected long getSize(OfflineCriteria rdc) {
		return getTotalNo(rdc);
	}
	/**
	 * method: getSize
	 * 
	 * @param hql
	 * @param values
	 * @return
	 * @date 2007-4-23
	 */
	protected long getSize(String hql, List values) {
		return getTotalNoByHQL(hql, values);
	}
	/**
	 * method: getSize
	 * 
	 * @param hql
	 * @return
	 * @date 2007-4-23
	 */
	protected long getSize(String hql) {
		return getTotalNoByHQL(hql, null);
	}
	// 查询某维度下的所有记�?
	public List getRecordByDimension(String tableName, String orderby) {
		String hql = "from " + tableName.trim() + " table order by " + orderby;
		List result = support().getSessionFactory().getCurrentSession().createQuery(hql).list();
		return result;
	}
	@SuppressWarnings("unchecked")
	public Page getPageByList(ArrayList dataList, Page page) throws Exception {
		page = PageFactory.createPage(page, dataList.size());
		int offset = page.getCurrentRecNo();
		int length = page.getMaxNo();
		ArrayList viewList = new ArrayList();
		int maxNum = 0;
		if (offset + length > dataList.size()) {
			maxNum = dataList.size();
		} else {
			maxNum = offset + length;
		}
		for (int i = offset; i < maxNum; i++) {
			viewList.add(dataList.get(i));
		}
		page.setLst(viewList);
		return page;
	}
}
