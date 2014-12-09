package framework.oracle.sun.java.io.RollenHolt.base.file;
import java.io.File;
public class DeleteFile {
	public static void main(String[] args) {
		File f = new File("E:/test/1.txt");
		if (f.exists()) {
			f.delete();
		}
	}
}
