package com.k.webshop.core.hql;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.k.webshop.util.hibernate.QueryUtil;

public class HQLCallBack implements HibernateCallback {

	private String hql;

	private List values;

	public HQLCallBack(String hql, List values) {
		this.hql = hql;
		this.values = values;
	}

	public Object doInHibernate(Session session) throws HibernateException,
			SQLException {
		Query query = session.createQuery(hql);
		QueryUtil.pushValues(query, values);

		return query.list();
	}
}
