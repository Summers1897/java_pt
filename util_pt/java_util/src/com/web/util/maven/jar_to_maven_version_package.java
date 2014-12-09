package com.web.util.maven;
import java.io.File;

import org.apache.commons.io.FileUtils;
/**
 * @author K maven下载的jar包自动转换到文件夹中
 * 
 */
public class jar_to_maven_version_package {
	public static void main(String[] args) throws Exception {
		trans("C:/Users/K/Desktop/1/1");
	}
	public static void trans(String pk) throws Exception {
		File file = new File(pk);
		File[] fs = file.listFiles();
		String name;
		String fileName;
		String fileNameJar;
		for (File f : fs) {
			if (f.isDirectory()) {
				continue;
			}
			name = f.getAbsolutePath();
			System.out.println(name);
			fileNameJar = name.substring(name.lastIndexOf("\\") + 1);
			fileName = fileNameJar.substring(0, fileNameJar.indexOf(".jar"));
			if (fileName.contains("javadoc")) {
				fileName = fileName.substring(0, fileName.indexOf("javadoc"));
			} else if (fileName.contains("sources")) {
				fileName = fileName.substring(0, fileName.indexOf("sources"));
			} else if (fileName.contains("tests")) {
				fileName = fileName.substring(0, fileName.indexOf("tests"));
			}
			String[] ss = fileName.split("-");
			int j = 0;
			for (int i = ss.length - 1; i >= 0; i--) {
				if (ss[i].charAt(0) < 58) {
					j = i;
					break;
				}
			}
			String pkn = "";
			String ver = "";
			for (int i = 0; i < j; i++) {
				pkn = pkn + "-" + ss[i];
			}
			pkn = pkn.substring(1);
			for (int i = j; i < ss.length; i++) {
				ver = ver + "-" + ss[i];
			}
			ver = ver.substring(1);
			File desf = new File(pk + "/" + pkn + "/" + ver);
			FileUtils.moveFileToDirectory(f, desf, true);
			System.out.println(pkn);
			System.out.println(ver);
		}
	}
}
