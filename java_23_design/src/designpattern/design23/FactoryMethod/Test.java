package designpattern.design23.FactoryMethod;
public class Test {
	public static void main(String[] args) {

		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
	}
}
