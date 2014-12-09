package framework.oracle.sun.java.proxy.arrayListProxy.invokClass;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
public class proxyExamp {
	public static void main(String[] args) {
		List<Integer> arrayListProxy = (List<Integer>) Proxy.newProxyInstance(ArrayList.class.getClassLoader(), ArrayList.class.getInterfaces(), new myInvok(new ArrayList<Integer>()));
		arrayListProxy.add(2);
		arrayListProxy.add(4);
		System.out.println("--------- 迭代 ---------");
		for (int i : arrayListProxy) {
			System.out.print(i + "\t");
		}
	}
}
