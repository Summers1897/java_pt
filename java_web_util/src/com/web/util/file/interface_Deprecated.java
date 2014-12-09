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
public class interface_Deprecated {
	public static void main(String[] args) throws Exception {
		List<File> fs = PackageScan_file_list.getClassName("C:/Users/K/Desktop/temp/project");
		for (File f : fs) {
			trans_1(f);
		}
	}
	public static void trans(File f) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
		File f1 = new File(f.getAbsoluteFile() + "1");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "utf-8"));
		String temp;
		String tempStr = "";
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
			if (!StringUtils.contains(tempStr, "@Deprecated")) {
				if (temp.contains("public")) {
					temp = " \r\n @Deprecated \r\n " + temp;
				}
				temp += " \r\n ";
			}
			tempStr = temp;
			bw.write(temp);
			System.out.println(temp);
		}
		bw.close();
		br.close();
		System.out.println(f.delete());
		System.out.println(f1.renameTo(f.getAbsoluteFile()));
	}
	public static void trans_1(File f) throws Exception {
		// 正确
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
		File f1 = new File(f.getAbsoluteFile() + "1");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), "utf-8"));
		String temp;
		String up = "";
		String upcheck = "";
		while ((temp = br.readLine()) != null) {
			up = temp;
			// {"@Deprecated"}
			if (temp.contains("public") && !temp.contains("interface")) {
				if (!upcheck.contains("@Deprecated")) {
					temp = "\r\n @Deprecated \r\n" + temp + " \r\n ";
				}
			} else {
				temp = temp + " \r\n  ";
			}
			upcheck = up;
			bw.write(temp);
			System.out.println(temp);
		}
		bw.close();
		br.close();
		System.out.println(f.delete());
		System.out.println(f1.renameTo(f.getAbsoluteFile()));
	}
}
