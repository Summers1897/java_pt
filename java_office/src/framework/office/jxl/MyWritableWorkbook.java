package framework.office.jxl;
import java.util.HashMap;
import java.util.List;

import jxl.CellView;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class MyWritableWorkbook {
	public static WritableWorkbook resolveThreeLineReport(WritableWorkbook book) throws Exception {
		WritableSheet sheet = book.createSheet("1", 0);
		CellView cv = new CellView();
		cv.setHidden(true);
		sheet.setColumnView(0, cv);
		sheet.setRowView(0, cv);
		// sheet.setColumnView(sheetCol + 1, 18);
		// 题目
		// sheet.mergeCells(sheetCol + 1, sheetRow, sheetCol + 2 + 13 *
		// monthThreeCol, sheetRow);
		// sheet.addCell(YearThreeLine);
		WritableCell piIndex;
		sheet.setRowView(0, 400);
		// createValue = new Formula(0,1,"");
		// piIndex = new Label(vo.getCol() + (k++), vo.getRow() + i,
		// vo.getPiId(), piNameNoWC);
		// baseValue = new Number(vo.getCol() + (k++), vo.getRow() + i,
		// vo.getPrdBaseValue(), formulaNo);
		// createValue = new Formula(vo.getCol() + (k++), vo.getRow() + i,
		// vo.getPrdCreateValueStr(), formulaIs);
		return book;
	}
}
