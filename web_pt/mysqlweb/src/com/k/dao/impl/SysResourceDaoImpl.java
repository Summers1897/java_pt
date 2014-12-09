package com.k.dao.impl;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.k.dao.SysResourceDao;
import com.k.model.SysResource;
import com.k.util.core.hibernate.baseHibernate;
public class SysResourceDaoImpl extends baseHibernate implements SysResourceDao {
	@Override
	public List<SysResource> getSysResource() {
		return getTemplate().find(" from SysResource");
	}
}
