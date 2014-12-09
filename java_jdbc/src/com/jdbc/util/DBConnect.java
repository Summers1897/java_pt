package com.jdbc.util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jdbc.db.DBUtil;
public abstract class DBConnect {
	public static Connection con;
	public static Statement st;
	public static ResultSet rs;
	@Before
	public void setUp() throws Exception {
		con = DBUtil.getCon();
		st = con.createStatement();
	}
	@Test
	public abstract void execute();
	@After
	public void tearDown() throws Exception {
		con.commit();
		DBUtil.close(con, st, rs);
	}
}
