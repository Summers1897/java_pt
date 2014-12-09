package com.k.core.page;
import java.util.List;
public class Page {
	private int totalNo; // 总共的记录数
	private int maxNo; // 一页中显示的记录数
	private int totalPageNo; // 总共的页数
	private int currentPageNo; // 当前页码
	private int currentRecNo; // 当前页第一条记录码
	private List lst;// 存放列表
	private int totalRecNo;
	public int getTotalRecNo() {
		return totalRecNo;
	}
	public Page() {
		maxNo = PageConfig.PAGEEVERYNO; // 默认是一页分10行
		currentPageNo = 1;
	}
	/**
	 * constructor for class: Page
	 * 
	 * @param maxNo
	 */
	public Page(int maxNo) {
		this.maxNo = maxNo;
		currentPageNo = 1;
	}
	/**
	 * constructor for class: Page
	 * 
	 * @param maxNo
	 * @param totalPage
	 * @param currentPageNo
	 * @param currentRecordNo
	 */
	public Page(int maxNo, int totalPage, int currentPageNo, int currentRecordNo) {
		this.maxNo = maxNo;
		this.totalPageNo = totalPage;
		this.currentPageNo = currentPageNo;
		this.currentRecNo = currentRecordNo;
	}
	/**
	 * 获得当前页码
	 * 
	 * @return
	 */
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	/**
	 * 获得每页多大记录数
	 * 
	 * @return
	 */
	public int getMaxNo() {
		return maxNo;
	}
	/**
	 * 获得所有页数
	 * 
	 * @return
	 */
	public int getTotalPageNo() {
		return totalPageNo;
	}
	/**
	 * 设置当前页码 并且自动更新当前 页码第一条记录和最后一条记录
	 * 
	 * @param i
	 */
	public void setCurrentPageNo(int i) {
		currentPageNo = i;
	}
	/**
	 * 设置最一页最大记录数
	 * 
	 * @param i
	 */
	public void setMaxNo(int i) {
		maxNo = i;
	}
	/**
	 * 设置所有页数
	 * 
	 * @param i
	 */
	public void setTotalPageNo(int i) {
		totalPageNo = i;
	}
	/**
	 * 获得当前页数据
	 * 
	 * @return
	 */
	public List getLst() {
		return lst;
	}
	/**
	 * 设置当前页数据
	 * 
	 * @param list
	 */
	public void setLst(List list) {
		this.lst = list;
	}
	/**
	 * 获得当前页面总记录数
	 * 
	 * @return
	 */
	public int getCurrentPageRecords() {
		return lst == null ? 0 : (lst.size());
	}
	/**
	 * 设置总记录数,并且自动更新总页数
	 * 
	 * @param i
	 */
	public void setTotalRecNo(int i) {
		totalRecNo = i;
		if ((i - (i / maxNo) * maxNo) > 0) // 检查总记录数是否是maxNo的整数倍，如果是则不再加一页。
			totalPageNo = i / maxNo + 1;
		else
			totalPageNo = i / maxNo;
	}
	public int getCurrentRecNo() {
		return currentRecNo;
	}
	public void setCurrentRecNo(int i) {
		currentRecNo = i;
	}
	public int getTotalNo() {
		return totalNo;
	}
	public void setTotalNo(int totalNo) {
		this.totalNo = totalNo;
	}
}
