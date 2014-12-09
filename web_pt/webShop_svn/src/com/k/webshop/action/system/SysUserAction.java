package com.k.webshop.action.system;
import com.googlecode.jsonplugin.annotations.JSON;
import com.k.webshop.action.base.PaginationAction;
import com.k.webshop.model.SysUser;
import com.k.webshop.service.system.SysUserService;
import com.k.webshop.util.SystemAttributes;
public class SysUserAction extends PaginationAction {
	/**
	 * 1(成功/返回验证数目)
	 */
	private int flag;
	private String message;
	private String loginName;
	private String loginPwd;
	private String userType;
	private SysUser sysUser;
	private SysUserService sysUserService;
	public String login() {
		loginMethod();
		return SUCCESS;
	}
	public String loginAjax() {
		loginMethod();
		return "json";
	}
	private void loginMethod() {
		getSession().invalidate();
		try {
			sysUser = sysUserService.findSysUserByName(loginName, userType);
			if (sysUser != null) {
				if (sysUser.getUserLoginPwd().equals(loginPwd)) {
					getSession().put(SystemAttributes.LOGIN_USER, sysUser);
					flag = 1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public SysUserService getSysUserService() {
		return sysUserService;
	}
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@JSON(serialize = false)
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
}
