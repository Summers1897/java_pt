package com.k.dao.system;

import java.util.List;

import com.k.core.action.page.Page;
import com.k.model.Logger;

public interface LoggerDao {
	public List<Logger> getAllList(Page page)throws Exception;
}
