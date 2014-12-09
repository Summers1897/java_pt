package com.web.model;
/**
 * RoleIndex entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleIndex implements java.io.Serializable {
	// Fields
	private RoleIndexId id;
	// Constructors
	/** default constructor */
	public RoleIndex() {
	}
	/** full constructor */
	public RoleIndex(RoleIndexId id) {
		this.id = id;
	}
	// Property accessors
	public RoleIndexId getId() {
		return this.id;
	}
	public void setId(RoleIndexId id) {
		this.id = id;
	}
}