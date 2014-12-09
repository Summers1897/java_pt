package com.k.webshop.util;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mchange.v1.db.sql.ConnectionUtils;
public class DBUtil {
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	private static String DRIVER;
	public static Connection getCon() {
		Connection conn = null;
		try {
			// 在类加载时初始化连接属性
			Properties props = new Properties();
			// 通过文件流将属性文件的信息
			InputStream is = ConnectionUtils.class.getClassLoader().getResourceAsStream("/market.properties");
			props.load(is);
			URL = props.getProperty("dbpt.url");
			USERNAME = props.getProperty("dbpt.username");
			PASSWORD = props.getProperty("dbpt.password");
			DRIVER = props.getProperty("dbpt.driver");
			
			
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			Logger log = Logger.getLogger(Logger.class);
			log.error(e.getMessage());
		}
		return conn;
	}
	public static Connection getIndicatorsKBCon() {
		Connection conn = null;
		try {
			// 在类加载时初始化连接属性
			Properties props = new Properties();
			// 通过文件流将属性文件的信息
			InputStream is = ConnectionUtils.class.getClassLoader().getResourceAsStream("/market.properties");
			props.load(is);
			URL = props.getProperty("IndicatorsKB.url");
			USERNAME = props.getProperty("IndicatorsKB.username");
			PASSWORD = props.getProperty("IndicatorsKB.password");
			DRIVER = props.getProperty("IndicatorsKB.driver");
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			Logger log = Logger.getLogger(Logger.class);
			log.error(e.getMessage());
		}
		return conn;
	}
	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (con != null) {
				con.close();
			}
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			Logger log = Logger.getLogger(Logger.class);
			log.error(e.getMessage());
		}
	}
}
