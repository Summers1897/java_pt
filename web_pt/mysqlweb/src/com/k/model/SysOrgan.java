package com.k.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysOrgan entity. @author MyEclipse Persistence Tools
 */
public class SysOrgan implements java.io.Serializable {
	// Fields
	private Integer id;
	private String organName;
	private String organCode;
	private Date organCreateDate;
	private Date organDeleteDate;
	private Integer organIsvalid;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysUsers = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysOrgan() {
	}
	/** full constructor */
	public SysOrgan(String organName, String organCode, Date organCreateDate, Date organDeleteDate, Integer organIsvalid, String attr1, String attr2, String attr3, Set sysUsers) {
		this.organName = organName;
		this.organCode = organCode;
		this.organCreateDate = organCreateDate;
		this.organDeleteDate = organDeleteDate;
		this.organIsvalid = organIsvalid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysUsers = sysUsers;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrganName() {
		return this.organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
	}
	public String getOrganCode() {
		return this.organCode;
	}
	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}
	public Date getOrganCreateDate() {
		return this.organCreateDate;
	}
	public void setOrganCreateDate(Date organCreateDate) {
		this.organCreateDate = organCreateDate;
	}
	public Date getOrganDeleteDate() {
		return this.organDeleteDate;
	}
	public void setOrganDeleteDate(Date organDeleteDate) {
		this.organDeleteDate = organDeleteDate;
	}
	public Integer getOrganIsvalid() {
		return this.organIsvalid;
	}
	public void setOrganIsvalid(Integer organIsvalid) {
		this.organIsvalid = organIsvalid;
	}
	public String getAttr1() {
		return this.attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	public String getAttr2() {
		return this.attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public String getAttr3() {
		return this.attr3;
	}
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	public Set getSysUsers() {
		return this.sysUsers;
	}
	public void setSysUsers(Set sysUsers) {
		this.sysUsers = sysUsers;
	}
}