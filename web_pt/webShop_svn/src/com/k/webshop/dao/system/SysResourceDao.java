package com.k.webshop.dao.system;
import java.util.List;

import com.k.webshop.model.SysResource;
public interface SysResourceDao {
	public List<SysResource> findSysResourceList() throws Exception;
}
