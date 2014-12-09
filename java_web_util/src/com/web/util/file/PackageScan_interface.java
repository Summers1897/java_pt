package com.web.util.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

import org.apache.commons.lang.StringUtils;
public class PackageScan_interface {
	public static void main(String[] args) throws Exception {
		List<File> fs = PackageScan_file_list.getClassName("C:/Users/K/Desktop/temp/project");
		for (File f : fs) {
			trans(f);
		}
	}
	public static void trans(File f) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
		File f1 = new File(f.getAbsoluteFile() + "1");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "utf-8"));
		String temp;
		String preTemp = "";
		while ((temp = br.readLine()) != null) {
			// System.out.println(temp);
			if (temp.contains("public") && !temp.contains("public interface")) {
				if (!StringUtils.contains(preTemp, "@Deprecated")) {
					temp = "  @Deprecated \r\n " + temp;
				}
			}
			temp += " \r\n ";
			preTemp = temp;
			bw.write(temp);
		}
		bw.close();
		br.close();
		// System.out.println(str.toString());
		System.out.println(f.getAbsolutePath() + " delete:" + f.delete());
		System.out.println(f1.getAbsolutePath() + "remove to " + f.getAbsolutePath() + "  " + f1.renameTo(f.getAbsoluteFile()));
	}
}
