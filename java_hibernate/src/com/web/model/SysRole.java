package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysRole entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysRole implements java.io.Serializable {
	// Fields
	private Long id;
	private SysUser sysUser;
	private Long roleType;
	private String roleCode;
	private String roleName;
	private Date createDate;
	private Date deleteDate;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set stepRoles = new HashSet(0);
	private Set roleUsers = new HashSet(0);
	private Set proTypeRoles = new HashSet(0);
	private Set roleReses = new HashSet(0);
	private Set roleIndexes = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysRole() {
	}
	/** minimal constructor */
	public SysRole(Long roleType, String roleCode, String roleName) {
		this.roleType = roleType;
		this.roleCode = roleCode;
		this.roleName = roleName;
	}
	/** full constructor */
	public SysRole(SysUser sysUser, Long roleType, String roleCode, String roleName, Date createDate, Date deleteDate, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set stepRoles, Set roleUsers, Set proTypeRoles, Set roleReses, Set roleIndexes) {
		this.sysUser = sysUser;
		this.roleType = roleType;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.stepRoles = stepRoles;
		this.roleUsers = roleUsers;
		this.proTypeRoles = proTypeRoles;
		this.roleReses = roleReses;
		this.roleIndexes = roleIndexes;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Long getRoleType() {
		return this.roleType;
	}
	public void setRoleType(Long roleType) {
		this.roleType = roleType;
	}
	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public Long getOrderby() {
		return this.orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
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
	public Set getStepRoles() {
		return this.stepRoles;
	}
	public void setStepRoles(Set stepRoles) {
		this.stepRoles = stepRoles;
	}
	public Set getRoleUsers() {
		return this.roleUsers;
	}
	public void setRoleUsers(Set roleUsers) {
		this.roleUsers = roleUsers;
	}
	public Set getProTypeRoles() {
		return this.proTypeRoles;
	}
	public void setProTypeRoles(Set proTypeRoles) {
		this.proTypeRoles = proTypeRoles;
	}
	public Set getRoleReses() {
		return this.roleReses;
	}
	public void setRoleReses(Set roleReses) {
		this.roleReses = roleReses;
	}
	public Set getRoleIndexes() {
		return this.roleIndexes;
	}
	public void setRoleIndexes(Set roleIndexes) {
		this.roleIndexes = roleIndexes;
	}
}