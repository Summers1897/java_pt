package framework.oracle.sun.java.io.RollenHolt.base.charstream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class FileWriterFile {
	public static void main(String[] args) throws IOException {
		File f = new File("e:/test/1.txt");
		Writer out = new FileWriter(f, true);
		String str = "dsfds";
		out.write(str);
		out.close();
	}
}
