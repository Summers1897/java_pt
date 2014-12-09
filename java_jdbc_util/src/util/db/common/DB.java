package util.db.common;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
public class DB {
	public static void sqlEx(List<String> ss) throws Exception {
		Connection con = DBUtil.getCon();
		Statement st = con.createStatement();
		for (String s : ss) {
			st.addBatch(s);
		}
		st.executeBatch();
		st.clearBatch();
		DBUtil.close(con, st, null);
	}
}
