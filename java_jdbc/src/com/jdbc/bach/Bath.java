package com.jdbc.bach;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.util.DBConnect;
public class Bath extends DBConnect {
	@Override
	public void execute() {
		String sql = " insert into dbt(id,dbd)values(dbs.nextval,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			// pst.setDouble(1, 1d);
			pst.setString(1, null);
			pst.addBatch();
			pst.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
