package com.k.core.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class BaseHibernate {
	public HibernateAgent agent = new HibernateAgent();
	public final void setSessionFactory(SessionFactory sessionFactory) {
		agent.setSessionFactory(sessionFactory);
	}
	public HibernateTemplate suport() {
		return agent.getHibernateTemplate();
	}
	public Long save(Object entity) {
		return (Long) suport().save(entity);
	}
	public void update(Object entity) {
		suport().update(entity);
	}
	public void delete(Object entity) {
		suport().delete(entity);
	}
	public Session getSession() {
		return agent.getSessionFactory().getCurrentSession();
	}
}
