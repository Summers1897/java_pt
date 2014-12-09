package com.k.service.impl.system;
import java.util.List;

import com.k.core.action.page.Page;
import com.k.dao.system.LoggerDao;
import com.k.model.Logger;
import com.k.service.system.LoggerService;
public class LoggerServiceImpl implements LoggerService {
	private LoggerDao loggerDao;
	public LoggerDao getLoggerDao() {
		return loggerDao;
	}
	public void setLoggerDao(LoggerDao loggerDao) {
		this.loggerDao = loggerDao;
	}
	/***************************************************/
	@Override
	public List<Logger> getAllList(Page page) throws Exception {
		return loggerDao.getAllList( page);
	}
}
