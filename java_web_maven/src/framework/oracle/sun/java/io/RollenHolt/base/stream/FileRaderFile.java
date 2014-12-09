package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class FileRaderFile {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("e:/test/1.txt");
		InputStream is = new FileInputStream(f);
		byte[] b = new byte[(int) f.length()];
		System.out.println(f.length());
		is.read(b);
		is.close();
		System.out.println(new String(b));
	}
}
