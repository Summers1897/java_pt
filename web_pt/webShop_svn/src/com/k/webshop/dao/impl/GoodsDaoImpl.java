package com.k.webshop.dao.impl;
import java.util.List;

import org.hibernate.Query;

import com.k.webshop.core.BaseHibernate;
import com.k.webshop.dao.GoodsDao;
import com.k.webshop.model.Goods;
public class GoodsDaoImpl extends BaseHibernate implements GoodsDao {
	@Override
	public List<Goods> findGoodsList(String goodsName, String shopId, String shopName, String typeId, String typeName) throws Exception {
		StringBuffer hql = new StringBuffer("from Goods t where t.isValid=1");
		if (goodsName != null && !"".equals(goodsName)) {
			hql.append(" and t.goodsName like '%" + goodsName + "%'");
		}
		if (shopId != null && !"".equals(shopId)) {
			hql.append(" and t.shop.id = " + shopId + "");
		}
		if (shopName != null && !"".equals(shopName)) {
			hql.append(" and t.shop.shopName like '% " + shopName + "%'");
		}
		if (typeId != null && !"".equals(typeId)) {
			hql.append(" and t.goodsType = " + typeId + "");
		}
		if (typeName != null && !"".equals(typeName)) {
			hql.append(" and t.goodsType.typeName like '% " + typeName + "%'");
		}
		hql.append(" order by t.orderBy");
		Query query = supportSession().createQuery(hql.toString());
		return query.list();
	}
	@Override
	public void insert(Goods goods) throws Exception {
		support().save(goods);
	}
	@Override
	public void update(Goods goods) throws Exception {
		support().update(goods);
	}
}
