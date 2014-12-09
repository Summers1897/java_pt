package util.db.common;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
public class ReadDataTxt {
	public static void main(String[] args) throws Exception {
		// String u =
		// ReadOracleDataTxt.class.getClassLoader().getSystemResource("").getPath()
		// + "/";
		String u = "C:/Users/k/Desktop/";
		InputStream is = new FileInputStream(u + "1.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		String s;
		String[] sa;
		String s1 = null;
		String tableName = "orders";
		List<String> list = new ArrayList<String>();
		while ((s = b.readLine()) != null) {
			sa = StringUtils.split(s);
			s1 = "insert into " + tableName + " values(";
			for (String ss : sa) {
				s1 += ss + ",";
			}
			s1 = s1.substring(0, s1.length() - 1);
			s1 += ")";
			list.add(s1);
			System.out.println(s1);
		}
		DB.sqlEx(list);
	}
}
