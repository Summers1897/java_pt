package com.k.webshop.dao;
import java.util.List;

import com.k.webshop.model.Goods;
public interface GoodsDao {
	public List<Goods> findGoodsList(String goodsName, String shopId, String shopName, String typeid, String typeName) throws Exception;
	public void insert(Goods goods) throws Exception;
	public void update(Goods goods) throws Exception;
}
