package com.k.webshop.service.system.impl;
import java.util.List;

import com.k.webshop.dao.system.SysResourceDao;
import com.k.webshop.model.SysResource;
import com.k.webshop.service.system.SysResourceService;
public class SysResourceServiceImpl implements SysResourceService {
	private SysResourceDao sysResourceDao;
	public SysResourceDao getSysResourceDao() {
		return sysResourceDao;
	}
	public void setSysResourceDao(SysResourceDao sysResourceDao) {
		this.sysResourceDao = sysResourceDao;
	}
	/** ************************************* */
	@Override
	public List<SysResource> findSysResourceList() throws Exception {
		return sysResourceDao.findSysResourceList();
	}
}
