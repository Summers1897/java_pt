package designpattern.design23.callback;
public class B implements MyCallInterface {
	public void method() {

		System.out.println("回调");
	}
	public static void main(String args[]) {

		Caller call = new Caller();
		call.setCallfuc(new B());
		call.call();
	}
}