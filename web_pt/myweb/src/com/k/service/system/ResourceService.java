package com.k.service.system;
import java.util.List;

import com.k.vo.SysResourceVO;
public interface ResourceService {
	public List<SysResourceVO> getAllRes() throws Exception;
	public List<SysResourceVO> getMysqlAllRes() throws Exception;
}
