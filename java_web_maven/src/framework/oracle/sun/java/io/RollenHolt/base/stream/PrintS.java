package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class PrintS {
	public static void main(String[] args) throws Exception {
		PrintStream p = new PrintStream(new FileOutputStream("e:/test/1.txt"));
		p.println("ldsjfklds");
		int age = 20;
		p.printf("姓名：%s. 年龄：%d.", "dfdsf", age);
		p.close();
	}
}
