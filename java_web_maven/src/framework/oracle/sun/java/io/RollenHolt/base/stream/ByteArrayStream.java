package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
/**
 * @author K ByteArrayInputStream 主要将内容写入内容
 */
public class ByteArrayStream {
	public static void main(String[] args) throws Exception {
		String str = "ROLLENHOLT";
		ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int temp = 0;
		while ((temp = input.read()) != -1) {
			char ch = (char) temp;
			output.write(Character.toLowerCase(ch));
		}
		System.out.println(output.toString());
		input.close();
		output.close();
	}
}
