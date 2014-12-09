package com.k.dao.impl.system;
import java.util.List;

import org.hibernate.Query;

import com.k.core.action.page.Page;
import com.k.core.hibernate.BaseHibernate;
import com.k.dao.system.LoggerDao;
import com.k.model.Logger;
public class LoggerDaoImpl extends BaseHibernate implements LoggerDao {
	@Override
	public List<Logger> getAllList(Page page) throws Exception {
		Query query = getSession().createQuery("from Logger");
		 
		query.setMaxResults(page.getMaxNo());
		query.setFirstResult(page.getFirst());
		return query.list();
	}
}
