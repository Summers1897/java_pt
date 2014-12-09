package com.k.service.impl.system;
import java.util.ArrayList;
import java.util.List;

import com.k.dao.system.ResourceDao;
import com.k.service.system.ResourceService;
import com.k.vo.SysResourceVO;
public class ResourceServiceImpl implements ResourceService {
	private ResourceDao resourceDao;
	public ResourceDao getResourceDao() {
		return resourceDao;
	}
	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}
	/** ***************************************************************************************************** */
	@Override
	public List<SysResourceVO> getAllRes() throws Exception {
		return resourceDao.getAllRes();
	}
	@Override
	public List<SysResourceVO> getMysqlAllRes() throws Exception {
		List<SysResourceVO> relist=new ArrayList<SysResourceVO>();
		 
		List<SysResourceVO> l1=resourceDao.getResByParent("1", 2);
		List<SysResourceVO> l2=resourceDao.getResByParent("2", 3);
		relist.addAll(l1);
		relist.addAll(l2);
		
		return relist;
	}
}
