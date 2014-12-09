package framework.org.apache.ant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class ZipTest {
	public static void main(String[] args) throws Exception {
		m3();
	}
	static void m1() {
		ZipCompressor zip = new ZipCompressor("C:/Users/K/Desktop/1/网.zip");
		zip.compress("C:/Users/K/Desktop/1/网.txt");
	}
	static void m2() throws Exception {
		File file = new File("C:/Users/K/Desktop/1/网.zip");
		ZipUtils zip = new ZipUtils();
		zip.zip(file, "C:/Users/K/Desktop/1/网.txt");
	}
	static void m3() throws Exception {
		File file = new File("C:/Users/K/Desktop/1/网dsfs.zip");
		// File file=File.createTempFile("我的1", ".zip");
		CopyOfZipCompressor zip = new CopyOfZipCompressor(file);
		zip.compress("C:/Users/K/Desktop/1/网.txt");
		// FileOutputStream out=new FileOutputStream(zip.getZipFile());
		// ZipCompressor zip = new ZipCompressor("C:/Users/K/Desktop/1/网.zip");
	}
}
