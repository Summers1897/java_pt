package com.web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * SysPowerType entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysPowerType implements java.io.Serializable {
	// Fields
	private Long id;
	private SysPowerType sysPowerType;
	private String powerTypeName;
	private String powerTypeCode;
	private Long isValid;
	private Long orderby;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysOrgans = new HashSet(0);
	private Set sysPowerTypes = new HashSet(0);
	private Set planIndexes = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysPowerType() {
	}
	/** full constructor */
	public SysPowerType(SysPowerType sysPowerType, String powerTypeName, String powerTypeCode, Long isValid, Long orderby, String attr1, String attr2, String attr3, Set sysOrgans, Set sysPowerTypes, Set planIndexes) {
		this.sysPowerType = sysPowerType;
		this.powerTypeName = powerTypeName;
		this.powerTypeCode = powerTypeCode;
		this.isValid = isValid;
		this.orderby = orderby;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysOrgans = sysOrgans;
		this.sysPowerTypes = sysPowerTypes;
		this.planIndexes = planIndexes;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysPowerType getSysPowerType() {
		return this.sysPowerType;
	}
	public void setSysPowerType(SysPowerType sysPowerType) {
		this.sysPowerType = sysPowerType;
	}
	public String getPowerTypeName() {
		return this.powerTypeName;
	}
	public void setPowerTypeName(String powerTypeName) {
		this.powerTypeName = powerTypeName;
	}
	public String getPowerTypeCode() {
		return this.powerTypeCode;
	}
	public void setPowerTypeCode(String powerTypeCode) {
		this.powerTypeCode = powerTypeCode;
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
	public Set getSysOrgans() {
		return this.sysOrgans;
	}
	public void setSysOrgans(Set sysOrgans) {
		this.sysOrgans = sysOrgans;
	}
	public Set getSysPowerTypes() {
		return this.sysPowerTypes;
	}
	public void setSysPowerTypes(Set sysPowerTypes) {
		this.sysPowerTypes = sysPowerTypes;
	}
	public Set getPlanIndexes() {
		return this.planIndexes;
	}
	public void setPlanIndexes(Set planIndexes) {
		this.planIndexes = planIndexes;
	}
}