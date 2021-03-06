package com.k.model;
/**
 * SysRoleResource entity. @author MyEclipse Persistence Tools
 */
public class SysRoleResource implements java.io.Serializable {
	// Fields
	private Integer id;
	private SysRole sysRole;
	private SysResource sysResource;
	// Constructors
	/** default constructor */
	public SysRoleResource() {
	}
	/** full constructor */
	public SysRoleResource(SysRole sysRole, SysResource sysResource) {
		this.sysRole = sysRole;
		this.sysResource = sysResource;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysResource getSysResource() {
		return this.sysResource;
	}
	public void setSysResource(SysResource sysResource) {
		this.sysResource = sysResource;
	}
}