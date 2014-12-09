package com.web.model;
/**
 * SysUserVersion entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUserVersion implements java.io.Serializable {
	// Fields
	private SysUserVersionId id;
	// Constructors
	/** default constructor */
	public SysUserVersion() {
	}
	/** full constructor */
	public SysUserVersion(SysUserVersionId id) {
		this.id = id;
	}
	// Property accessors
	public SysUserVersionId getId() {
		return this.id;
	}
	public void setId(SysUserVersionId id) {
		this.id = id;
	}
}