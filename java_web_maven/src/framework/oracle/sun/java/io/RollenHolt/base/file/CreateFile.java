package framework.oracle.sun.java.io.RollenHolt.base.file;
import java.io.File;
public class CreateFile {
	public static void main(String[] args) throws Exception {
		createFile(null);
	}
	public static void createFile(String path) throws Exception {
		File f = new File("E:/test/1.txt");
		f.createNewFile();
	}
}
