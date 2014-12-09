package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysOrgan entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysOrgan implements java.io.Serializable {
	// Fields
	private Long id;
	private SysPowerType sysPowerType;
	private SysPowerGrid sysPowerGrid;
	private SysOrgan sysOrgan;
	private String orgCode;
	private String orgSimpleName;
	private String orgFullName;
	private Date createDate;
	private Date deleteDate;
	private Long sign;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysVersions = new HashSet(0);
	private Set projectPlanDatas = new HashSet(0);
	private Set resoveIndexConfigs = new HashSet(0);
	private Set sysUsers = new HashSet(0);
	private Set organIndexes = new HashSet(0);
	private Set sysOrgans = new HashSet(0);
	private Set proPlanDataReports = new HashSet(0);
	private Set resolveIndexDatas = new HashSet(0);
	private Set planProjects = new HashSet(0);
	private Set projectTypes = new HashSet(0);
	private Set sysFlows = new HashSet(0);
	private Set sysElecUnits = new HashSet(0);
	private Set planIndexes = new HashSet(0);
	private Set organProjectTypes = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysOrgan() {
	}
	/** minimal constructor */
	public SysOrgan(String orgCode, String orgSimpleName) {
		this.orgCode = orgCode;
		this.orgSimpleName = orgSimpleName;
	}
	/** full constructor */
	public SysOrgan(SysPowerType sysPowerType, SysPowerGrid sysPowerGrid, SysOrgan sysOrgan, String orgCode, String orgSimpleName, String orgFullName, Date createDate, Date deleteDate, Long sign, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set sysVersions, Set projectPlanDatas, Set resoveIndexConfigs, Set sysUsers, Set organIndexes, Set sysOrgans, Set proPlanDataReports, Set resolveIndexDatas, Set planProjects, Set projectTypes, Set sysFlows, Set sysElecUnits, Set planIndexes, Set organProjectTypes) {
		this.sysPowerType = sysPowerType;
		this.sysPowerGrid = sysPowerGrid;
		this.sysOrgan = sysOrgan;
		this.orgCode = orgCode;
		this.orgSimpleName = orgSimpleName;
		this.orgFullName = orgFullName;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.sign = sign;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysVersions = sysVersions;
		this.projectPlanDatas = projectPlanDatas;
		this.resoveIndexConfigs = resoveIndexConfigs;
		this.sysUsers = sysUsers;
		this.organIndexes = organIndexes;
		this.sysOrgans = sysOrgans;
		this.proPlanDataReports = proPlanDataReports;
		this.resolveIndexDatas = resolveIndexDatas;
		this.planProjects = planProjects;
		this.projectTypes = projectTypes;
		this.sysFlows = sysFlows;
		this.sysElecUnits = sysElecUnits;
		this.planIndexes = planIndexes;
		this.organProjectTypes = organProjectTypes;
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
	public SysPowerGrid getSysPowerGrid() {
		return this.sysPowerGrid;
	}
	public void setSysPowerGrid(SysPowerGrid sysPowerGrid) {
		this.sysPowerGrid = sysPowerGrid;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgSimpleName() {
		return this.orgSimpleName;
	}
	public void setOrgSimpleName(String orgSimpleName) {
		this.orgSimpleName = orgSimpleName;
	}
	public String getOrgFullName() {
		return this.orgFullName;
	}
	public void setOrgFullName(String orgFullName) {
		this.orgFullName = orgFullName;
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
	public Long getSign() {
		return this.sign;
	}
	public void setSign(Long sign) {
		this.sign = sign;
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
	public Set getProjectPlanDatas() {
		return this.projectPlanDatas;
	}
	public void setProjectPlanDatas(Set projectPlanDatas) {
		this.projectPlanDatas = projectPlanDatas;
	}
	public Set getResoveIndexConfigs() {
		return this.resoveIndexConfigs;
	}
	public void setResoveIndexConfigs(Set resoveIndexConfigs) {
		this.resoveIndexConfigs = resoveIndexConfigs;
	}
	public Set getSysUsers() {
		return this.sysUsers;
	}
	public void setSysUsers(Set sysUsers) {
		this.sysUsers = sysUsers;
	}
	public Set getOrganIndexes() {
		return this.organIndexes;
	}
	public void setOrganIndexes(Set organIndexes) {
		this.organIndexes = organIndexes;
	}
	public Set getSysOrgans() {
		return this.sysOrgans;
	}
	public void setSysOrgans(Set sysOrgans) {
		this.sysOrgans = sysOrgans;
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
	public Set getPlanProjects() {
		return this.planProjects;
	}
	public void setPlanProjects(Set planProjects) {
		this.planProjects = planProjects;
	}
	public Set getProjectTypes() {
		return this.projectTypes;
	}
	public void setProjectTypes(Set projectTypes) {
		this.projectTypes = projectTypes;
	}
	public Set getSysFlows() {
		return this.sysFlows;
	}
	public void setSysFlows(Set sysFlows) {
		this.sysFlows = sysFlows;
	}
	public Set getSysElecUnits() {
		return this.sysElecUnits;
	}
	public void setSysElecUnits(Set sysElecUnits) {
		this.sysElecUnits = sysElecUnits;
	}
	public Set getPlanIndexes() {
		return this.planIndexes;
	}
	public void setPlanIndexes(Set planIndexes) {
		this.planIndexes = planIndexes;
	}
	public Set getOrganProjectTypes() {
		return this.organProjectTypes;
	}
	public void setOrganProjectTypes(Set organProjectTypes) {
		this.organProjectTypes = organProjectTypes;
	}
}