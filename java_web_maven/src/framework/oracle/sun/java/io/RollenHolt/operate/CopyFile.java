package framework.oracle.sun.java.io.RollenHolt.operate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class CopyFile {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String p1 = "e:/test/1.txt";
		String p2 = "e:/test/2.txt";
		File f1 = new File(p1);
		File f2 = new File(p2);
		f2.createNewFile();
		InputStream is = new FileInputStream(f1);
		OutputStream os = new FileOutputStream(f2);
		byte[] buffer = new byte[1000];
		int len = 0;
		while ((len = is.read(buffer)) != -1) {
			os.write(buffer, 0, len);
			System.out.println(1);
		}
		is.close();
		os.close();
	}
}
