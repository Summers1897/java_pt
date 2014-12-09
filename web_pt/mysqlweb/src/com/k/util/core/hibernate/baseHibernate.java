package com.k.util.core.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class baseHibernate {
	private HibernateAssist assist=new HibernateAssist();;
	public Object getObject(Class c, Long id) {
		return getTemplate().get(c, id);
	}
	public void updateObject(Class c, Object o) {
		getTemplate().update(c.getName(), o);
	}
	public Long insertObject(Class c, Object o) {
		return (Long) getTemplate().save(c.getName(), o);
	}
	public void deleteObject(Class c, Object o) {
		getTemplate().delete(c.getName(), o);
	}
	public void deleteAllObject(List list) {
		getTemplate().deleteAll(list);
	}
	public HibernateTemplate getTemplate() {
		return assist.getHibernateTemplate();
	}
	public HibernateAssist getAssist() {
		return assist;
	}
	public Session getSession() {
		return assist.getSessionFactory().getCurrentSession();
	}
	public final void setSessionFactory(SessionFactory sessionFactory) {
		assist.setSessionFactory(sessionFactory);
	}
	 
}