package framework.oracle.sun.java.rmi;
import java.rmi.Naming;
public class RMIClient {
	public static void main(String[] args) throws Exception {
		// System.setSecurityManager(new RMISecurityManager());//
		// 如果服务器和客户端不再同一台机器要加这行
		HelloRemote hello = (HelloRemote) Naming.lookup("hello");
		hello.sayHello();
	}
}
