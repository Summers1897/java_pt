package framework.office.jxl.write;
import java.io.File;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.write.Blank;
import jxl.write.Boolean;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class WriteXls {
	private final static String path = "C:/Users/K/Desktop/xls/";
	public static void main(String[] args) throws Exception {
		write1(path + "x1.xls");
	}
	public static void write1(String filePath) throws Exception {
		File file = new File(filePath);
		WritableWorkbook book = Workbook.createWorkbook(file);
		WritableSheet sheet = book.createSheet("sheet1", 0);
		int row = 0;
		int cou = 0;
		int row1 = 0;
		int cou1 = cou + 1;
		Label label = new Label(cou, row, "空格");
		Blank blank = new Blank(cou1, row);
		sheet.addCell(label);
		sheet.addCell(blank);
		row++;
		label = new Label(cou, row, "boolean");
		Boolean bl = new Boolean(cou1, row, java.lang.Boolean.FALSE);
		sheet.addCell(label);
		sheet.addCell(bl);
		book.write();
		book.close();
		System.out.println("ok");
	}
	private static WritableCellFormat getFormat(int val) throws Exception {
		WritableFont wf = new WritableFont(WritableFont.createFont("宋体"));
		WritableCellFormat wcf = new WritableCellFormat(wf);
		wcf.setAlignment(Alignment.CENTRE);
		wcf.setBackground(Colour.BLACK);
		return wcf;
	}
}
