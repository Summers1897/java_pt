package com.k.core.page;
public class PageActionDispatcher {
	public static int comm_page_pageButton(Page page, int button) {
		int index = page.getCurrentPageNo();
		int pages = page.getTotalPageNo();
		if (button == 1) {
			index = 1;
		}
		if (button == 2) {
			index--;
		}
		if (button == 3) {
			index++;
		}
		if (button == 4) {
			index = pages;
		}
		return comm_page_gotoPage(index);
	}
	public static int comm_page_gotoPage(int index) {
		if (index < 1) {
			index = 1;
		}
		return index;
	}
}
