package framework.oracle.sun.java.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface HelloRemote extends Remote {
	public void sayHello() throws RemoteException;
}
