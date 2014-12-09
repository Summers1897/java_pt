package framework.oracle.sun.java.io.RollenHolt.base.stream.DataOS;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("e:/test/1.txt");
		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		char[] ca = new char[400];
		int count = 0;
		char temp;
		while ((temp = dis.readChar()) != 'c') {
			ca[count++] = temp;
			System.out.println(temp);
		}
		System.out.println(ca);
	}
}
