package com.k.core.page;
import java.util.List;
public class PageButton {
	private List<PageComponent> list;
	private PageComponent homeButton;
	private PageComponent preButton;
	private PageComponent nextButton;
	private PageComponent lastButton;
	private void ini(Page page) {
		homeButton = new PageComponent();
		homeButton.setType("button");
		homeButton.setValue("[首页]");
		preButton = new PageComponent();
		preButton.setType("button");
		preButton.setValue("[上页]");
		if (page.getPageCurrentNo() == 1) {
			homeButton.setDisabled("diaabled");
			preButton.setDisabled("diaabled");
		}
		nextButton = new PageComponent();
		nextButton.setType("button");
		nextButton.setValue("[下页]");
		lastButton = new PageComponent();
		lastButton.setType("button");
		lastButton.setValue("[末页]");
		if (page.getPageCurrentNo() < page.getPageTotalNo()) {
			nextButton.setDisabled("diaabled");
			lastButton.setDisabled("diaabled");
		}
	}
	public List<PageComponent> getList(Page page) {
		ini(page);
		list.add(homeButton);
		list.add(preButton);
		list.add(nextButton);
		list.add(homeButton);
		return list;
	}
	public void setList(List<PageComponent> list) {
		this.list = list;
	}
	public PageComponent getHomeButton() {
		return homeButton;
	}
	public void setHomeButton(PageComponent homeButton) {
		this.homeButton = homeButton;
	}
	public PageComponent getPreButton() {
		return preButton;
	}
	public void setPreButton(PageComponent preButton) {
		this.preButton = preButton;
	}
	public PageComponent getNextButton() {
		return nextButton;
	}
	public void setNextButton(PageComponent nextButton) {
		this.nextButton = nextButton;
	}
	public PageComponent getLastButton() {
		return lastButton;
	}
	public void setLastButton(PageComponent lastButton) {
		this.lastButton = lastButton;
	}
}
