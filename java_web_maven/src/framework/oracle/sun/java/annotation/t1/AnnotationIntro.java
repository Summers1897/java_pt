package framework.oracle.sun.java.annotation.t1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class AnnotationIntro {
	public static void main(String[] args) throws Exception {
		Method[] methods = Class.forName("myJava.annotation.test.myannotationtest").getDeclaredMethods();
		Annotation[] annotations;
		for (Method method : methods) {
			annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(method.getName() + ":" + annotation.annotationType().getName());
				System.out.println(annotation.toString());
			}
		}
	}
}
