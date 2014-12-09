package com.k.webshop.core.page;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.k.webshop.util.hibernate.QueryUtil;
public class LocateHQLRecordsCallBack implements HibernateCallback {
	/** member: hql field type: String */
	private String hql;
	/** member: values field type: List */
	private List values;
	/** member: offset field type: int */
	private int offset;
	/** member: length field type: int */
	private int length;
	/**
	 * constructor for class: LocateHQLRecordsCallBack
	 * 
	 * @param hql
	 * @param offset
	 * @param length
	 */
	public LocateHQLRecordsCallBack(String hql, int offset, int length) {
		this(hql, offset, length, null);
	}
	public LocateHQLRecordsCallBack(String hql, int offset, int length, List values) {
		super();
		this.hql = hql;
		this.length = length;
		this.offset = offset;
		this.values = values;
	}
	/**
	 * method: doInHibernate
	 * 
	 * @param session
	 * @return
	 * @throws HibernateException
	 * @throws SQLException
	 * @date 2007-4-7
	 */
	public Object doInHibernate(Session session) throws HibernateException, SQLException {
		Query query = session.createQuery(hql);
		QueryUtil.pushValues(query, values);
		LocateResult(query, offset, length);
		return query.list();
	}
	/**
	 * method: LocateResult
	 * 
	 * @param query
	 * @param offset
	 * @param length
	 * @return return type: Query
	 */
	private Query LocateResult(Query query, int offset, int length) {
		query.setFirstResult(offset);
		query.setMaxResults(length);
		return query;
	}
	/**
	 * method: getHql
	 * 
	 * @return return type: String
	 */
	public String getHql() {
		return hql;
	}
	/**
	 * method: setHql
	 * 
	 * @param hql
	 *            return type: void
	 */
	public void setHql(String hql) {
		this.hql = hql;
	}
	/**
	 * method: getLength
	 * 
	 * @return return type: int
	 */
	public int getLength() {
		return length;
	}
	/**
	 * method: setLength
	 * 
	 * @param length
	 *            return type: void
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * method: getOffset
	 * 
	 * @return return type: int
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * method: setOffset
	 * 
	 * @param offset
	 *            return type: void
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
