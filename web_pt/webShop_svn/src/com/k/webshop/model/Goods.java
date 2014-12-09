package com.k.webshop.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Goods entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Goods implements java.io.Serializable {
	// Fields
	private Integer id;
	private GoodsType goodsType;
	private Shop shop;
	private String goodsName;
	private String goodsCode;
	private Integer goodsAmount;
	private Integer goodsOverflowAmount;
	private String goodsPic;
	private Float goodsPrice;
	private Float goodsDiscount;
	private Integer orderBy;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set userGoodses = new HashSet(0);
	private Set publishGoodses = new HashSet(0);
	// Constructors
	/** default constructor */
	public Goods() {
	}
	/** full constructor */
	public Goods(GoodsType goodsType, Shop shop, String goodsName, String goodsCode, Integer goodsAmount, Integer goodsOverflowAmount, String goodsPic, Float goodsPrice, Float goodsDiscount, Integer orderBy, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3, Set userGoodses, Set publishGoodses) {
		this.goodsType = goodsType;
		this.shop = shop;
		this.goodsName = goodsName;
		this.goodsCode = goodsCode;
		this.goodsAmount = goodsAmount;
		this.goodsOverflowAmount = goodsOverflowAmount;
		this.goodsPic = goodsPic;
		this.goodsPrice = goodsPrice;
		this.goodsDiscount = goodsDiscount;
		this.orderBy = orderBy;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.userGoodses = userGoodses;
		this.publishGoodses = publishGoodses;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public GoodsType getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	public Shop getShop() {
		return this.shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public Integer getGoodsAmount() {
		return this.goodsAmount;
	}
	public void setGoodsAmount(Integer goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public Integer getGoodsOverflowAmount() {
		return this.goodsOverflowAmount;
	}
	public void setGoodsOverflowAmount(Integer goodsOverflowAmount) {
		this.goodsOverflowAmount = goodsOverflowAmount;
	}
	public String getGoodsPic() {
		return this.goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	public Float getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Float getGoodsDiscount() {
		return this.goodsDiscount;
	}
	public void setGoodsDiscount(Float goodsDiscount) {
		this.goodsDiscount = goodsDiscount;
	}
	public Integer getOrderBy() {
		return this.orderBy;
	}
	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAttr1() {
		return this.attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	public String getAttr2() {
		return this.attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public String getAttr3() {
		return this.attr3;
	}
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	public Set getUserGoodses() {
		return this.userGoodses;
	}
	public void setUserGoodses(Set userGoodses) {
		this.userGoodses = userGoodses;
	}
	public Set getPublishGoodses() {
		return this.publishGoodses;
	}
	public void setPublishGoodses(Set publishGoodses) {
		this.publishGoodses = publishGoodses;
	}
}