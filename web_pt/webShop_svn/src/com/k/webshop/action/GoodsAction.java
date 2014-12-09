package com.k.webshop.action;
import java.util.List;

import com.k.webshop.action.base.PaginationAction;
import com.k.webshop.model.Goods;
import com.k.webshop.model.Shop;
import com.k.webshop.service.GoodsService;
import com.k.webshop.service.ShopService;
public class GoodsAction extends PaginationAction {
	private String goodsName;
	private String typeId;
	private String typeName;
	private String shopId;
	private String shopName;
	private Shop shop;
	private GoodsService goodsService;
	private ShopService shopService;
	/** ********************************************** */
	public String list() throws Exception {
		if (shopId != null && !"".equals(shopId)) {
			shop = shopService.findShopByIdHql(shopId);
			shopName = shop.getShopName();
		}
		List<Goods> list = goodsService.findGoodsList(goodsName, shopId, shopName, typeId, typeName);
		getListPage(list, getPage());
		return SUCCESS;
	}
	public String addPage() {
		return SUCCESS;
	}
	public String add() {
		return SUCCESS;
	}
	public String editPage() {
		return SUCCESS;
	}
	public String edit() {
		return SUCCESS;
	}
	public String delete() {
		return SUCCESS;
	}
	/** ****************************************************** */
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
