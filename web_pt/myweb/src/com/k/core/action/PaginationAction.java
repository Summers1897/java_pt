package com.k.core.action;
import java.util.List;

import com.k.core.action.page.Page;
import com.k.core.action.page.PageComponent;
public class PaginationAction extends BaseAction {
	private Page page = new Page();
	/**
	 * 首页----末页
	 */
	private String pageSkipFunction = "go_page";
	/**
	 * 分页_改变每页个数
	 * 
	 */
	private String pageGoFunction = "go_go";
	/**
	 * 提交单form
	 */
	public String targetForm = "forms[0]";
	PageComponent currentPage = new PageComponent("pageCurrent", "button", "", "cssclass", "", "");
	PageComponent goButton = new PageComponent("pagepre", "button", "", "cssclass", pageGoFunction + "(" + 0 + ")", "转");
	PageComponent index = new PageComponent("pageindex", "button", "", "cssclass", pageSkipFunction + "(" + 1 + ")", "首页");
	PageComponent pre = new PageComponent("pagepre", "button", "", "cssclass", pageSkipFunction + "(" + 2 + ")", "上页");
	PageComponent next = new PageComponent("pagenext", "button", "", "cssclass", pageSkipFunction + "(" + 3 + ")", "下页");
	PageComponent last = new PageComponent("pagelast", "button", "", "cssclass", pageSkipFunction + "(" + 4 + ")", "末页");
	PageComponent MaxNoHi = new PageComponent("page.maxNo", "hidden", "page.maxNo", page.getMaxNo() + "");
	PageComponent currentPageHi = new PageComponent("page.currentPage", "hidden", "page.currentPage", page.getCurrentPage() + "");
	PageComponent totalPageHi = new PageComponent("page.totalPage", "hidden", "page.totalPage", page.getTotalPage() + "");
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	 
	public String outputBarArgs() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(pageArgs());
		buffer.append(pageBar());
		return buffer.toString();
	}
	public String pageArgs() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(MaxNoHi);
		buffer.append(currentPageHi);
		buffer.append(totalPageHi);
		return buffer.toString();
	}
	public String pageBar() {
		StringBuffer buffer = new StringBuffer();
		try {
			buffer.append("&nbsp;&nbsp;<label id='' class=''> ");
			buffer.append(page.getCurrentPage());
			buffer.append("/");
			buffer.append(page.getTotalPage());
			buffer.append(" </label>");
			buffer.append(currentPage);
			buffer.append(goButton);
			buffer.append(index);
			buffer.append(pre);
			buffer.append(next);
			buffer.append(last);
			System.out.println(buffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
	public String outputJS() {
		StringBuffer buffer = new StringBuffer("<script type='text/javascript'>");
		// 跳转function
		buffer.append("function " + pageGoFunction + "(){");
		buffer.append("\n");
		buffer.append("\n");
		buffer.append(" var MaxNo=document.getElementById('" + MaxNoHi.getId() + "');");
		buffer.append("\n");
		buffer.append(" var pageCurrent=document.getElementById('" + currentPageHi.getId() + "');");
		buffer.append("\n");
		buffer.append(" MaxNo.value=pageCurrent.value; document." + targetForm + ".submit(); ");
		buffer.append("\n");
		buffer.append("}");
		// 首页--末页
		buffer.append("\n");
		buffer.append("function " + pageSkipFunction + "(mn){");
		buffer.append("\n");
		buffer.append(" var pageCurrent=document.getElementById('" + currentPageHi.getId() + "');");
		buffer.append("\n");
		buffer.append(" var totalPage=document.getElementById('" + totalPageHi.getId() + "');");
		buffer.append("\n");
		buffer.append("if(mn==1){ pageCurrent.value=1; }else if(mn==2){ pageCurrent.value-=1; }else if(mn==3){ pageCurrent.value+=1; }else if(mn==4){ pageCurrent.value=totalPage.value; } ");
		buffer.append("\n");
		buffer.append("  document." + targetForm + ".submit(); ");
		buffer.append("\n");
		buffer.append("}");
		buffer.append("\n");
		buffer.append("</script>");
		return buffer.toString();
	}
}
