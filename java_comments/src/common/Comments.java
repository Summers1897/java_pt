package common;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;
public class Comments {
	@Test
	public void test() throws Exception {
		File file = new File("C:/Users/K/Desktop/临时.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str + "<br>");
		}
	}
}
