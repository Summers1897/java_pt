package com.k.webshop.util.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

public class CriteriaUtil {

	public static Criteria createCriteria(Session session, Class entityType,
			Criterion[] criterions) {
		Criteria criteria = session.createCriteria(entityType);
		if (criterions == null) {
			return criteria;
		}
		// 循环遍历添加约束条件
		for (int i = 0; i < criterions.length; i++) {
			if (criterions[i] != null)
				criteria.add(criterions[i]);
		}
		return criteria;
	}

	public static Criteria wrapOrderBy(Criteria c, Order[] orders) {
		// 循环遍历添加约束条件
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null)
				c.addOrder(orders[i]);
		}
		return c;
	}

	public static Criteria LocateResult(Criteria criteria, int offset,
			int length) {
		criteria.setFirstResult(offset);
		criteria.setMaxResults(length);
		return criteria;
	}
}
