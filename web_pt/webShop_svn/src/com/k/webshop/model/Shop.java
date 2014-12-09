package com.k.webshop.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Shop entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Shop implements java.io.Serializable {
	// Fields
	private Integer id;
	private SysUser sysUser;
	private String shopName;
	private String shopCode;
	private Integer orderBy;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set messages = new HashSet(0);
	private Set goodses = new HashSet(0);
	private Set manageProjects = new HashSet(0);
	private Set userShops = new HashSet(0);
	private Set publishGoodses = new HashSet(0);
	// Constructors
	/** default constructor */
	public Shop() {
	}
	/** full constructor */
	public Shop(SysUser sysUser, String shopName, String shopCode, Integer orderBy, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3, Set messages, Set goodses, Set manageProjects, Set userShops, Set publishGoodses) {
		this.sysUser = sysUser;
		this.shopName = shopName;
		this.shopCode = shopCode;
		this.orderBy = orderBy;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.messages = messages;
		this.goodses = goodses;
		this.manageProjects = manageProjects;
		this.userShops = userShops;
		this.publishGoodses = publishGoodses;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
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
	public Set getMessages() {
		return this.messages;
	}
	public void setMessages(Set messages) {
		this.messages = messages;
	}
	public Set getGoodses() {
		return this.goodses;
	}
	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}
	public Set getManageProjects() {
		return this.manageProjects;
	}
	public void setManageProjects(Set manageProjects) {
		this.manageProjects = manageProjects;
	}
	public Set getUserShops() {
		return this.userShops;
	}
	public void setUserShops(Set userShops) {
		this.userShops = userShops;
	}
	public Set getPublishGoodses() {
		return this.publishGoodses;
	}
	public void setPublishGoodses(Set publishGoodses) {
		this.publishGoodses = publishGoodses;
	}
}