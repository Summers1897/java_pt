package framework.oracle.sun.java.proxy.arrayListProxy.invokClass;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
public class myInvok implements InvocationHandler {
	private Object target;
	public myInvok(Object target) {
		super();
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long beginTime = System.currentTimeMillis();
		TimeUnit.MICROSECONDS.sleep(1);
		Object obj = method.invoke(target, args);
		long endTime = System.currentTimeMillis();
		System.out.println("[" + method.getName() + "] spend " + (endTime - beginTime) + " ms");
		return obj;
	}
}
