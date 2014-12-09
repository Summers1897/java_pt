package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysResource entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysResource implements java.io.Serializable {
	// Fields
	private Long id;
	private SysResource sysResource;
	private Long resType;
	private String resCode;
	private String resName;
	private String resUrl;
	private String resImgUrl;
	private Date deleteDate;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysResources = new HashSet(0);
	private Set roleReses = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysResource() {
	}
	/** minimal constructor */
	public SysResource(Long resType, String resCode, String resName, String resUrl, Long isValid) {
		this.resType = resType;
		this.resCode = resCode;
		this.resName = resName;
		this.resUrl = resUrl;
		this.isValid = isValid;
	}
	/** full constructor */
	public SysResource(SysResource sysResource, Long resType, String resCode, String resName, String resUrl, String resImgUrl, Date deleteDate, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set sysResources, Set roleReses) {
		this.sysResource = sysResource;
		this.resType = resType;
		this.resCode = resCode;
		this.resName = resName;
		this.resUrl = resUrl;
		this.resImgUrl = resImgUrl;
		this.deleteDate = deleteDate;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysResources = sysResources;
		this.roleReses = roleReses;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysResource getSysResource() {
		return this.sysResource;
	}
	public void setSysResource(SysResource sysResource) {
		this.sysResource = sysResource;
	}
	public Long getResType() {
		return this.resType;
	}
	public void setResType(Long resType) {
		this.resType = resType;
	}
	public String getResCode() {
		return this.resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResName() {
		return this.resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResUrl() {
		return this.resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	public String getResImgUrl() {
		return this.resImgUrl;
	}
	public void setResImgUrl(String resImgUrl) {
		this.resImgUrl = resImgUrl;
	}
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public Long getOrderby() {
		return this.orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
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
	public Set getSysResources() {
		return this.sysResources;
	}
	public void setSysResources(Set sysResources) {
		this.sysResources = sysResources;
	}
	public Set getRoleReses() {
		return this.roleReses;
	}
	public void setRoleReses(Set roleReses) {
		this.roleReses = roleReses;
	}
}