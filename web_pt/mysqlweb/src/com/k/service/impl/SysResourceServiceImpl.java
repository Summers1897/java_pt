package com.k.service.impl;
import java.util.List;

import com.k.dao.SysResourceDao;
import com.k.model.SysResource;
import com.k.service.SysResourceService;
 
public class SysResourceServiceImpl implements SysResourceService {
	private SysResourceDao sysResourceDao;
	@Override
	public List<SysResource> getSysResource() {
		return sysResourceDao.getSysResource();
	}
	public SysResourceDao getSysResourceDao() {
		return sysResourceDao;
	}
	public void setSysResourceDao(SysResourceDao sysResourceDao) {
		this.sysResourceDao = sysResourceDao;
	}
}
