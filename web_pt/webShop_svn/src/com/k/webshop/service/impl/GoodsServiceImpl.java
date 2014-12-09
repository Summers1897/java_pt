package com.k.webshop.service.impl;
import java.util.List;

import com.k.webshop.dao.GoodsDao;
import com.k.webshop.model.Goods;
import com.k.webshop.service.GoodsService;
public class GoodsServiceImpl implements GoodsService {
	private GoodsDao goodsDao;
	public GoodsDao getGoodsDao() {
		return goodsDao;
	}
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	/** ********************************** */
	@Override
	public List<Goods> findGoodsList(String name, String shopId, String shopName, String typeid, String typeName) throws Exception {
		return goodsDao.findGoodsList(name, shopId, shopName, typeid, typeName);
	}
	@Override
	public void insert(Goods goods) throws Exception {
		goodsDao.insert(goods);
	}
	@Override
	public void update(Goods goods) throws Exception {
		goodsDao.update(goods);
	}
}
