package com.k.dao.system;
import java.util.List;

import com.k.vo.SysResourceVO;
public interface ResourceDao {
	public List<SysResourceVO> getAllRes() throws Exception;
	public List<SysResourceVO> getMysqlAllRes() throws Exception;
	public SysResourceVO getRootRes() throws Exception;
	public List<SysResourceVO> getResByParent(String par,int level) throws Exception;
}
