package com.k.webshop.dao.system;
import java.util.List;

import com.k.webshop.model.SysUser;
public interface SysUserDao {
	public SysUser findSysUserById(String id) throws Exception;
	public SysUser findSysUserByName(String name, String type) throws Exception;
	public void insert(SysUser sysUser);
	public void update(SysUser sysUser);
	public List<SysUser> findSysUserList(String name, String type) throws Exception;
}
