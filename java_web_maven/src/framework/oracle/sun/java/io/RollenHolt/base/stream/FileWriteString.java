package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FileWriteString {
	public static void main(String[] args) throws IOException {
		File f = new File("e:/test/1.txt");
		f.createNewFile();
		OutputStream out = new FileOutputStream(f);
		// OutputStream out = new FileOutputStream(f, true);
		String str = "你好fgdf我是谁";
		out.write(str.getBytes());
		for (byte b : str.getBytes()) {
			out.write(b);
		}
		out.close();
	}
}
