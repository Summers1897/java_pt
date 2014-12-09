package framework.oracle.sun.java.lang.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
public class reflectTest {
	public static void main(String[] args) throws Exception {
		System.out.println(objectVO.class.getName());
		Class vo = Class.forName(objectVO.class.getName());
		Field[] fd = vo.getDeclaredFields();
		for (Field field : fd) {
			System.out.println(field.getName());
			Type type = field.getGenericType();
			System.out.println(type);
		}
	}
	public static void type() {
	}
}
