package com.web.model;
/**
 * RoleRes entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleRes implements java.io.Serializable {
	// Fields
	private RoleResId id;
	// Constructors
	/** default constructor */
	public RoleRes() {
	}
	/** full constructor */
	public RoleRes(RoleResId id) {
		this.id = id;
	}
	// Property accessors
	public RoleResId getId() {
		return this.id;
	}
	public void setId(RoleResId id) {
		this.id = id;
	}
}