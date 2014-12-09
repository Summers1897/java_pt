package framework.oracle.sun.java.io.RollenHolt.base.stream.DataOS;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class DataOutputStreamDemo {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("e:/test/1.txt");
		char[] ca = {'a', 'a', 'v'};
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		for (char c : ca) {
			out.writeChar(c);
		}
		out.close();
	}
}
