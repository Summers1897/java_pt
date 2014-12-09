package com.k.log;
import org.apache.log4j.Logger;
public class LogTest {
	private static Logger logger = Logger.getLogger("info");
	public static void main(String[] args) {
		String ss = null;
		try {
			ss.length();
		} catch (Exception e) {
			logger.error("1", e);
			e.printStackTrace();
		}
	}
}
