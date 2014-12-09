package framework.office.jxl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import jxl.Cell;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class jxltest {
	public static void main(String[] args) throws Exception {
		File file = File.createTempFile("tempfile", ".xls");
		OutputStream os = new FileOutputStream(file);
		WritableWorkbook wwb = Workbook.createWorkbook(os);
		WritableSheet sheet = wwb.createSheet("test", 0);
		Cell c = sheet.getCell(0, 1);
	}
}
