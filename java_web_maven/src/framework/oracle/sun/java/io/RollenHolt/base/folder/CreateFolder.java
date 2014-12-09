package framework.oracle.sun.java.io.RollenHolt.base.folder;
import java.io.File;

import framework.oracle.sun.java.io.RollenHolt.FileAddress;
public class CreateFolder extends FileAddress {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File(root + "fd/1/2/3");
		f.mkdirs();
	}
}
