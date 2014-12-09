package com.k.webshop.dao.system.impl;
import java.util.List;

import com.k.webshop.core.BaseHibernate;
import com.k.webshop.dao.system.SysResourceDao;
import com.k.webshop.model.SysResource;
public class SysResourceDaoImpl extends BaseHibernate implements SysResourceDao {
	@Override
	public List<SysResource> findSysResourceList() throws Exception {
		return support().find("from SysResource");
	}
}
