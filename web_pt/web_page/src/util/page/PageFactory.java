package util.page;
public class PageFactory {
	public static Page createPage() {
		Page page = new Page();
		page.setCurrentPageNum(1);
		page.setShowRowsNum(pageConfig.configShowRowsNum);
		return page;
	}
}
