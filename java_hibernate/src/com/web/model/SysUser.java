package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUser implements java.io.Serializable {
	// Fields
	private Long id;
	private SysOrgan sysOrgan;
	private String userCode;
	private String userName;
	private String loginName;
	private String loginPwd;
	private Date createDate;
	private Date deleteDate;
	private Long orderby;
	private Long isValid;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set planProjectsForProWrite = new HashSet(0);
	private Set sysMessagesForMessageReceive = new HashSet(0);
	private Set sysUserIndexes = new HashSet(0);
	private Set sysRoles = new HashSet(0);
	private Set sysLogs = new HashSet(0);
	private Set planIndexDataReports = new HashSet(0);
	private Set sysFlows = new HashSet(0);
	private Set sysTypes = new HashSet(0);
	private Set planProjectsForProAudit = new HashSet(0);
	private Set projectPlanDatas = new HashSet(0);
	private Set proPlanDataReports = new HashSet(0);
	private Set recmanaAttachments = new HashSet(0);
	private Set planIndexDatas = new HashSet(0);
	private Set sysMessagesForMessageSend = new HashSet(0);
	private Set sysUserVersions = new HashSet(0);
	private Set roleUsers = new HashSet(0);
	private Set sysVersions = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysUser() {
	}
	/** minimal constructor */
	public SysUser(SysOrgan sysOrgan, String userCode, String userName, String loginName, String loginPwd) {
		this.sysOrgan = sysOrgan;
		this.userCode = userCode;
		this.userName = userName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
	}
	/** full constructor */
	public SysUser(SysOrgan sysOrgan, String userCode, String userName, String loginName, String loginPwd, Date createDate, Date deleteDate, Long orderby, Long isValid, String remark, String attr1, String attr2, String attr3, Set planProjectsForProWrite, Set sysMessagesForMessageReceive, Set sysUserIndexes, Set sysRoles, Set sysLogs, Set planIndexDataReports, Set sysFlows, Set sysTypes, Set planProjectsForProAudit, Set projectPlanDatas, Set proPlanDataReports, Set recmanaAttachments, Set planIndexDatas, Set sysMessagesForMessageSend, Set sysUserVersions, Set roleUsers, Set sysVersions) {
		this.sysOrgan = sysOrgan;
		this.userCode = userCode;
		this.userName = userName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.createDate = createDate;
		this.deleteDate = deleteDate;
		this.orderby = orderby;
		this.isValid = isValid;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.planProjectsForProWrite = planProjectsForProWrite;
		this.sysMessagesForMessageReceive = sysMessagesForMessageReceive;
		this.sysUserIndexes = sysUserIndexes;
		this.sysRoles = sysRoles;
		this.sysLogs = sysLogs;
		this.planIndexDataReports = planIndexDataReports;
		this.sysFlows = sysFlows;
		this.sysTypes = sysTypes;
		this.planProjectsForProAudit = planProjectsForProAudit;
		this.projectPlanDatas = projectPlanDatas;
		this.proPlanDataReports = proPlanDataReports;
		this.recmanaAttachments = recmanaAttachments;
		this.planIndexDatas = planIndexDatas;
		this.sysMessagesForMessageSend = sysMessagesForMessageSend;
		this.sysUserVersions = sysUserVersions;
		this.roleUsers = roleUsers;
		this.sysVersions = sysVersions;
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
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return this.loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return this.loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
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
	public Long getOrderby() {
		return this.orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
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
	public Set getPlanProjectsForProWrite() {
		return this.planProjectsForProWrite;
	}
	public void setPlanProjectsForProWrite(Set planProjectsForProWrite) {
		this.planProjectsForProWrite = planProjectsForProWrite;
	}
	public Set getSysMessagesForMessageReceive() {
		return this.sysMessagesForMessageReceive;
	}
	public void setSysMessagesForMessageReceive(Set sysMessagesForMessageReceive) {
		this.sysMessagesForMessageReceive = sysMessagesForMessageReceive;
	}
	public Set getSysUserIndexes() {
		return this.sysUserIndexes;
	}
	public void setSysUserIndexes(Set sysUserIndexes) {
		this.sysUserIndexes = sysUserIndexes;
	}
	public Set getSysRoles() {
		return this.sysRoles;
	}
	public void setSysRoles(Set sysRoles) {
		this.sysRoles = sysRoles;
	}
	public Set getSysLogs() {
		return this.sysLogs;
	}
	public void setSysLogs(Set sysLogs) {
		this.sysLogs = sysLogs;
	}
	public Set getPlanIndexDataReports() {
		return this.planIndexDataReports;
	}
	public void setPlanIndexDataReports(Set planIndexDataReports) {
		this.planIndexDataReports = planIndexDataReports;
	}
	public Set getSysFlows() {
		return this.sysFlows;
	}
	public void setSysFlows(Set sysFlows) {
		this.sysFlows = sysFlows;
	}
	public Set getSysTypes() {
		return this.sysTypes;
	}
	public void setSysTypes(Set sysTypes) {
		this.sysTypes = sysTypes;
	}
	public Set getPlanProjectsForProAudit() {
		return this.planProjectsForProAudit;
	}
	public void setPlanProjectsForProAudit(Set planProjectsForProAudit) {
		this.planProjectsForProAudit = planProjectsForProAudit;
	}
	public Set getProjectPlanDatas() {
		return this.projectPlanDatas;
	}
	public void setProjectPlanDatas(Set projectPlanDatas) {
		this.projectPlanDatas = projectPlanDatas;
	}
	public Set getProPlanDataReports() {
		return this.proPlanDataReports;
	}
	public void setProPlanDataReports(Set proPlanDataReports) {
		this.proPlanDataReports = proPlanDataReports;
	}
	public Set getRecmanaAttachments() {
		return this.recmanaAttachments;
	}
	public void setRecmanaAttachments(Set recmanaAttachments) {
		this.recmanaAttachments = recmanaAttachments;
	}
	public Set getPlanIndexDatas() {
		return this.planIndexDatas;
	}
	public void setPlanIndexDatas(Set planIndexDatas) {
		this.planIndexDatas = planIndexDatas;
	}
	public Set getSysMessagesForMessageSend() {
		return this.sysMessagesForMessageSend;
	}
	public void setSysMessagesForMessageSend(Set sysMessagesForMessageSend) {
		this.sysMessagesForMessageSend = sysMessagesForMessageSend;
	}
	public Set getSysUserVersions() {
		return this.sysUserVersions;
	}
	public void setSysUserVersions(Set sysUserVersions) {
		this.sysUserVersions = sysUserVersions;
	}
	public Set getRoleUsers() {
		return this.roleUsers;
	}
	public void setRoleUsers(Set roleUsers) {
		this.roleUsers = roleUsers;
	}
	public Set getSysVersions() {
		return this.sysVersions;
	}
	public void setSysVersions(Set sysVersions) {
		this.sysVersions = sysVersions;
	}
}