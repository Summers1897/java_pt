package framework.oracle.sun.java.file.packagescan;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
public class test {
	public static void main(String[] args) throws Exception {
		String s = "1$1";
		String[] ss = s.split("$");
		ss = StringUtils.split(s, "$");
		System.out.println(ss);
	}
	private void m1() throws Exception {
		List<String> cns = PackageScan.getClassName("com.k.util.project.promodel.m12");
		for (String cn : cns) {
			Class c = ClassUtils.getClass(cn);
			Constructor ct = c.getConstructor();
			Object obj = ct.newInstance();
			Method m = c.getDeclaredMethod("ins");
			if (m != null) {
				m.invoke(obj);
				System.out.println(cn);
			}
		}
	}
}
