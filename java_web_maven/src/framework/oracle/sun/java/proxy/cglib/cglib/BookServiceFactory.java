package framework.oracle.sun.java.proxy.cglib.cglib;
import net.sf.cglib.proxy.Enhancer;
public class BookServiceFactory {
	private static BookServiceBean service = new BookServiceBean();
	private BookServiceFactory() {
	}
	public static BookServiceBean getInstance() {
		return service;
	}
	public static BookServiceBean getProxyInstance(MyCglibProxy myProxy) {
		Enhancer en = new Enhancer();
		// 进行代理
		en.setSuperclass(BookServiceBean.class);
		en.setCallback(myProxy);
		// 生成代理实例
		return (BookServiceBean) en.create();
	}
}
