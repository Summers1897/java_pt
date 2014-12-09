package com.k.webshop.service;
import java.util.List;

import com.k.webshop.model.Goods;
public interface GoodsService {
	public List<Goods> findGoodsList(String name, String shopId, String shopName, String typeid, String typeName) throws Exception;
	public void insert(Goods goods) throws Exception;
	public void update(Goods goods) throws Exception;
}
