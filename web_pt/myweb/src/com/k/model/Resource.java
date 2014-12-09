package com.k.model;
/**
 * Resource entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Resource implements java.io.Serializable {
	// Fields
	private Long id;
	private User user;
	private String resName;
	private String resType;
	private String resUrl;
	private String resIsvalid;
	// Constructors
	/** default constructor */
	public Resource() {
	}
	/** full constructor */
	public Resource(User user, String resName, String resType, String resUrl, String resIsvalid) {
		this.user = user;
		this.resName = resName;
		this.resType = resType;
		this.resUrl = resUrl;
		this.resIsvalid = resIsvalid;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return this.user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getResName() {
		return this.resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResType() {
		return this.resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getResUrl() {
		return this.resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	public String getResIsvalid() {
		return this.resIsvalid;
	}
	public void setResIsvalid(String resIsvalid) {
		this.resIsvalid = resIsvalid;
	}
}