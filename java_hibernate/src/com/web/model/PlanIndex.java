package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * PlanIndex entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class PlanIndex implements java.io.Serializable {
	// Fields
	private Long id;
	private SysPowerType sysPowerType;
	private SysType sysType;
	private SysOrgan sysOrgan;
	private String indexName;
	private String indexCode;
	private Long indexType;
	private String indexUnit;
	private Long isCalculate;
	private Long isReport;
	private Date createDate;
	private Date editDate;
	private String editUser;
	private String formulaDisplay;
	private String formulaCalculate;
	private String formulaJz;
	private String formulaJzDisplay;
	private String formulaCx;
	private String formulaCxDisplay;
	private Date deleteDate;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set roleIndexes = new HashSet(0);
	private Set resoveIndexConfigs = new HashSet(0);
	private Set sysUserIndexes = new HashSet(0);
	private Set resolveIndexDatas = new HashSet(0);
	private Set organIndexes = new HashSet(0);
	private Set projectTypes = new HashSet(0);
	private Set stepIndexes = new HashSet(0);
	// Constructors
	/** default constructor */
	public PlanIndex() {
	}
	/** minimal constructor */
	public PlanIndex(SysPowerType sysPowerType, SysOrgan sysOrgan, String indexName, String indexCode) {
		this.sysPowerType = sysPowerType;
		this.sysOrgan = sysOrgan;
		this.indexName = indexName;
		this.indexCode = indexCode;
	}
	/** full constructor */
	public PlanIndex(SysPowerType sysPowerType, SysType sysType, SysOrgan sysOrgan, String indexName, String indexCode, Long indexType, String indexUnit, Long isCalculate, Long isReport, Date createDate, Date editDate, String editUser, String formulaDisplay, String formulaCalculate, String formulaJz, String formulaJzDisplay, String formulaCx, String formulaCxDisplay, Date deleteDate, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3, Set roleIndexes, Set resoveIndexConfigs, Set sysUserIndexes, Set resolveIndexDatas, Set organIndexes, Set projectTypes, Set stepIndexes) {
		this.sysPowerType = sysPowerType;
		this.sysType = sysType;
		this.sysOrgan = sysOrgan;
		this.indexName = indexName;
		this.indexCode = indexCode;
		this.indexType = indexType;
		this.indexUnit = indexUnit;
		this.isCalculate = isCalculate;
		this.isReport = isReport;
		this.createDate = createDate;
		this.editDate = editDate;
		this.editUser = editUser;
		this.formulaDisplay = formulaDisplay;
		this.formulaCalculate = formulaCalculate;
		this.formulaJz = formulaJz;
		this.formulaJzDisplay = formulaJzDisplay;
		this.formulaCx = formulaCx;
		this.formulaCxDisplay = formulaCxDisplay;
		this.deleteDate = deleteDate;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.roleIndexes = roleIndexes;
		this.resoveIndexConfigs = resoveIndexConfigs;
		this.sysUserIndexes = sysUserIndexes;
		this.resolveIndexDatas = resolveIndexDatas;
		this.organIndexes = organIndexes;
		this.projectTypes = projectTypes;
		this.stepIndexes = stepIndexes;
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
	public SysType getSysType() {
		return this.sysType;
	}
	public void setSysType(SysType sysType) {
		this.sysType = sysType;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public String getIndexName() {
		return this.indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public String getIndexCode() {
		return this.indexCode;
	}
	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}
	public Long getIndexType() {
		return this.indexType;
	}
	public void setIndexType(Long indexType) {
		this.indexType = indexType;
	}
	public String getIndexUnit() {
		return this.indexUnit;
	}
	public void setIndexUnit(String indexUnit) {
		this.indexUnit = indexUnit;
	}
	public Long getIsCalculate() {
		return this.isCalculate;
	}
	public void setIsCalculate(Long isCalculate) {
		this.isCalculate = isCalculate;
	}
	public Long getIsReport() {
		return this.isReport;
	}
	public void setIsReport(Long isReport) {
		this.isReport = isReport;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getEditDate() {
		return this.editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	public String getEditUser() {
		return this.editUser;
	}
	public void setEditUser(String editUser) {
		this.editUser = editUser;
	}
	public String getFormulaDisplay() {
		return this.formulaDisplay;
	}
	public void setFormulaDisplay(String formulaDisplay) {
		this.formulaDisplay = formulaDisplay;
	}
	public String getFormulaCalculate() {
		return this.formulaCalculate;
	}
	public void setFormulaCalculate(String formulaCalculate) {
		this.formulaCalculate = formulaCalculate;
	}
	public String getFormulaJz() {
		return this.formulaJz;
	}
	public void setFormulaJz(String formulaJz) {
		this.formulaJz = formulaJz;
	}
	public String getFormulaJzDisplay() {
		return this.formulaJzDisplay;
	}
	public void setFormulaJzDisplay(String formulaJzDisplay) {
		this.formulaJzDisplay = formulaJzDisplay;
	}
	public String getFormulaCx() {
		return this.formulaCx;
	}
	public void setFormulaCx(String formulaCx) {
		this.formulaCx = formulaCx;
	}
	public String getFormulaCxDisplay() {
		return this.formulaCxDisplay;
	}
	public void setFormulaCxDisplay(String formulaCxDisplay) {
		this.formulaCxDisplay = formulaCxDisplay;
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
	public Set getRoleIndexes() {
		return this.roleIndexes;
	}
	public void setRoleIndexes(Set roleIndexes) {
		this.roleIndexes = roleIndexes;
	}
	public Set getResoveIndexConfigs() {
		return this.resoveIndexConfigs;
	}
	public void setResoveIndexConfigs(Set resoveIndexConfigs) {
		this.resoveIndexConfigs = resoveIndexConfigs;
	}
	public Set getSysUserIndexes() {
		return this.sysUserIndexes;
	}
	public void setSysUserIndexes(Set sysUserIndexes) {
		this.sysUserIndexes = sysUserIndexes;
	}
	public Set getResolveIndexDatas() {
		return this.resolveIndexDatas;
	}
	public void setResolveIndexDatas(Set resolveIndexDatas) {
		this.resolveIndexDatas = resolveIndexDatas;
	}
	public Set getOrganIndexes() {
		return this.organIndexes;
	}
	public void setOrganIndexes(Set organIndexes) {
		this.organIndexes = organIndexes;
	}
	public Set getProjectTypes() {
		return this.projectTypes;
	}
	public void setProjectTypes(Set projectTypes) {
		this.projectTypes = projectTypes;
	}
	public Set getStepIndexes() {
		return this.stepIndexes;
	}
	public void setStepIndexes(Set stepIndexes) {
		this.stepIndexes = stepIndexes;
	}
}