package framework.oracle.sun.java.proxy.cglib.cglib.filter;
public class Client {
	public static void main(String[] args) {
		BookServiceBean service = BookServiceFactory.getProxyInstanceByFilter(new MyCglibProxy("jhon"));
		service.create();
		BookServiceBean service2 = BookServiceFactory.getProxyInstanceByFilter(new MyCglibProxy("jhon"));
		service2.query();
	}
	public static void doMethod(BookServiceBean service) {
		service.create();
		service.update();
		service.query();
		service.delete();
	}
}
