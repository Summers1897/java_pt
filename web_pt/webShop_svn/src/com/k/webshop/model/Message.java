package com.k.webshop.model;
import java.util.Date;
/**
 * Message entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Message implements java.io.Serializable {
	// Fields
	private Integer id;
	private Shop shop;
	private SysUser sysUser;
	private String messageCode;
	private String messageContent;
	private Long messageStasus;
	private Integer orderBy;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public Message() {
	}
	/** full constructor */
	public Message(Shop shop, SysUser sysUser, String messageCode, String messageContent, Long messageStasus, Integer orderBy, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3) {
		this.shop = shop;
		this.sysUser = sysUser;
		this.messageCode = messageCode;
		this.messageContent = messageContent;
		this.messageStasus = messageStasus;
		this.orderBy = orderBy;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
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
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getMessageCode() {
		return this.messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getMessageContent() {
		return this.messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Long getMessageStasus() {
		return this.messageStasus;
	}
	public void setMessageStasus(Long messageStasus) {
		this.messageStasus = messageStasus;
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
}