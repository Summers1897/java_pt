package util.page.util;
import org.hibernate.Query;

import util.page.Page;
public class PageSqlUtil {
	public String getSqlUtil(String sql) {
		StringBuilder builder = new StringBuilder();
		builder.append("select * from (" + sql + ")");
		return builder.toString();
	}
	public Query getSessionUtil(Query query, Page page) {
		query.setMaxResults(page.getMaxNum());
		query.setFirstResult(page.getMinNum());
		return query;
	}
}
