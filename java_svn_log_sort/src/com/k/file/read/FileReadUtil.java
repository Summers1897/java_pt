package com.k.file.read;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
public class FileReadUtil {
	public static List<String> fileRead(String fileName, String preStr) {
		List<String> strList = null;
		try {
			strList = new ArrayList<String>();
			File logFile = new File("C:/Users/K/Desktop/" + fileName);
			Reader rd = new FileReader(logFile);
			BufferedReader reader = new BufferedReader(rd);
			String str;
			while ((str = reader.readLine()) != null) {
				if (str.contains(preStr)) {
					strList.add(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strList;
	}
}
