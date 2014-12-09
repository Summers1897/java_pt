package com.k.webshop.util;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;

import jxl.format.Colour;

import org.apache.poi.hssf.usermodel.HSSFCell;
public class Utils {
	public static Colour getNearestColour(String strColor) {
		if (strColor == null || "".equals(strColor)) {
			return Colour.BLACK;
		}
		Color cl = Color.decode(strColor);
		Colour color = null;
		Colour[] colors = Colour.getAllColours();
		if ((colors != null) && (colors.length > 0)) {
			Colour crtColor = null;
			int[] rgb = null;
			int diff = 0;
			int minDiff = 999;
			for (int i = 0; i < colors.length; i++) {
				crtColor = colors[i];
				rgb = new int[3];
				rgb[0] = crtColor.getDefaultRGB().getRed();
				rgb[1] = crtColor.getDefaultRGB().getGreen();
				rgb[2] = crtColor.getDefaultRGB().getBlue();
				diff = Math.abs(rgb[0] - cl.getRed()) + Math.abs(rgb[1] - cl.getGreen()) + Math.abs(rgb[2] - cl.getBlue());
				if (diff < minDiff) {
					minDiff = diff;
					color = crtColor;
				}
			}
		}
		if (color == null)
			color = Colour.BLACK;
		return color;
	}
	public static String dateToString(Date date, String format) {
		if (format == null || "".equals(format)) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if (date == null) {
			date = new Date();
		}
		return sdf.format(date);
	}
	public static Date stringToDate(String date, String format) throws Exception {
		if (date == null || "".equals(date)) {
			return new Date();
		}
		if (format == null || "".equals(format)) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	public static void main(String[] args) {
		System.out.println((new Long(100)).intValue());
	}
	public static String getNumberFormat(Long intValue) {
		if (intValue == null) {
			return "#.##";
		} else if (intValue == 0) {
			return "#";
		} else {
			String s = "#.";
			for (int i = 0; i < intValue; i++) {
				s += "#";
			}
			return s;
		}
	}
	public static String getCellContent(HSSFCell cell) {
		String content = null;
		if (cell == null) {
			return content;
		} else {
			switch (cell.getCellType()) {
				case HSSFCell.CELL_TYPE_STRING :
					content = cell.getStringCellValue();
					break;
				case HSSFCell.CELL_TYPE_NUMERIC :
					content = String.valueOf(cell.getNumericCellValue());
					break;
			}
		}
		return content;
	}
	public static Double getCellDouble(HSSFCell cell) {
		Double d = null;
		if (cell == null) {
			return d;
		} else {
			switch (cell.getCellType()) {
				case HSSFCell.CELL_TYPE_STRING :
					String content = cell.getStringCellValue();
					if (content != null && !"".equals(content)) {
						d = Double.parseDouble(content);
					}
					break;
				case HSSFCell.CELL_TYPE_NUMERIC :
					d = cell.getNumericCellValue();
					break;
			}
		}
		return d;
	}
	public static String getCellDate(HSSFCell cell) {
		String dateTime = null;
		Long time = null;
		if (cell == null) {
			return null;
		}
		switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_STRING :
				dateTime = cell.getStringCellValue();
				if (dateTime == null || "".equals(dateTime)) {
					return null;
				} else {
					if (dateTime.indexOf("-") != -1) {
						return dateTime;
					} else if (dateTime.indexOf("/") != -1) {
						return dateTime.replaceAll("/", "-");
					} else {
						Double d = Double.parseDouble(dateTime);
						time = d.longValue();
						dateTime = null;
					}
				}
				break;
			case HSSFCell.CELL_TYPE_NUMERIC :
				Double d = cell.getNumericCellValue();
				time = d.longValue();
				break;
		}
		if (time != null) {
			long l = time - 25569;
			Date date = new Date(l * 24 * 1000 * 3600);
			return dateToString(date, "yyyy-MM-dd");
		} else {
			return null;
		}
	}
	public static CharSequence getTheWeekly(String dateTime) throws Exception {
		Date d = stringToDate(dateTime, "yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		return sdf.format(d);
	}
	public static String interceptStringContent(String string, int number) {
		string = string.replaceAll("</?[^>]+>", "").replaceAll("&nbsp;", "").replaceAll("&rdquo;", "").replaceAll("\r\n", "<br>");
		if (string != null && !string.equals("") && string.length() > number) {
			String tempNameString = string.substring(0, number) + "...";
			return tempNameString;
		} else {
			return string;
		}
	}
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	public static Date StrToDate(String dateStr, String format) {
		DateFormat df = DateFormat.getDateInstance();
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
		}
		return null;
	}
	/**
	 * @param DateStr
	 *            yyyy 上一年 yyyy-MM 上一月 yyyy-MM-dd 上一天
	 * @param format
	 * @return
	 */
	public static String DateStrToLastDate(String DateStr, String format) {
		Calendar c = new GregorianCalendar();
		if (DateStr == null || "".equals(DateStr)) {
			c.setTime(new Date());
		}
		if ("yyyy".equals(format)) {
			c.setTime(StrToDate(DateStr + "-01-01", format));
			c.add(Calendar.YEAR, -1);
			return c.get(Calendar.YEAR) + "";
		} else if ("yyyy-MM".equals(format)) {
			c.setTime(StrToDate(DateStr + "-01", format));
			c.add(Calendar.MONTH, -1);
			return c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) > 8 ? (c.get(Calendar.MONTH) + 1) : "0" + (c.get(Calendar.MONTH) + 1));
		} else if ("yyyy-MM-dd".equals(format)) {
			c.setTime(StrToDate(DateStr, format));
			c.add(Calendar.DAY_OF_MONTH, -1);
			return c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) > 8 ? c.get(Calendar.MONTH) + 1 : "0" + (c.get(Calendar.MONTH) + 1)) + "-" + (c.get(Calendar.DAY_OF_MONTH) > 9 ? c.get(Calendar.DAY_OF_MONTH) : "0" + c.get(Calendar.DAY_OF_MONTH));
		} else {
			return null;
		}
	}
}
