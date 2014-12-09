package com.k.core.page;

import java.util.List;

public class Page {
	private int recoreTotalNo;
	private int recoreCurrentNo;
	private int pageTotalNo;
	private int pageCurrentNo;
	private List list;
	private int listFirst;
	private int listLast;
	private List subList;
	public int getRecoreTotalNo() {
		return recoreTotalNo;
	}
	public void setRecoreTotalNo(int recoreTotalNo) {
		this.recoreTotalNo = recoreTotalNo;
	}
	public int getRecoreCurrentNo() {
		return recoreCurrentNo;
	}
	public void setRecoreCurrentNo(int recoreCurrentNo) {
		this.recoreCurrentNo = recoreCurrentNo;
	}
	public int getPageTotalNo() {
		return pageTotalNo;
	}
	public void setPageTotalNo(int pageTotalNo) {
		this.pageTotalNo = pageTotalNo;
	}
	public int getPageCurrentNo() {
		return pageCurrentNo;
	}
	public void setPageCurrentNo(int pageCurrentNo) {
		this.pageCurrentNo = pageCurrentNo;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getListFirst() {
		return listFirst;
	}
	public void setListFirst(int listFirst) {
		this.listFirst = listFirst;
	}
	public int getListLast() {
		return listLast;
	}
	public void setListLast(int listLast) {
		this.listLast = listLast;
	}
	public List getSubList() {
		return subList;
	}
	public void setSubList(List subList) {
		this.subList = subList;
	}
	
	
}
