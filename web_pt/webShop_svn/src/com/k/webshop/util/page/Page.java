package com.k.webshop.util.page;

import java.util.List;

import org.hibernate.criterion.Order;
import com.k.webshop.util.SystemAttributes;

public class Page {

	private boolean lockPage = false;

	/** member: totalNo field type: int */
	private int totalNo; // 总共的记录数

	/** member: maxNo field type: int */
	private int maxNo; // 一页中显示的记录数

	/** member: totalPageNo field type: int */
	private int totalPageNo; // 总共的页数

	/** member: currentPageNo field type: int */
	private int currentPageNo; // 当前页码

	/** member: currentRecNo field type: int */
	private int currentRecNo; // 当前页第一条记录码

	/** member: orderName field type: String */
	private String orderName; // 当前排序的字段名称

	/** member: orderValue field type: String */
	private String orderValue; // 排序的值（升序or降序or不排）

	/** member: lst field type: List */
	private List lst;

	/** member: totalRecNo field type: int */
	private int totalRecNo;

	/**
	 * method: getTotalRecNo
	 * 
	 * @return return type: int
	 */
	public int getTotalRecNo() {
		return totalRecNo;
	}

	/**
	 * constructor for class: Page
	 */
	public Page() {
		maxNo = SystemAttributes.PAGE_MAX_NO; // 默认是一页分10行
		orderName = "";
		orderValue = "";
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

	/**
	 * 获得当前页第一条记录码
	 * 
	 * @return
	 */
	public int getCurrentRecNo() {
		return currentRecNo;
	}

	/**
	 * 设置当前页第一条记录码
	 * 
	 * @param i
	 */
	public void setCurrentRecNo(int i) {
		currentRecNo = i;
	}

	/**
	 * 获得排序字段名
	 * 
	 * @return
	 */
	public String getOrderName() {
		return orderName;
	}

	/**
	 * 设置排序字段名
	 * 
	 * @param string
	 */
	public void setOrderName(String string) {
		orderName = string;
	}

	/**
	 * 获得排序顺序 升序or降序
	 * 
	 * @return
	 */
	public String getOrderValue() {
		return orderValue;
	}

	/**
	 * 设置排序顺序 升序or降序
	 * 
	 * @param string
	 */
	public void setOrderValue(String string) {
		string = string.trim();
		if (string.equals("") || string.equals("asc") || string.equals("desc")) {
			orderValue = string;
		} else {
			orderValue = "";
		}
	}


	/**
	 * method: getOrder
	 * 
	 * @return return type: Order
	 */
	public Order getOrder() {
		Order order = null;
		if (orderName != null && orderName.length() > 0) {
			if (orderValue != null) {
				if (orderValue.equals("") || orderValue.equals("asc"))
					order = Order.asc(orderName);
				else if (orderValue.equals("desc"))
					order = Order.desc(orderName);
			}
		}
		return order;
	}

	/**
	 * method: getTotalNo
	 * 
	 * @return return type: int
	 */
	public int getTotalNo() {
		return totalNo;
	}

	/**
	 * method: setTotalNo
	 * 
	 * @param totalNo
	 *            return type: void
	 */
	public void setTotalNo(int totalNo) {
		this.totalNo = totalNo;
	}

	public boolean isLockPage() {
		return lockPage;
	}

	public void setLockPage(boolean lockPage) {
		this.lockPage = lockPage;
	}


}
