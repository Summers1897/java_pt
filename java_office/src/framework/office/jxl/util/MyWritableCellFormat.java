package framework.office.jxl.util;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WriteException;
public class MyWritableCellFormat {
	public static WritableCellFormat getOrgTitleWC() {
		WritableCellFormat wc = new WritableCellFormat();
		WritableFont wfSong = new WritableFont(WritableFont.createFont("宋体"), 9, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE);
		wc.setFont(wfSong);
		try {
			wc.setBorder(Border.ALL, BorderLineStyle.THIN);
			wc.setAlignment(Alignment.CENTRE);
			wc.setWrap(false);
		} catch (WriteException e) {
			e.printStackTrace();
		}
		return wc;
	}
	public static WritableCellFormat getTitleWC() {
		WritableCellFormat wc = new WritableCellFormat();
		WritableFont wfSong = new WritableFont(WritableFont.createFont("宋体"), 9, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE);
		wc.setFont(wfSong);
		try {
			wc.setBorder(Border.ALL, BorderLineStyle.THIN);
			wc.setAlignment(Alignment.LEFT);
			wc.setWrap(false);
		} catch (WriteException e) {
			e.printStackTrace();
		}
		return wc;
	}
	public static WritableCellFormat getOrderWC(boolean bl) {
		WritableCellFormat wc = null;
		WritableFont wfSong = new WritableFont(WritableFont.createFont("宋体"), 9, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE);
		wc = new WritableCellFormat(wfSong);
		try {
			wc.setAlignment(Alignment.CENTRE);
			if (bl) {
				wc.setBackground(Colour.GRAY_25);
			}
			wc.setWrap(false);
			wc.setBorder(Border.ALL, BorderLineStyle.THIN);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wc;
	}
	public static WritableCellFormat getPlanIndexNameWC(boolean bl) {
		WritableCellFormat wc = null;
		WritableFont wfSong = new WritableFont(WritableFont.createFont("宋体"), 9, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE);
		wc = new WritableCellFormat(wfSong);
		try {
			wc.setAlignment(Alignment.LEFT);
			if (bl) {
				wc.setBackground(Colour.GRAY_25);
			}
			wc.setWrap(false);
			wc.setBorder(Border.ALL, BorderLineStyle.THIN);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wc;
	}
	public static WritableCellFormat getFormulaWC(boolean bl) {
		WritableCellFormat wc = null;
		WritableFont wfSong = new WritableFont(WritableFont.createFont("宋体"), 9, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE);
		wc = new WritableCellFormat(wfSong);
		try {
			if (bl) {
				wc.setBackground(Colour.GRAY_25);
			}
			wc.setWrap(false);
			wc.setBorder(Border.ALL, BorderLineStyle.THIN);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wc;
	}
}
