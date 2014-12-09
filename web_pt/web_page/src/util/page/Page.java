package util.page;
public class Page {
	private final String homePage = "首页";
	private final String upPage = "上一页";
	private final String downPage = "下一页";
	private final String lastPage = "末页";
	private int currentPageNum;
	private int totalPageNum;
	private int showRowsNum;
	private String orderByStr;
	private String orderByValue;
	public int getMinNum() {
		return (currentPageNum - 1) * showRowsNum + 1;
	}
	public int getMaxNum() {
		return currentPageNum * showRowsNum;
	}
	public int getCurrentPageNum() {
		return currentPageNum;
	}
	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public int getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public int getShowRowsNum() {
		return showRowsNum;
	}
	public void setShowRowsNum(int showRowsNum) {
		this.showRowsNum = showRowsNum;
	}
	public String getOrderByStr() {
		return orderByStr;
	}
	public void setOrderByStr(String orderByStr) {
		this.orderByStr = orderByStr;
	}
	public String getOrderByValue() {
		return orderByValue;
	}
	public void setOrderByValue(String orderByValue) {
		this.orderByValue = orderByValue;
	}
	public String getHomePage() {
		return homePage;
	}
	public String getUpPage() {
		return upPage;
	}
	public String getDownPage() {
		return downPage;
	}
	public String getLastPage() {
		return lastPage;
	}
}
