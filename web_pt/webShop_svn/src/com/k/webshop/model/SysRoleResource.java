package com.k.webshop.model;
import java.util.Date;
/**
 * SysRoleResource entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysRoleResource implements java.io.Serializable {
	// Fields
	private Integer id;
	private SysResource sysResource;
	private SysRole sysRole;
	private Long isValid;
	private Date createDate;
	private Date deleteDate;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public SysRoleResource() {
	}
	/** full constructor */
	public SysRoleResource(SysResource sysResource, SysRole sysRole, Long isValid, Date createDate, Date deleteDate, String remark, String attr1, String attr2, String attr3) {
		this.sysResource = sysResource;
		this.sysRole = sysRole;
		this.isValid = isValid;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SysResource getSysResource() {
		return this.sysResource;
	}
	public void setSysResource(SysResource sysResource) {
		this.sysResource = sysResource;
	}
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
}