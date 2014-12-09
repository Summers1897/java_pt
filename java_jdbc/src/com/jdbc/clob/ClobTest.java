package com.jdbc.clob;
import java.sql.SQLException;

import com.jdbc.util.DBConnect;
public class ClobTest extends DBConnect {
	@Override
	public void execute() {
		insert();
		update();
	}
	private static void insert() {
		// 不可以这样使用
		String sql = "select * from project_type t where  t.type_const='update'";
		try {
			rs = st.executeQuery(sql);
			String str;
			while (rs.next()) {
				str = rs.getString("type_const");
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void update() {
		String sql = "update project_type t set t.type_const='update' where t.id=2";
		try {
			st.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void delte() {
		String sql = "select * from project_type";
		try {
			rs = st.executeQuery(sql);
			String str;
			while (rs.next()) {
				str = rs.getString("type_const");
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
