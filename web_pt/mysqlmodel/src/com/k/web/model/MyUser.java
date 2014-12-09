package com.k.web.model;
/**
 * MyUser entity. @author MyEclipse Persistence Tools
 */
public class MyUser implements java.io.Serializable {
	// Fields
	private Long id;
	private String userName;
	private String userCode;
	// Constructors
	/** default constructor */
	public MyUser() {
	}
	/** full constructor */
	public MyUser(String userName, String userCode) {
		this.userName = userName;
		this.userCode = userCode;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
}