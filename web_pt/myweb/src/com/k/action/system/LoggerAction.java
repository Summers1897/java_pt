package com.k.action.system;
import java.util.List;

import com.k.core.action.PaginationAction;
import com.k.model.Logger;
import com.k.service.system.LoggerService;
public class LoggerAction extends PaginationAction {
	public List<Logger> list;
	private LoggerService loggerService;
	public String list() throws Exception {
		loggerService.getAllList(getPage());
		return SUCCESS;
	}
	public List<Logger> getList() {
		return list;
	}
	public void setList(List<Logger> list) {
		this.list = list;
	}
	public void setLoggerService(LoggerService loggerService) {
		this.loggerService = loggerService;
	}
}
