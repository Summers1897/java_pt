package com.k.service.system;
import com.k.model.User;
public interface UserService {
	public User getUserByNamePassword(String name, String Password) throws Exception;
	public User getUserByName(String name) throws Exception;
}
