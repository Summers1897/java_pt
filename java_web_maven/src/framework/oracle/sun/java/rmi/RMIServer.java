package framework.oracle.sun.java.rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
public class RMIServer {
	public static void main(String[] args) throws Exception, MalformedURLException {
		HelloRemote helloRemote = new HelloImpl();
		Naming.rebind("hello", helloRemote);
	}
}
