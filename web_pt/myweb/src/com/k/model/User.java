package com.k.model;
import java.util.HashSet;
import java.util.Set;
/**
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class User implements java.io.Serializable {
	// Fields
	private Long id;
	private String usrLoginname;
	private String usrLoginpwd;
	private Long usrIsvalid;
	private Long usrOrderby;
	private Set resources = new HashSet(0);
	private Set loggers = new HashSet(0);
	// Constructors
	/** default constructor */
	public User() {
	}
	/** full constructor */
	public User(String usrLoginname, String usrLoginpwd, Long usrIsvalid, Long usrOrderby, Set resources, Set loggers) {
		this.usrLoginname = usrLoginname;
		this.usrLoginpwd = usrLoginpwd;
		this.usrIsvalid = usrIsvalid;
		this.usrOrderby = usrOrderby;
		this.resources = resources;
		this.loggers = loggers;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsrLoginname() {
		return this.usrLoginname;
	}
	public void setUsrLoginname(String usrLoginname) {
		this.usrLoginname = usrLoginname;
	}
	public String getUsrLoginpwd() {
		return this.usrLoginpwd;
	}
	public void setUsrLoginpwd(String usrLoginpwd) {
		this.usrLoginpwd = usrLoginpwd;
	}
	public Long getUsrIsvalid() {
		return this.usrIsvalid;
	}
	public void setUsrIsvalid(Long usrIsvalid) {
		this.usrIsvalid = usrIsvalid;
	}
	public Long getUsrOrderby() {
		return this.usrOrderby;
	}
	public void setUsrOrderby(Long usrOrderby) {
		this.usrOrderby = usrOrderby;
	}
	public Set getResources() {
		return this.resources;
	}
	public void setResources(Set resources) {
		this.resources = resources;
	}
	public Set getLoggers() {
		return this.loggers;
	}
	public void setLoggers(Set loggers) {
		this.loggers = loggers;
	}
}