package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedR {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str = b.readLine();
		System.out.println(str);
	}
}
