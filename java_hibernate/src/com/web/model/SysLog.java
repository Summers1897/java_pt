package com.web.model;
import java.util.Date;
/**
 * SysLog entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysLog implements java.io.Serializable {
	// Fields
	private Long id;
	private SysUser sysUser;
	private Date logDate;
	private Long sourceType;
	private String sourceEvent;
	private String operateContent;
	private Long operateResout;
	private String failReason;
	private Date deleteDate;
	private String name;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public SysLog() {
	}
	/** minimal constructor */
	public SysLog(SysUser sysUser, Date logDate, String sourceEvent, String operateContent) {
		this.sysUser = sysUser;
		this.logDate = logDate;
		this.sourceEvent = sourceEvent;
		this.operateContent = operateContent;
	}
	/** full constructor */
	public SysLog(SysUser sysUser, Date logDate, Long sourceType, String sourceEvent, String operateContent, Long operateResout, String failReason, Date deleteDate, String name, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3) {
		this.sysUser = sysUser;
		this.logDate = logDate;
		this.sourceType = sourceType;
		this.sourceEvent = sourceEvent;
		this.operateContent = operateContent;
		this.operateResout = operateResout;
		this.failReason = failReason;
		this.deleteDate = deleteDate;
		this.name = name;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Date getLogDate() {
		return this.logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	public Long getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(Long sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceEvent() {
		return this.sourceEvent;
	}
	public void setSourceEvent(String sourceEvent) {
		this.sourceEvent = sourceEvent;
	}
	public String getOperateContent() {
		return this.operateContent;
	}
	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}
	public Long getOperateResout() {
		return this.operateResout;
	}
	public void setOperateResout(Long operateResout) {
		this.operateResout = operateResout;
	}
	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
}