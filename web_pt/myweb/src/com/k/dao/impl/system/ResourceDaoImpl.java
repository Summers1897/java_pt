package com.k.dao.impl.system;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

import com.k.core.hibernate.BaseHibernate;
import com.k.dao.system.ResourceDao;
import com.k.vo.SysResourceVO;
public class ResourceDaoImpl extends BaseHibernate implements ResourceDao {
	@Override
	public List<SysResourceVO> getAllRes() throws Exception {
		String sql = "select t.id,t.res_name resName, t.res_parent parentId, t.res_type resType, t.res_url resUrl, level   from sys_resource t where t.id!=-1 and t.res_isvalid = 1 start with t.id = -1 connect by prior t.id = t.res_parent order siblings by t.res_orderby";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.addScalar("id", Hibernate.STRING);
		query.addScalar("parentId", Hibernate.STRING);
		query.addScalar("resName", Hibernate.STRING);
		query.addScalar("resType", Hibernate.STRING);
		query.addScalar("resUrl", Hibernate.STRING);
		query.addScalar("level", Hibernate.INTEGER);
		query.setResultTransformer(Transformers.aliasToBean(SysResourceVO.class));
		return query.list();
	}

	@Override
	public List<SysResourceVO> getMysqlAllRes() throws Exception {
		String sql = "select t.id, t.res_name resname, t.res_id parentid, t.res_type restype, t.res_url resurl from resource t where t.id != 1 and t.res_isvalid = 1 order by t.id ";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.addScalar("id", Hibernate.STRING);
		query.addScalar("parentId", Hibernate.STRING);
		query.addScalar("resName", Hibernate.STRING);
		query.addScalar("resType", Hibernate.STRING);
		query.addScalar("resUrl", Hibernate.STRING);
		query.setResultTransformer(Transformers.aliasToBean(SysResourceVO.class));
		return query.list();
	}
	@Override
	public SysResourceVO getRootRes() throws Exception {
		String sql = "select t.id, t.res_name resname, t.res_id parentid, t.res_type restype, t.res_url resurl from resource t where t.res_id is null ";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.addScalar("id", Hibernate.STRING);
		query.addScalar("parentId", Hibernate.STRING);
		query.addScalar("resName", Hibernate.STRING);
		query.addScalar("resType", Hibernate.STRING);
		query.addScalar("resUrl", Hibernate.STRING);
		query.setResultTransformer(Transformers.aliasToBean(SysResourceVO.class));
		List<SysResourceVO> list=query.list();
		return list.size()>0?list.get(0):null;
	}
	 @Override
	public List<SysResourceVO> getResByParent(String par, int level) throws Exception {
		 String sql = "select "+level+" level, t.id, t.res_name resname, t.res_id parentid, t.res_type restype, t.res_url resurl from resource t where t.res_id="+par+" and t.res_isvalid = 1 order by t.id ";
			SQLQuery query = getSession().createSQLQuery(sql);
			query.addScalar("id", Hibernate.STRING);
			query.addScalar("parentId", Hibernate.STRING);
			query.addScalar("resName", Hibernate.STRING);
			query.addScalar("resType", Hibernate.STRING);
			query.addScalar("resUrl", Hibernate.STRING);
			query.addScalar("level", Hibernate.INTEGER);
			query.setResultTransformer(Transformers.aliasToBean(SysResourceVO.class));
			return query.list();
	}
}
