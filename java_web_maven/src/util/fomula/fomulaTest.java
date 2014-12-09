package util.fomula;
import java.util.HashMap;
import java.util.Map;
public class fomulaTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("@abqq@", "1");
		map.put("@cdqq@", "2");
		map.put("@efqq@", "@abqq@+@cdqq@");
		map.put("@hiqq@", "@efqq@+@cdqq@");
		System.out.println(fomulastr("@abqq@+@efqq@+3+4+@hiqq@", map));
	}
	public static String fomulastr(String fmu, Map<String, String> map) {
		int start = 0;
		int end = fmu.length();
		int half = 0;
		boolean flag = false;
		while (start < end) {
			// char charfmusatrt = fmu.charAt(half);
			char code = fmu.charAt(half++);
			// char charfmuend = fmu.charAt(half);
			while (isACodeStr(code)) {
				flag = true;
				if (++half >= fmu.length()) {
					break;
				}
				// char charfhalf = fmu.charAt(half);
				code = fmu.charAt(half);
			}
			if (flag) {
				String temp = fmu.substring(start, half);
				if (map.get(temp) == null) {
					return null;
				}
				fmu = fmu.replace(temp, map.get(temp));
				flag = false;
				half = start;
			}
			start = half;
			end = fmu.length();
		}
		return fmu;
	}
	public static boolean isACode(byte b) {
		if ((b >= 64 && b <= 90) || (b >= 97 && b <= 122)) {
			return true;
		}
		return false;
	}
	public static boolean isACodeStr(char b) {
		if ((b >= 64 && b <= 90) || (b >= 97 && b <= 122)) {
			return true;
		}
		return false;
	}
}
