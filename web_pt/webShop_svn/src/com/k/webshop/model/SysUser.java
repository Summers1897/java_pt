package com.k.webshop.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUser implements java.io.Serializable {
	// Fields
	private Integer id;
	private String userCode;
	private Long userType;
	private String userRealName;
	private String userInventedName;
	private String userLoginName;
	private String userLoginPwd;
	private Date userLastLoginDate;
	private Integer orderBy;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set userShops = new HashSet(0);
	private Set messages = new HashSet(0);
	private Set shops = new HashSet(0);
	private Set userGoodses = new HashSet(0);
	private Set sysRoles = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysUser() {
	}
	/** full constructor */
	public SysUser(String userCode, Long userType, String userRealName, String userInventedName, String userLoginName, String userLoginPwd, Date userLastLoginDate, Integer orderBy, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3, Set userShops, Set messages, Set shops, Set userGoodses, Set sysRoles) {
		this.userCode = userCode;
		this.userType = userType;
		this.userRealName = userRealName;
		this.userInventedName = userInventedName;
		this.userLoginName = userLoginName;
		this.userLoginPwd = userLoginPwd;
		this.userLastLoginDate = userLastLoginDate;
		this.orderBy = orderBy;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.userShops = userShops;
		this.messages = messages;
		this.shops = shops;
		this.userGoodses = userGoodses;
		this.sysRoles = sysRoles;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Long getUserType() {
		return this.userType;
	}
	public void setUserType(Long userType) {
		this.userType = userType;
	}
	public String getUserRealName() {
		return this.userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserInventedName() {
		return this.userInventedName;
	}
	public void setUserInventedName(String userInventedName) {
		this.userInventedName = userInventedName;
	}
	public String getUserLoginName() {
		return this.userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserLoginPwd() {
		return this.userLoginPwd;
	}
	public void setUserLoginPwd(String userLoginPwd) {
		this.userLoginPwd = userLoginPwd;
	}
	public Date getUserLastLoginDate() {
		return this.userLastLoginDate;
	}
	public void setUserLastLoginDate(Date userLastLoginDate) {
		this.userLastLoginDate = userLastLoginDate;
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
	public Set getUserShops() {
		return this.userShops;
	}
	public void setUserShops(Set userShops) {
		this.userShops = userShops;
	}
	public Set getMessages() {
		return this.messages;
	}
	public void setMessages(Set messages) {
		this.messages = messages;
	}
	public Set getShops() {
		return this.shops;
	}
	public void setShops(Set shops) {
		this.shops = shops;
	}
	public Set getUserGoodses() {
		return this.userGoodses;
	}
	public void setUserGoodses(Set userGoodses) {
		this.userGoodses = userGoodses;
	}
	public Set getSysRoles() {
		return this.sysRoles;
	}
	public void setSysRoles(Set sysRoles) {
		this.sysRoles = sysRoles;
	}
}