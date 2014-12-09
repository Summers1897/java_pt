package framework.oracle.sun.java.io.RollenHolt.base.folder;
import java.io.File;
public class FolderList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("d:/");
		String[] str = f.list();
		for (String string : str) {
			System.out.println(string);
		}
		File[] fs = f.listFiles();
		for (File file : fs) {
			System.out.println(file);
			System.out.println(file.getAbsolutePath());
		}
	}
}
