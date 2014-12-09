package com.k.webshop.dao.system.impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.k.webshop.core.BaseHibernate;
import com.k.webshop.dao.system.SysUserDao;
import com.k.webshop.model.SysUser;
public class SysUserDaoImpl extends BaseHibernate implements SysUserDao {
	@Override
	public SysUser findSysUserById(String id) throws Exception {
		StringBuffer hql = new StringBuffer("from SysUser t where t.id=" + id + " and t.isValid=1 ");
		Session session = supportSession();
		Query query = session.createQuery(hql.toString());
		return (SysUser) query.uniqueResult();
	}
	@Override
	public SysUser findSysUserByName(String name, String type) throws Exception {
		StringBuffer hql = new StringBuffer("from SysUser t where t.userLoginName=" + name + " and t.isValid=1 ");
		if (type != null && !"".equals(type)) {
			hql.append(" and t.userType=" + type);
		}
		Session session = supportSession();
		Query query = session.createQuery(hql.toString());
		return (SysUser) query.uniqueResult();
	}
	@Override
	public List<SysUser> findSysUserList(String name, String type) throws Exception {
		StringBuffer hql = new StringBuffer("from SysUser t where t.userLoginName like '%" + name + "%' and t.isValid=1 ");
		if (type != null && !"".equals(type)) {
			hql.append(" and t.userType=" + type);
		}
		hql.append(" order by t.orderBy");
		Session session = supportSession();
		Query query = session.createQuery(hql.toString());
		return query.list();
	}
	@Override
	public void insert(SysUser sysUser) {
		support().save(sysUser);
	}
	@Override
	public void update(SysUser sysUser) {
		support().update(sysUser);
	}
}
