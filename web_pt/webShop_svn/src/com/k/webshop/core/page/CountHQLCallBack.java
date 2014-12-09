package com.k.webshop.core.page;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.k.webshop.util.hibernate.QueryUtil;

public class CountHQLCallBack implements HibernateCallback {

	/** member: log field type: Log */
	public static Log log = LogFactory.getLog(CountHQLCallBack.class);

	/** member: hql field type: String */
	private String hql;

	/** member: removeOrderBy field type: boolean */
	private boolean removeOrderBy = true;

	private List values;

	/**
	 * constructor for class: CountHQLCallBack
	 * 
	 * @param hql
	 */
	public CountHQLCallBack(String hql) {
		this(hql, true, null);
	}

	public CountHQLCallBack(String hql, List values) {
		this(hql, true, values);
	}

	/**
	 * constructor for class: CountHQLCallBack
	 * 
	 * @param hql
	 * @param by
	 * @param values
	 */
	public CountHQLCallBack(String hql, boolean by, List values) {
		super();
		this.hql = hql;
		removeOrderBy = by;
		this.values = values;
	}

	/**
	 * method: doInHibernate
	 * 
	 * @param session
	 * @return Object
	 * @throws HibernateException
	 * @throws SQLException
	 * @date 2007-4-7
	 */
	public Object doInHibernate(Session session) throws HibernateException,
			SQLException {
		StringBuffer counthql = new StringBuffer("select count(*) from");
		// ȥ��OrderBy�����?
		if (removeOrderBy) {
			hql = removeOrderBy(hql);
		}
		// ƴ��SQL����һ��from�ؼ�����ǰ�Ĳ���ȥ��ƴ�Ӻ���Ĳ���?
		String[] hql_parts = hql.split("from");
		for (int i = 1; i < hql_parts.length; i++) {
			counthql.append(hql.split("from")[i]);
			if (i != hql_parts.length - 1)
				counthql.append("from");
		}
		log.debug("HQL is: " + counthql.toString());
		Query query = session.createQuery(counthql.toString());
		QueryUtil.pushValues(query, values);
		return query.uniqueResult();
	}

	/**
	 * method: removeOrderBy
	 * 
	 * @param hql
	 * @return String return type: String
	 */
	private String removeOrderBy(String hql) {
		String keyword = " order by ";
		StringBuffer buff = new StringBuffer();
		while (true) {
			int leadkey = hql.indexOf(keyword);
			if (leadkey > 0) {
				int tailkey = leadkey + keyword.length();
				int fieldend = hql.indexOf(")", tailkey);
				buff.append(hql.substring(0, leadkey));
				if (fieldend > -1) {
					buff.append(hql.substring(fieldend));
				}
			} else {
				buff.append(hql);
				break;
			}
		}

		return buff.toString();
	}
}
