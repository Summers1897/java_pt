package com.k.core.action.page;
import java.util.ArrayList;
import java.util.List;

import com.k.util.SysAttr;
public class Page {
	/**
	 * 最大记录数(0,n)
	 */
	private int totalNo;
	/**
	 * 一页显示记录数(1,n)
	 */
	private int maxNo = 20;
	/**
	 * 当前页数(1,n)
	 */
	private int currentPage = 1;
	/**
	 * 总页数(o,n)
	 */
	private int totalPage;
	/**
	 * 存放查询到的list
	 */
	private List list ;
	/**
	 * 显示开始位置(0,n-1)
	 */
	private int first;
	public int getFirst() {
		return getMaxNo() * (getCurrentPage() - 1);
	}
	 
	/**
	 * @return 得到总数
	 */
	public int getTotalNo() {
		return totalNo;
	}
	public int getMaxNo() {
		return maxNo;
	}
	public void setMaxNo(int maxNo) {
		this.maxNo = maxNo;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		if (currentPage < 1) {
			currentPage = SysAttr.PAGE_MAXNO;
		}
		this.currentPage = currentPage;
	}
	/**
	 * @return得到总页数
	 */
	public int getTotalPage() {
		if (getTotalNo() % getMaxNo() == 0) {
			totalPage = getTotalNo() % getMaxNo();
		} else {
			totalPage = getTotalNo() % getMaxNo() + 1;
		}
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
}
