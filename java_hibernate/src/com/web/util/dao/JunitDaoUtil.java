package com.web.util.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.web.util.hibernate.HibernateSessionFactory;
public abstract class JunitDaoUtil {
	public static Session session;
	public static Connection con;
	public static Statement st;
	public static ResultSet rs;
	public static Transaction tran;
	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSessionFactory().openSession();
		tran = session.beginTransaction();
		con = session.connection();
	}
	@Test
	public abstract void exe();
	@After
	public void tearDown() throws Exception {
		tran.commit();
		con.commit();
		session.close();
	}
}
