package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysFlow entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysFlow implements java.io.Serializable {
	// Fields
	private Long id;
	private SysOrgan sysOrgan;
	private SysUser sysUser;
	private Date fillDate;
	private Date deleteDate;
	private Long attribute;
	private String flowName;
	private String flowCode;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysVersions = new HashSet(0);
	private Set sysSteps = new HashSet(0);
	private Set sysStepHises = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysFlow() {
	}
	/** minimal constructor */
	public SysFlow(String flowName) {
		this.flowName = flowName;
	}
	/** full constructor */
	public SysFlow(SysOrgan sysOrgan, SysUser sysUser, Date fillDate, Date deleteDate, Long attribute, String flowName, String flowCode, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set sysVersions, Set sysSteps, Set sysStepHises) {
		this.sysOrgan = sysOrgan;
		this.sysUser = sysUser;
		this.fillDate = fillDate;
		this.deleteDate = deleteDate;
		this.attribute = attribute;
		this.flowName = flowName;
		this.flowCode = flowCode;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysVersions = sysVersions;
		this.sysSteps = sysSteps;
		this.sysStepHises = sysStepHises;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Date getFillDate() {
		return this.fillDate;
	}
	public void setFillDate(Date fillDate) {
		this.fillDate = fillDate;
	}
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public Long getAttribute() {
		return this.attribute;
	}
	public void setAttribute(Long attribute) {
		this.attribute = attribute;
	}
	public String getFlowName() {
		return this.flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public String getFlowCode() {
		return this.flowCode;
	}
	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
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
	public Set getSysVersions() {
		return this.sysVersions;
	}
	public void setSysVersions(Set sysVersions) {
		this.sysVersions = sysVersions;
	}
	public Set getSysSteps() {
		return this.sysSteps;
	}
	public void setSysSteps(Set sysSteps) {
		this.sysSteps = sysSteps;
	}
	public Set getSysStepHises() {
		return this.sysStepHises;
	}
	public void setSysStepHises(Set sysStepHises) {
		this.sysStepHises = sysStepHises;
	}
}