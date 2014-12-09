package framework.oracle.sun.java.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class iotest {
	public static void main(String[] args) throws Exception {
		File file = new File("scoreRule1.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(file));
		BufferedReader reader = new BufferedReader(read);
		String line = null;
		StringBuffer str = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			str.append(line);
		}
		System.out.println(str.toString());
		System.out.println("**********************************************");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(str.toString() + "12345");
		bw.flush();
		bw.close();
		fw.close();
		/*
		 * FileInputStream fis = new FileInputStream(file); byte[] buf = new
		 * byte[8]; StringBuffer str = new StringBuffer(); while (fis.read(buf)
		 * != -1) { str.append(new String(buf)); buf = new byte[1]; }
		 * System.out.println(str.toString());
		 */
	}
}
