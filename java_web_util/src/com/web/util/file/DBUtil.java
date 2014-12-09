package com.web.util.file;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class DBUtil {
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	private static String DRIVER;
	public static Connection getCon() {
		Connection conn = null;
		try {
			String nameSpace = "oap.";
			// 在类加载时初始化连接属性
			Properties props = new Properties();
			// 通过文件流将属性文件的信息
			InputStream is = Connection.class.getClassLoader().getSystemResourceAsStream("oap.properties");
			// InputStream is =
			// ConnectionUtils.class.getClassLoader().getResourceAsStream(
			// "oap.properties");
			props.load(is);
			URL = props.getProperty(nameSpace + "url");
			USERNAME = props.getProperty(nameSpace + "username");
			PASSWORD = props.getProperty(nameSpace + "password");
			DRIVER = props.getProperty(nameSpace + "driver");
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
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
		}
	}
	public static void main(String[] args) {
		getCon();
	}
}
