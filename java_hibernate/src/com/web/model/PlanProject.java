package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * PlanProject entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class PlanProject implements java.io.Serializable {
	// Fields
	private Long id;
	private SysUser sysUserByProWrite;
	private PlanProject planProject;
	private SysUser sysUserByProAudit;
	private SysOrgan sysOrgan;
	private Long proType;
	private Long projectType;
	private String projectName;
	private String projectCode;
	private Date auditDate;
	private Date beginDate;
	private Date endDate;
	private Date createDate;
	private Long isValid;
	private String remark;
	private Long orderby;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;
	private Set projectPlanDatas = new HashSet(0);
	private Set planProjects = new HashSet(0);
	private Set proPlanDataReports = new HashSet(0);
	// Constructors
	/** default constructor */
	public PlanProject() {
	}
	/** minimal constructor */
	public PlanProject(String projectName, String projectCode) {
		this.projectName = projectName;
		this.projectCode = projectCode;
	}
	/** full constructor */
	public PlanProject(SysUser sysUserByProWrite, PlanProject planProject, SysUser sysUserByProAudit, SysOrgan sysOrgan, Long proType, Long projectType, String projectName, String projectCode, Date auditDate, Date beginDate, Date endDate, Date createDate, Long isValid, String remark, Long orderby, String attr1, String attr2, String attr3, String attr4, String attr5, Set projectPlanDatas, Set planProjects, Set proPlanDataReports) {
		this.sysUserByProWrite = sysUserByProWrite;
		this.planProject = planProject;
		this.sysUserByProAudit = sysUserByProAudit;
		this.sysOrgan = sysOrgan;
		this.proType = proType;
		this.projectType = projectType;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.auditDate = auditDate;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.createDate = createDate;
		this.isValid = isValid;
		this.remark = remark;
		this.orderby = orderby;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
		this.projectPlanDatas = projectPlanDatas;
		this.planProjects = planProjects;
		this.proPlanDataReports = proPlanDataReports;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysUser getSysUserByProWrite() {
		return this.sysUserByProWrite;
	}
	public void setSysUserByProWrite(SysUser sysUserByProWrite) {
		this.sysUserByProWrite = sysUserByProWrite;
	}
	public PlanProject getPlanProject() {
		return this.planProject;
	}
	public void setPlanProject(PlanProject planProject) {
		this.planProject = planProject;
	}
	public SysUser getSysUserByProAudit() {
		return this.sysUserByProAudit;
	}
	public void setSysUserByProAudit(SysUser sysUserByProAudit) {
		this.sysUserByProAudit = sysUserByProAudit;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public Long getProType() {
		return this.proType;
	}
	public void setProType(Long proType) {
		this.proType = proType;
	}
	public Long getProjectType() {
		return this.projectType;
	}
	public void setProjectType(Long projectType) {
		this.projectType = projectType;
	}
	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return this.projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Date getAuditDate() {
		return this.auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public Date getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getAttr4() {
		return this.attr4;
	}
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	public String getAttr5() {
		return this.attr5;
	}
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	public Set getProjectPlanDatas() {
		return this.projectPlanDatas;
	}
	public void setProjectPlanDatas(Set projectPlanDatas) {
		this.projectPlanDatas = projectPlanDatas;
	}
	public Set getPlanProjects() {
		return this.planProjects;
	}
	public void setPlanProjects(Set planProjects) {
		this.planProjects = planProjects;
	}
	public Set getProPlanDataReports() {
		return this.proPlanDataReports;
	}
	public void setProPlanDataReports(Set proPlanDataReports) {
		this.proPlanDataReports = proPlanDataReports;
	}
}