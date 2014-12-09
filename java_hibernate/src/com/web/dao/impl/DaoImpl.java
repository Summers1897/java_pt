package com.web.dao.impl;
import org.hibernate.SQLQuery;

import com.web.model.SysVersion;
import com.web.util.dao.JunitDaoUtil;
public class DaoImpl extends JunitDaoUtil {
	@Override
	public void exe() {
		for (int i = 0; i < 10; i++) {
			m();
		}
	}
	public static void m() {
		try {
			SysVersion sv = new SysVersion();
			sv.setVersionName("temp");
			sv.setVersionCode("temp");
			sv.setAttr3("3");
			session.save(sv);
			tran.commit();
			tran.begin();
			String sql = "insert into pro_plan_data_report  select oapsequence.nextval,t.SYS_USER," + sv.getId() + ",t.PLAN_PROJECT,t.SYS_ORG,t.PRO_TYPE,t.DSB1,t.DSB2,t.DSB3,t.DSB4,t.DSB5,t.DSB6,t.DSB7,t.DSB8,t.DSB9,t.DSB10,t.DSBU1,t.DSBU2,t.DSBU3,t.DSBU4,t.DSBU5,t.DSBU6,t.DSBU7,t.DSBU8,t.DSBU9,t.DSBU10,t.DATA1,t.DATA2,t.DATA3,t.DATA4,t.DATA5,t.DATA6,t.DATA7,t.DATA8,t.DATA9,t.DATA10,t.DATAU1,t.DATAU2,t.DATAU3,t.DATAU4,t.DATAU5,t.DATAU6,t.DATAU7,t.DATAU8,t.DATAU9,t.DATAU10,t.TIME1,t.TIME2,t.TIME3,t.TIMEU1,t.TIMEU2,t.TIMEU3,t.REMARK,t.ATTR1,t.ATTR2,t.ATTR3,t.ATTR4,t.ATTR5 from pro_plan_data_report t";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
