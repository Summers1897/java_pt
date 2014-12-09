package com.web.model;
import java.util.Date;
/**
 * PlanIndexData entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class PlanIndexData implements java.io.Serializable {
	// Fields
	private Long id;
	private SysVersion sysVersion;
	private SysUser sysUser;
	private OrganIndex organIndex;
	private Date dataDate;
	private Double actualValue;
	private Double expectFinishData;
	private Double selfFillData;
	private Double selfFillDataMb;
	private Double selfFillDataCx;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public PlanIndexData() {
	}
	/** minimal constructor */
	public PlanIndexData(OrganIndex organIndex) {
		this.organIndex = organIndex;
	}
	/** full constructor */
	public PlanIndexData(SysVersion sysVersion, SysUser sysUser, OrganIndex organIndex, Date dataDate, Double actualValue, Double expectFinishData, Double selfFillData, Double selfFillDataMb, Double selfFillDataCx, String remark, String attr1, String attr2, String attr3) {
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
		this.organIndex = organIndex;
		this.dataDate = dataDate;
		this.actualValue = actualValue;
		this.expectFinishData = expectFinishData;
		this.selfFillData = selfFillData;
		this.selfFillDataMb = selfFillDataMb;
		this.selfFillDataCx = selfFillDataCx;
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
	public SysVersion getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(SysVersion sysVersion) {
		this.sysVersion = sysVersion;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public OrganIndex getOrganIndex() {
		return this.organIndex;
	}
	public void setOrganIndex(OrganIndex organIndex) {
		this.organIndex = organIndex;
	}
	public Date getDataDate() {
		return this.dataDate;
	}
	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}
	public Double getActualValue() {
		return this.actualValue;
	}
	public void setActualValue(Double actualValue) {
		this.actualValue = actualValue;
	}
	public Double getExpectFinishData() {
		return this.expectFinishData;
	}
	public void setExpectFinishData(Double expectFinishData) {
		this.expectFinishData = expectFinishData;
	}
	public Double getSelfFillData() {
		return this.selfFillData;
	}
	public void setSelfFillData(Double selfFillData) {
		this.selfFillData = selfFillData;
	}
	public Double getSelfFillDataMb() {
		return this.selfFillDataMb;
	}
	public void setSelfFillDataMb(Double selfFillDataMb) {
		this.selfFillDataMb = selfFillDataMb;
	}
	public Double getSelfFillDataCx() {
		return this.selfFillDataCx;
	}
	public void setSelfFillDataCx(Double selfFillDataCx) {
		this.selfFillDataCx = selfFillDataCx;
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