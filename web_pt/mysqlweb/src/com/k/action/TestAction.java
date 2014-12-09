package com.k.action;
import java.util.ArrayList;
import java.util.List;

import com.k.service.SysResourceService;
import com.k.util.core.action.pageAction;
public class TestAction extends pageAction {
	private List list;
	private SysResourceService sysResourceService;
	public String test() {
		list = sysResourceService.getSysResource();
		System.out.println(list.size());
		getPage().setList(list);
		return SUCCESS;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setSysResourceService(SysResourceService sysResourceService) {
		this.sysResourceService = sysResourceService;
	}
}
