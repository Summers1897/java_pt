package com.k.webshop.dao.impl;
import java.util.List;

import com.k.webshop.core.BaseHibernate;
import com.k.webshop.dao.ShopDao;
import com.k.webshop.model.Shop;
public class ShopDaoImpl extends BaseHibernate implements ShopDao {
	@Override
	public List<Shop> findShopList(String shopName) throws Exception {
		return support().find("from Shop t where t.isValid=1 and t.shopName like '%" + shopName + "%'");
	}
	@Override
	public void insert(Shop shop) throws Exception {
		support().save(shop);
	}
	@Override
	public void update(Shop shop) throws Exception {
		support().update(shop);
	}
	@Override
	public Shop findShopByIdHql(String id) throws Exception {
		return (Shop) support().get(Shop.class, Long.parseLong(id));
	}
}
