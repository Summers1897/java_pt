package util.db.mysql;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author K 有问题
 */
public class BackDB {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		String root = "D:\\db\\";
		String ml = "mysqldump -uroot -p111111  webshop  --default-character-set=utf8  <  " + root + "webshop" + 1 + ".sql";
		Process process = rt.exec(ml);
		System.out.println(ml);
		InputStreamReader isr = new InputStreamReader(process.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		isr.close();
		System.out.println("ok");
	}
}
