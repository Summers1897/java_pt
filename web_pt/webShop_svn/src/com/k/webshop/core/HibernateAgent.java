package com.k.webshop.core;

import org.hibernate.Criteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.k.webshop.core.criteria.OfflineCriteria;

public class HibernateAgent extends HibernateDaoSupport {
	protected Criteria createCriteria(Class clazz) {
		return getSession().createCriteria(clazz);
	}

	protected Criteria createPlainCriteria(OfflineCriteria c) {
		return c.getPlainCriteria(getSession());
	}

	protected Criteria createExecutableCriteria(OfflineCriteria c) {
		return c.getExecutableCriteria(getSession());
	}

	protected Criteria createOrderedCriteria(OfflineCriteria c) {
		return c.getOrderedCriteria(getSession());
	}

	protected Criteria createProjectedCriteria(OfflineCriteria c) {
		return c.getProjectedCriteria(getSession());
	}
}
