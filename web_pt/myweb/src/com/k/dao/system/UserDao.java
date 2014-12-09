package com.k.dao.system;

import com.k.model.User;


public interface UserDao {
	public User getUserByNamePassword(String name, String Password) throws Exception;
	public User getUserByName(String name) throws Exception;
}
