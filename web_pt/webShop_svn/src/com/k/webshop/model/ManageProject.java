package com.k.webshop.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * ManageProject entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ManageProject implements java.io.Serializable {
	// Fields
	private Integer id;
	private Shop shop;
	private String manageCode;
	private String manageContent;
	private Integer orderBy;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set managerTypes = new HashSet(0);
	// Constructors
	/** default constructor */
	public ManageProject() {
	}
	/** full constructor */
	public ManageProject(Shop shop, String manageCode, String manageContent, Integer orderBy, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3, Set managerTypes) {
		this.shop = shop;
		this.manageCode = manageCode;
		this.manageContent = manageContent;
		this.orderBy = orderBy;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.managerTypes = managerTypes;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Shop getShop() {
		return this.shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public String getManageCode() {
		return this.manageCode;
	}
	public void setManageCode(String manageCode) {
		this.manageCode = manageCode;
	}
	public String getManageContent() {
		return this.manageContent;
	}
	public void setManageContent(String manageContent) {
		this.manageContent = manageContent;
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
	public Set getManagerTypes() {
		return this.managerTypes;
	}
	public void setManagerTypes(Set managerTypes) {
		this.managerTypes = managerTypes;
	}
}