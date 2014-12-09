package com.k.io.file;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
public class Read1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File file = new File("D:/temp/020KF20140711.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			int i = 0;
			while ((str = br.readLine()) != null) {
				System.out.println(i++);
				System.out.println(str);
			}
			br.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
