package test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import com.CChild;
import com.Child;
import com.Parent;
public class TestCS {
	@Test
	public void test() {
		Parent p = new Parent();
		p.setPid("pid");
		p.setPname("pname");
		Child c = new Child();
		c.setCid("cid");
		c.setCname("cname");
		CChild cc = new CChild();
		cc.setCcid("ccid");
		cc.setCcname("ccname");
		try {
			BeanUtils.copyProperties(cc, p);
			BeanUtils.copyProperties(cc, c);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(p);
	}
	@Test
	public void p() {
		Class<CChild> cc = CChild.class;
		Field[] fs1 = cc.getDeclaredFields();
		Field[] fs2 = cc.getFields();
		System.out.println(fs1);
	}
}
