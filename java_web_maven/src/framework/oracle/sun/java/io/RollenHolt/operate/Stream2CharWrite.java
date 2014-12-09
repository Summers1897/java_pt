package framework.oracle.sun.java.io.RollenHolt.operate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class Stream2CharWrite {
	public static void main(String[] args) throws Exception {
		// 将字节输出流转化为字符输出流
		File f = new File("e:/test/1.txt");
		Writer out = new OutputStreamWriter(new FileOutputStream(f));
		out.write("我是谁啊");
		out.close();
		// 将字节输入流变为字符输入流
		Reader read = new InputStreamReader(new FileInputStream(f));
		char[] c = new char[1000];
		int len = read.read(c);
		System.out.println(new String(c, 0, len));
		read.close();
	}
}
