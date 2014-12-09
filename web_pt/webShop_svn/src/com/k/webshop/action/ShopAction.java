package com.k.webshop.action;
import java.util.List;

import com.googlecode.jsonplugin.annotations.JSON;
import com.k.webshop.action.base.PaginationAction;
import com.k.webshop.model.Shop;
import com.k.webshop.service.ShopService;
public class ShopAction extends PaginationAction {
	private String shopId;
	private Shop shop;
	private String shopName;
	private ShopService shopService;
	/** ***************************************** */
	public String list() throws Exception {
		List<Shop> list = shopService.findShopList(shopName);
		getListPage(list, getPage());
		return SUCCESS;
	}
	public String addPage() {
		return SUCCESS;
	}
	public String add() throws Exception {
		shopService.insert(shop);
		return SUCCESS;
	}
	public String editPage() throws Exception {
		shopService.findShopByIdHql(shopId);
		return SUCCESS;
	}
	public String edit() throws Exception {
		shopService.update(shop);
		return SUCCESS;
	}
	public String delete() throws Exception {
		shop = shopService.findShopByIdHql(shopId);
		shop.setIsValid(0l);
		shopService.update(shop);
		return SUCCESS;
	}
	public String shopGoodsList() {
		return SUCCESS;
	}
	/** ************************************************** */
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@JSON(serialize = false)
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
}
