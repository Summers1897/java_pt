package framework.oracle.sun.java.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class filecopy {
	public static void main(String[] args) throws Exception {
		File file = new File("test1.txt");
		File f = null;
		String pre = "pre/bj";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int count, num = 1024;
		byte[] buffer = new byte[num];
		for (int i = 0; i < 1000; i++) {
			f = new File(pre + System.currentTimeMillis() + ".txt");
			f.createNewFile();
			fis = new FileInputStream(file);
			fos = new FileOutputStream(f);
			count = fis.read(buffer, 0, num);
			while (count != -1) {
				fos.write(buffer, 0, count);
				count = fis.read(buffer, 0, num);
			}
			System.out.println(i);
		}
	}
}
