package com.k.webshop.service.impl;
import java.util.List;

import com.k.webshop.dao.ShopDao;
import com.k.webshop.model.Shop;
import com.k.webshop.service.ShopService;
public class ShopServiceImpl implements ShopService {
	private ShopDao shopDao;
	public ShopDao getShopDao() {
		return shopDao;
	}
	public void setShopDao(ShopDao shopDao) {
		this.shopDao = shopDao;
	}
	/** ******************************************************************************************* */
	@Override
	public List<Shop> findShopList(String shopName) throws Exception {
		return shopDao.findShopList(shopName);
	}
	@Override
	public void insert(Shop shop) throws Exception {
		shopDao.insert(shop);
	}
	@Override
	public void update(Shop shop) throws Exception {
		shopDao.update(shop);
	}
	@Override
	public Shop findShopByIdHql(String id) throws Exception {
		return shopDao.findShopByIdHql(id);
	}
}
