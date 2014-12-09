package com.web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * SysType entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysType implements java.io.Serializable {
	// Fields
	private Long id;
	private SysType sysType;
	private SysUser sysUser;
	private String typeName;
	private Long typeType;
	private String typeCode;
	private Long typeIsView;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysTypes = new HashSet(0);
	private Set planIndexes = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysType() {
	}
	/** minimal constructor */
	public SysType(String typeName, String typeCode) {
		this.typeName = typeName;
		this.typeCode = typeCode;
	}
	/** full constructor */
	public SysType(SysType sysType, SysUser sysUser, String typeName, Long typeType, String typeCode, Long typeIsView, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set sysTypes, Set planIndexes) {
		this.sysType = sysType;
		this.sysUser = sysUser;
		this.typeName = typeName;
		this.typeType = typeType;
		this.typeCode = typeCode;
		this.typeIsView = typeIsView;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysTypes = sysTypes;
		this.planIndexes = planIndexes;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysType getSysType() {
		return this.sysType;
	}
	public void setSysType(SysType sysType) {
		this.sysType = sysType;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Long getTypeType() {
		return this.typeType;
	}
	public void setTypeType(Long typeType) {
		this.typeType = typeType;
	}
	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public Long getTypeIsView() {
		return this.typeIsView;
	}
	public void setTypeIsView(Long typeIsView) {
		this.typeIsView = typeIsView;
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
	public Set getSysTypes() {
		return this.sysTypes;
	}
	public void setSysTypes(Set sysTypes) {
		this.sysTypes = sysTypes;
	}
	public Set getPlanIndexes() {
		return this.planIndexes;
	}
	public void setPlanIndexes(Set planIndexes) {
		this.planIndexes = planIndexes;
	}
}