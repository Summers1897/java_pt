package com.k.webshop.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTools {
	public static Date stringToDate(String dateTime,String format)throws Exception{
		if(format==null||"".equals(format)){
			format="yyyy-MM-dd";
		}
		if(dateTime==null||"".equals(dateTime)){
			return new Date();
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(dateTime);
	}
	
	
	/**
	 * 根据dateTime计算出距离年初有多少天
	 * 
	 * */
	public static long calculateDayToDateTime(String dateTime)throws Exception{
		String endTime=dateTime.substring(0,4)+"-01-01";
		String startTime=toThisMonthLastDay(dateTime);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long days=(sdf.parse(startTime).getTime()-sdf.parse(endTime).getTime())/86400000+1;
		return days;
	}
	
	/**
	 * 
	 * 传进一个yyyy-MM-dd或者是yyyy-MM的String类型，返回这个时间锁对应的上一个月份yyyy-MM
	 * 
	 * 默认如果date为""或null的话则以当前的时间
	 * 
	 * */
	public static String toLastMonth(String date)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM");
		if("".equals(date)||date==null){
			date=sdf.format(new Date());
		}
		if(date.length()>7){
			Date d=sdf.parse(date.substring(0,date.lastIndexOf("-"))+"-01");
			d.setTime(d.getTime()-86400000);
			return sdf1.format(d);
		}else{
			Date d=sdf.parse(date+"-01");
			d.setTime(d.getTime()-86400000);
			return sdf1.format(d);
		}
		
	}
	/**
	 * 
	 * 传进一个yyyy-MM-dd或者是yyyy-MM的String类型，返回这个时间锁对应的上一个月份yyyy-MM
	 * 
	 * 默认如果date为""或null的话则以当前的时间
	 * 
	 * */
	public static String toThisMonth(String date)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM");
		if("".equals(date)||date==null){
			return sdf1.format(new Date());
		}
		if(date.length()>7){
			return sdf1.format(sdf.parse(date));
		}else{
			return date;
		}
		
	}
	/**
	 * 返回上个月的最后一天
	 * 
	 * */
	public static String toLastMonthLastDay(String date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM");
		if("".equals(date)||date==null){
			date=sdf.format(new Date());
		}
		Calendar cal=Calendar.getInstance();
		try {
		if(date.length()>7){
			Date d=sdf.parse(date.substring(0,date.lastIndexOf("-"))+"-01");
			d.setTime(d.getTime()-86400000);
			cal.setTime(d);
			return sdf1.format(d)+"-"+cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}else{
			Date d=sdf.parse(date+"-01");
			d.setTime(d.getTime()-86400000);
			cal.setTime(d);
			return sdf1.format(d)+"-"+cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**根据传进来的yyyy-MM字符串，获取到对应的时间的最后一天
	 * 
	 * */
	public static String toThisMonthLastDay(String date)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		if(date==null||"".equals(date)){
			date=sdf.format(new Date());
		}
		if(date.length()>7){
			date=date.substring(0,date.lastIndexOf("-"));
		}
		Calendar cal=Calendar.getInstance();
			
		cal.setTime(sdf.parse(date));
		date=date+"-"+cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return date;
	}
	/**根据传进来的yyyy-MM字符串，获取到对应的时间的第一天
	 * 
	 * */
	public static String toThisMonthFirstDay(String date)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		if(date==null||"".equals(date)){
			date=sdf.format(new Date());
		}
		if(date.length()>7){
			date=date.substring(0,date.lastIndexOf("-"));
		}
		date=date+"-01";
		return date;
	}
	public static String toThisYearLastDay(String date){
		if(date!=null&&!"".equals(date)){
			if(date.length()>=4){
				return date.substring(0,4)+"-12-31";
			}
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		return sdf.format(new Date())+"-12-31";
	}
	public static String toThisYear(String date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		if(date==null||"".equals(date)){
			return sdf.format(new Date());
		}else{
			if(date.length()>4){
				return date.substring(0,4);
			}else{
				return sdf.format(new Date());
			}
		}
	}
	public static String toThisYearThisMonth(String date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		if(date==null||"".equals(date)){
			return sdf.format(new Date());
		}else{
			if(date.length()>7){
				return date.substring(0,7);
			}else{
				return "";
			}
		}
	}
	////返回上一年的最后一天
	public static String toLastYearLastDay(String dateTime){
		if(dateTime==null||"".equals(dateTime)){
			dateTime=dateFormat(null,null);
		}
		int lastYear=Integer.parseInt(dateTime.substring(0,4))-1;
		return lastYear+"-12-31";
	}
	////返回上一年最后一个月的第一天
	public static String toLastYearFirstDay(String dateTime){
		if(dateTime==null||"".equals(dateTime)){
			dateTime=dateFormat(null,null);
		}
		int lastYear=Integer.parseInt(dateTime.substring(0,4))-1;
		return lastYear+"-12-01";
	}
	
	/* 获取当前月天数 */
	public static int getCurrentDay(String month, String year) {
		Integer monthInteger = Integer.parseInt(month);
		Integer yearInteger = Integer.parseInt(year);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, yearInteger);
		cal.set(Calendar.MONTH, monthInteger - 1);// Java月份才0开始算
		return cal.getActualMaximum(Calendar.DATE);
	}
	public static String dateFormat(Date date,String format){
		if(format==null){
			format="yyyy-MM-dd";
		}
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date==null){
			date=new Date();
		}
		return sdf.format(date);
	}
	/**
	 * 返回当年一月的最后一天
	 * */
	public static String toTheJanuLastDay(String reportDate) {
		// TODO Auto-generated method stub
		if(reportDate==null||"".equals(reportDate)){
			return dateFormat(null,"yyyy")+"-01-31";
		}else{
			return reportDate.substring(0,4)+"-01-31";
		}
	}
}
