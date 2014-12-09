package framework.oracle.sun.java.proxy.cglib.normal;
public class BookServiceFactory {
	private static BookServiceBean service = new BookServiceBean();
	private BookServiceFactory() {
	}
	public static BookServiceBean getInstance() {
		return service;
	}
}
