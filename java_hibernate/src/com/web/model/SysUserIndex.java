package com.web.model;
/**
 * SysUserIndex entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUserIndex implements java.io.Serializable {
	// Fields
	private SysUserIndexId id;
	// Constructors
	/** default constructor */
	public SysUserIndex() {
	}
	/** full constructor */
	public SysUserIndex(SysUserIndexId id) {
		this.id = id;
	}
	// Property accessors
	public SysUserIndexId getId() {
		return this.id;
	}
	public void setId(SysUserIndexId id) {
		this.id = id;
	}
}