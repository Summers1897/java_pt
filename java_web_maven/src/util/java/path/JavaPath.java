package util.java.path;
import java.io.File;
import java.net.URL;
public class JavaPath {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		System.out.println(JavaPath.class.getClassLoader().getResource(""));
		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(JavaPath.class.getResource(""));
		System.out.println(JavaPath.class.getResource("/") + "file/1.xml");
		// Class文件所在路径
		System.out.println(new File("/").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
		System.out.println("********************");
		URL u = JavaPath.class.getResource("/");
		System.out.println(u.getPath());
		File f = new File(u.getPath());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
	}
}
