package com.k.web.model;
/**
 * RoleUser entity. @author MyEclipse Persistence Tools
 */
public class RoleUser implements java.io.Serializable {
	// Fields
	private Long id;
	private MyRole myRoleByRole;
	private MyRole myRoleByUser;
	// Constructors
	/** default constructor */
	public RoleUser() {
	}
	/** full constructor */
	public RoleUser(MyRole myRoleByRole, MyRole myRoleByUser) {
		this.myRoleByRole = myRoleByRole;
		this.myRoleByUser = myRoleByUser;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MyRole getMyRoleByRole() {
		return this.myRoleByRole;
	}
	public void setMyRoleByRole(MyRole myRoleByRole) {
		this.myRoleByRole = myRoleByRole;
	}
	public MyRole getMyRoleByUser() {
		return this.myRoleByUser;
	}
	public void setMyRoleByUser(MyRole myRoleByUser) {
		this.myRoleByUser = myRoleByUser;
	}
}