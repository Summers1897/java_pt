package com.web.util.file;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class PackageScan_file_list {
	public static List<File> getClassName(String packageName) {
		List<File> files = new ArrayList<File>();
		File urlFile = new File(packageName);
		File[] fs = urlFile.listFiles();
		for (File f : fs) {
			getClassName(f, files);
		}
		return files;
	}
	private static void getClassName(File f, List<File> fs) {
		if (f.isFile()) {
			fs.add(f);
		} else {
			File[] files = f.listFiles();
			for (File f1 : files) {
				getClassName(f1, fs);
			}
		}
	}
	public static void main(String[] args) throws Exception {
		List<File> list = getClassName("C:/Users/K/Desktop/temp/project");
		for (File file : list) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
