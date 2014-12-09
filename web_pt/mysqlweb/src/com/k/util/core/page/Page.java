package com.k.util.core.page;
import java.util.ArrayList;
import java.util.List;

import com.k.util.SysAttr;
public class Page {
	private String startButton = "[首页]";
	private String upButton = "[上一页]";
	private String dowmButton = "[下一页]";
	private String endButton = "[末页]";
	/**
	 * 当前显示数
	 */
	private int pageItemNo = SysAttr.PAGE_NUM;
	private String jumpButton = "[转]";
	private List list;
	/**
	 * 当前页数
	 */
	private int currentNum;
	private int totalNum;
	public String getStartButton() {
		return startButton;
	}
	public void setStartButton(String startButton) {
		this.startButton = startButton;
	}
	public String getUpButton() {
		return upButton;
	}
	public void setUpButton(String upButton) {
		this.upButton = upButton;
	}
	public String getDowmButton() {
		return dowmButton;
	}
	public void setDowmButton(String dowmButton) {
		this.dowmButton = dowmButton;
	}
	public String getEndButton() {
		return endButton;
	}
	public void setEndButton(String endButton) {
		this.endButton = endButton;
	}
	public int getPageItemNo() {
		return pageItemNo;
	}
	public void setPageItemNo(int pageItemNo) {
		this.pageItemNo = pageItemNo;
	}
	public String getJumpButton() {
		return jumpButton;
	}
	public void setJumpButton(String jumpButton) {
		this.jumpButton = jumpButton;
	}
	public List getList() {
		if (list != null) {
			if (currentNum * pageItemNo < list.size()) {
				currentNum = 1;
			}
			list = list.subList(currentNum * (pageItemNo - 1), currentNum * (pageItemNo) - 1);
		} else {
			list = new ArrayList();
		}
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public int getCurrentNum() {
		return currentNum == 0 ? 1 : currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	public int getTotalNum() {
		return list.size();
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
}
