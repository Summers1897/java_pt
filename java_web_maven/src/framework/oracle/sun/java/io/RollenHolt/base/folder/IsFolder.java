package framework.oracle.sun.java.io.RollenHolt.base.folder;
import java.io.File;

import framework.oracle.sun.java.io.RollenHolt.FileAddress;
public class IsFolder extends FileAddress {
	public static void main(String[] args) {
		File f = new File(root);
		if (f.isDirectory()) {
			System.out.println(1);
		}
	}
}
