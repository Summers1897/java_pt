package com.k.service.impl.system;
import com.k.dao.system.UserDao;
import com.k.model.User;
import com.k.service.system.UserService;
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public User getUserByNamePassword(String name, String Password) throws Exception {
		return userDao.getUserByNamePassword(name, Password);
	}
	@Override
	public User getUserByName(String name) throws Exception {
		return userDao.getUserByName(name);
	}
	/** ************************************************************* */
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
