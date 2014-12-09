package com.k.webshop.service.system.impl;
import java.util.List;

import com.k.webshop.dao.system.SysUserDao;
import com.k.webshop.model.SysUser;
import com.k.webshop.service.system.SysUserService;
public class SysUserServiceImpl implements SysUserService {
	private SysUserDao sysUserDao;
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	/** ******************************************************************** */
	@Override
	public SysUser findSysUserById(String id) throws Exception {
		return sysUserDao.findSysUserById(id);
	}
	@Override
	public SysUser findSysUserByName(String name, String type) throws Exception {
		return sysUserDao.findSysUserByName(name, type);
	}
	@Override
	public List<SysUser> findSysUserList(String name, String type) throws Exception {
		return sysUserDao.findSysUserList(name, type);
	}
	@Override
	public void insert(SysUser sysUser) {
		sysUserDao.insert(sysUser);
	}
	@Override
	public void update(SysUser sysUser) {
		sysUserDao.update(sysUser);
	}
}
