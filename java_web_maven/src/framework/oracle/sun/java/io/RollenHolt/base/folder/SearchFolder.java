package framework.oracle.sun.java.io.RollenHolt.base.folder;
import java.io.File;

import framework.oracle.sun.java.io.RollenHolt.FileAddress;
public class SearchFolder extends FileAddress {
	public static void main(String[] args) {
		File f = new File("e:/test");
		print(f);
	}
	static void print(File f) {
		if (f != null) {
			File[] fa = f.listFiles();
			if (fa == null) {
				System.out.println(1);
			}
			for (File f1 : fa) {
				if (f1 == null) {
					System.out.println(1);
				}
				System.out.println("**********************************");
				System.out.println(f1.getAbsolutePath());
				File[] fa11 = f1.listFiles();
				if (f1.isDirectory()) {
					print(f1);
				}
			}
		}
	}
}
