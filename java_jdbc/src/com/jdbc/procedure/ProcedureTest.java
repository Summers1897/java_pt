package com.jdbc.procedure;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.jdbc.util.DBConnect;
public class ProcedureTest extends DBConnect {
	private CallableStatement call;
	@Override
	public void execute() {
		try {
			call = con.prepareCall("{call dfds(?,?)}");
			call.setInt(1, 1);
			call.registerOutParameter(2, Types.VARCHAR);
			call.execute();
			String ov = call.getString(2);
			System.out.println(ov);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
