package framework.office.jxl.read;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
public class ReadXls {
	private final static String path = "C:/Users/K/Desktop/xls/";
	public static void main(String[] args) throws Exception {
		read1(path + "x1.xls");
	}
	private static void read1(String filePath) throws Exception, IOException {
		File file = new File(filePath);
		Workbook book = Workbook.getWorkbook(file);
		Sheet sheet = book.getSheet(0);
		System.out.println(sheet.getName());
		book.close();
	}
}
