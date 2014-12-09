package framework.oracle.sun.java.rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements HelloRemote {
	protected HelloImpl() throws RemoteException {
		super();
	}
	@Override
	public void sayHello() throws RemoteException {
		System.out.println("hellow");
	}
}
