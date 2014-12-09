package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.File;
import java.io.FileInputStream;
public class RedirectStreamDirection {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// System.out.println("jdslfjdslkf");
		File f = new File("e:/test/1.txt");
		// System.setOut(new PrintStream(new FileOutputStream(f)));
		// System.out.println("jdslfjdslkf");
		// System.err.println("jdslfjdslkf");
		// /System.setErr(new PrintStream(new FileOutputStream(f)));
		// System.err.println("jdslfjdslkf");
		System.setIn(new FileInputStream(f));
		byte[] bytes = new byte[1024];
		int len = 0;
		len = System.in.read(bytes);
		System.out.println(new String(bytes, 0, len));
	}
}
