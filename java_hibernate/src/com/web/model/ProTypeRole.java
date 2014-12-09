package com.web.model;
/**
 * ProTypeRole entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ProTypeRole implements java.io.Serializable {
	// Fields
	private ProTypeRoleId id;
	// Constructors
	/** default constructor */
	public ProTypeRole() {
	}
	/** full constructor */
	public ProTypeRole(ProTypeRoleId id) {
		this.id = id;
	}
	// Property accessors
	public ProTypeRoleId getId() {
		return this.id;
	}
	public void setId(ProTypeRoleId id) {
		this.id = id;
	}
}