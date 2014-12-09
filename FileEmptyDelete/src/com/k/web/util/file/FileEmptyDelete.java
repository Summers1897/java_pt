package com.k.web.util.file;
import java.io.File;
public class FileEmptyDelete {
	public static void main(String[] args) {
		deleteEmptyDirectory("G:/maven_libs");
	}
	public static void deleteEmptyDirectory(String path) {
		File f = new File(path);
		File[] fs = f.listFiles();
		for (File ff : fs) {
			m1(ff);
		}
	}
	public static void m1(File f) {
		File[] fs = null;
		if (f.isDirectory()) {
			fs = f.listFiles();
			if (fs.length == 0) {
				System.out.println(f.getAbsolutePath());
				f.delete();
			} else {
				for (File f1 : fs) {
					if (f1.isDirectory()) {
						m1(f1);
					}
				}
			}
		}
	}
}
