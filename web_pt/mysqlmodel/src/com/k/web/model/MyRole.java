package com.k.web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * MyRole entity. @author MyEclipse Persistence Tools
 */
public class MyRole implements java.io.Serializable {
	// Fields
	private Long id;
	private String roleName;
	private String roleCode;
	private Set roleUsersForUser = new HashSet(0);
	private Set roleUsersForRole = new HashSet(0);
	// Constructors
	/** default constructor */
	public MyRole() {
	}
	/** full constructor */
	public MyRole(String roleName, String roleCode, Set roleUsersForUser, Set roleUsersForRole) {
		this.roleName = roleName;
		this.roleCode = roleCode;
		this.roleUsersForUser = roleUsersForUser;
		this.roleUsersForRole = roleUsersForRole;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
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
	public Set getRoleUsersForUser() {
		return this.roleUsersForUser;
	}
	public void setRoleUsersForUser(Set roleUsersForUser) {
		this.roleUsersForUser = roleUsersForUser;
	}
	public Set getRoleUsersForRole() {
		return this.roleUsersForRole;
	}
	public void setRoleUsersForRole(Set roleUsersForRole) {
		this.roleUsersForRole = roleUsersForRole;
	}
}