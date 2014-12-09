package com.k.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysRole entity. @author MyEclipse Persistence Tools
 */
public class SysRole implements java.io.Serializable {
	// Fields
	private Integer id;
	private String roleName;
	private String roleCode;
	private Date roleCreateDate;
	private Date roleDeleteDate;
	private Integer roleIsvalid;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysUsers = new HashSet(0);
	private Set sysRoleResources = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysRole() {
	}
	/** full constructor */
	public SysRole(String roleName, String roleCode, Date roleCreateDate, Date roleDeleteDate, Integer roleIsvalid, String attr1, String attr2, String attr3, Set sysUsers, Set sysRoleResources) {
		this.roleName = roleName;
		this.roleCode = roleCode;
		this.roleCreateDate = roleCreateDate;
		this.roleDeleteDate = roleDeleteDate;
		this.roleIsvalid = roleIsvalid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysUsers = sysUsers;
		this.sysRoleResources = sysRoleResources;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Date getRoleCreateDate() {
		return this.roleCreateDate;
	}
	public void setRoleCreateDate(Date roleCreateDate) {
		this.roleCreateDate = roleCreateDate;
	}
	public Date getRoleDeleteDate() {
		return this.roleDeleteDate;
	}
	public void setRoleDeleteDate(Date roleDeleteDate) {
		this.roleDeleteDate = roleDeleteDate;
	}
	public Integer getRoleIsvalid() {
		return this.roleIsvalid;
	}
	public void setRoleIsvalid(Integer roleIsvalid) {
		this.roleIsvalid = roleIsvalid;
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
	public Set getSysUsers() {
		return this.sysUsers;
	}
	public void setSysUsers(Set sysUsers) {
		this.sysUsers = sysUsers;
	}
	public Set getSysRoleResources() {
		return this.sysRoleResources;
	}
	public void setSysRoleResources(Set sysRoleResources) {
		this.sysRoleResources = sysRoleResources;
	}
}