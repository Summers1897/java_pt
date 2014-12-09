package com.k.core.action;
import java.util.List;

import com.k.core.page.Page;
import com.k.core.page.PageButton;
import com.k.core.page.PageComponent;
public class PaginationAction extends BaseAction {
	private Page page;
	private PageButton pb = new PageButton();
	public String outPutPageBar(int i) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(ButtonStr(pb.getList(getPage())));
		return buffer.toString();
	}
	private String ButtonStr(List<PageComponent> List) {
		StringBuffer buffer = new StringBuffer();
		for (PageComponent vo : List) {
			buffer.append(vo.toString());
		}
		return buffer.toString();
	}
	public Page getPage() {
		return page;
	}
	public Page getPage(List list) {
		page = new Page();
		page.setList(list);
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public void setPage(Page page, List list) {
		page = new Page();
		page.setList(list);
		this.page = page;
	}
}
