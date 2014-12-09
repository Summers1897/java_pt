package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysVersion entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysVersion implements java.io.Serializable {
	// Fields
	private Long id;
	private SysFlow sysFlow;
	private SysOrgan sysOrgan;
	private SysUser sysUser;
	private String versionName;
	private String versionCode;
	private Long versionType;
	private Long versionStatus;
	private String fillUser;
	private Date fillDate;
	private String approvalUser;
	private Date approvalDate;
	private Long isStepComplet;
	private Date versionDate;
	private Date createDate;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set planIndexDataReports = new HashSet(0);
	private Set recmanaAttachments = new HashSet(0);
	private Set proPlanDataReports = new HashSet(0);
	private Set resolveIndexDatas = new HashSet(0);
	private Set projectPlanDatas = new HashSet(0);
	private Set planIndexDatas = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysVersion() {
	}
	/** minimal constructor */
	public SysVersion(String versionName, String versionCode) {
		this.versionName = versionName;
		this.versionCode = versionCode;
	}
	/** full constructor */
	public SysVersion(SysFlow sysFlow, SysOrgan sysOrgan, SysUser sysUser, String versionName, String versionCode, Long versionType, Long versionStatus, String fillUser, Date fillDate, String approvalUser, Date approvalDate, Long isStepComplet, Date versionDate, Date createDate, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set planIndexDataReports, Set recmanaAttachments, Set proPlanDataReports, Set resolveIndexDatas, Set projectPlanDatas, Set planIndexDatas) {
		this.sysFlow = sysFlow;
		this.sysOrgan = sysOrgan;
		this.sysUser = sysUser;
		this.versionName = versionName;
		this.versionCode = versionCode;
		this.versionType = versionType;
		this.versionStatus = versionStatus;
		this.fillUser = fillUser;
		this.fillDate = fillDate;
		this.approvalUser = approvalUser;
		this.approvalDate = approvalDate;
		this.isStepComplet = isStepComplet;
		this.versionDate = versionDate;
		this.createDate = createDate;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.planIndexDataReports = planIndexDataReports;
		this.recmanaAttachments = recmanaAttachments;
		this.proPlanDataReports = proPlanDataReports;
		this.resolveIndexDatas = resolveIndexDatas;
		this.projectPlanDatas = projectPlanDatas;
		this.planIndexDatas = planIndexDatas;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysFlow getSysFlow() {
		return this.sysFlow;
	}
	public void setSysFlow(SysFlow sysFlow) {
		this.sysFlow = sysFlow;
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
	public String getVersionName() {
		return this.versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getVersionCode() {
		return this.versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public Long getVersionType() {
		return this.versionType;
	}
	public void setVersionType(Long versionType) {
		this.versionType = versionType;
	}
	public Long getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(Long versionStatus) {
		this.versionStatus = versionStatus;
	}
	public String getFillUser() {
		return this.fillUser;
	}
	public void setFillUser(String fillUser) {
		this.fillUser = fillUser;
	}
	public Date getFillDate() {
		return this.fillDate;
	}
	public void setFillDate(Date fillDate) {
		this.fillDate = fillDate;
	}
	public String getApprovalUser() {
		return this.approvalUser;
	}
	public void setApprovalUser(String approvalUser) {
		this.approvalUser = approvalUser;
	}
	public Date getApprovalDate() {
		return this.approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public Long getIsStepComplet() {
		return this.isStepComplet;
	}
	public void setIsStepComplet(Long isStepComplet) {
		this.isStepComplet = isStepComplet;
	}
	public Date getVersionDate() {
		return this.versionDate;
	}
	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public Set getPlanIndexDataReports() {
		return this.planIndexDataReports;
	}
	public void setPlanIndexDataReports(Set planIndexDataReports) {
		this.planIndexDataReports = planIndexDataReports;
	}
	public Set getRecmanaAttachments() {
		return this.recmanaAttachments;
	}
	public void setRecmanaAttachments(Set recmanaAttachments) {
		this.recmanaAttachments = recmanaAttachments;
	}
	public Set getProPlanDataReports() {
		return this.proPlanDataReports;
	}
	public void setProPlanDataReports(Set proPlanDataReports) {
		this.proPlanDataReports = proPlanDataReports;
	}
	public Set getResolveIndexDatas() {
		return this.resolveIndexDatas;
	}
	public void setResolveIndexDatas(Set resolveIndexDatas) {
		this.resolveIndexDatas = resolveIndexDatas;
	}
	public Set getProjectPlanDatas() {
		return this.projectPlanDatas;
	}
	public void setProjectPlanDatas(Set projectPlanDatas) {
		this.projectPlanDatas = projectPlanDatas;
	}
	public Set getPlanIndexDatas() {
		return this.planIndexDatas;
	}
	public void setPlanIndexDatas(Set planIndexDatas) {
		this.planIndexDatas = planIndexDatas;
	}
}