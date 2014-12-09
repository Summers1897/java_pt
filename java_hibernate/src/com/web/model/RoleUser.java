package com.web.model;
/**
 * RoleUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleUser implements java.io.Serializable {
	// Fields
	private RoleUserId id;
	// Constructors
	/** default constructor */
	public RoleUser() {
	}
	/** full constructor */
	public RoleUser(RoleUserId id) {
		this.id = id;
	}
	// Property accessors
	public RoleUserId getId() {
		return this.id;
	}
	public void setId(RoleUserId id) {
		this.id = id;
	}
}