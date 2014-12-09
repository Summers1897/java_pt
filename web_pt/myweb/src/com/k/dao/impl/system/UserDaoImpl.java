package com.k.dao.impl.system;
import org.hibernate.Query;

import com.k.core.hibernate.BaseHibernate;
import com.k.dao.system.UserDao;
import com.k.model.User;
public class UserDaoImpl extends BaseHibernate implements UserDao {
	@Override
	public User getUserByNamePassword(String name, String Password) throws Exception {
		Query query =getSession().createQuery("from User t where t.usrLoginname=:name and t.usrLoginpwd=:password and t.usrIsvalid=1");
		query.setString("name", name);
		query.setString("password", Password);
		return (User) query.uniqueResult();
	}
	@Override
	public User getUserByName(String name) throws Exception {
		Query query = getSession().createQuery("from User t where t.usrLoginname=:name  and t.usrIsvalid=1");
		query.setString("name", name);
		return (User) query.uniqueResult();
	}
}
