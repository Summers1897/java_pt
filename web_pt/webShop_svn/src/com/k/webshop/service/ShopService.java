package com.k.webshop.service;
import java.util.List;

import com.k.webshop.model.Shop;
public interface ShopService {
	public List<Shop> findShopList(String shopName) throws Exception;
	public void insert(Shop shop) throws Exception;
	public void update(Shop shop) throws Exception;
	public Shop findShopByIdHql(String id) throws Exception;
}
