package util.db.sqlserver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.db.common.DBUtil;
public class SqlServerDB {
	public static void main(String[] args) throws Exception {
		Connection con = DBUtil.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("exec msdb.dbo.sp_help_job");
		while (rs.next()) {
			System.out.println(rs.getString("job_id"));
		}
	}
}
