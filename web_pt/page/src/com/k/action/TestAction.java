package com.k.action;
import java.util.List;

import com.k.core.action.PaginationAction;
public class TestAction extends PaginationAction {
	public List list;
	public String test() {
		for(int i=0;i<20;i++){
			list.add(i);
		}
		setPage(getPage(), list);
		return SUCCESS;
	}
}
