package com.k.action.system;
import com.k.core.action.PaginationAction;
import com.k.model.User;
import com.k.service.system.UserService;
import com.k.util.SysAttr;
public class UserAction extends PaginationAction {
	public String flag;
	public String userName;
	public String userPassword;
	public UserService userService;
	public User user;
	public String login() {
		getSession().invalidate();
		String returnStr;
		try {
			if (user == null) {
				returnStr = "index";
			} else {
				user = userService.getUserByName(user.getUsrLoginname());
				if (user != null) {
					getSession().put(SysAttr.USER_lOGINNAME, user);
					flag = "1";
					returnStr = SUCCESS;
				} else {
					returnStr = "index";
					flag = "0";
				}
			}
		} catch (Exception e) {
			returnStr = "index";
			flag = returnStr;
			e.printStackTrace();
		}
		return returnStr;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
