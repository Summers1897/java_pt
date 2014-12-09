package com.k.webshop.model;
import java.util.Date;
/**
 * UserGoods entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class UserGoods implements java.io.Serializable {
	// Fields
	private Integer id;
	private Goods goods;
	private SysUser sysUser;
	private String collectCode;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public UserGoods() {
	}
	/** full constructor */
	public UserGoods(Goods goods, SysUser sysUser, String collectCode, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3) {
		this.goods = goods;
		this.sysUser = sysUser;
		this.collectCode = collectCode;
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
	public Goods getGoods() {
		return this.goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getCollectCode() {
		return this.collectCode;
	}
	public void setCollectCode(String collectCode) {
		this.collectCode = collectCode;
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