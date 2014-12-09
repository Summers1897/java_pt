package com.k.webshop.util.hibernate;

import java.util.List;

import org.hibernate.Query;

public class QueryUtil {

	public static void pushValues(Query query, List values) {
		if (values != null && values.size() > 0) {
			for (int i = 0; i < values.size(); i++) {
				query.setParameter(i , values.get(i));
			}
		}
	}
}
