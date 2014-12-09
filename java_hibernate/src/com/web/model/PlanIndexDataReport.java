package com.web.model;
import java.util.Date;
/**
 * PlanIndexDataReport entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class PlanIndexDataReport implements java.io.Serializable {
	// Fields
	private Long id;
	private SysVersion sysVersion;
	private SysUser sysUser;
	private OrganIndex organIndex;
	private Date dataDate;
	private Double selfFillData;
	private Double selfFillDataMb;
	private Double selfFillDataCx;
	private Double expectFinishData;
	private Double expectData;
	private Double dtpFillData;
	private Double dtpFillDataMb;
	private Double dtpFillDataCx;
	private Double tempExpectData;
	private Double tempDtpFillData;
	private Double tempDtpFillDataMb;
	private Double tempDtpFillDataCx;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public PlanIndexDataReport() {
	}
	/** minimal constructor */
	public PlanIndexDataReport(SysVersion sysVersion, SysUser sysUser, OrganIndex organIndex, Date dataDate) {
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
		this.organIndex = organIndex;
		this.dataDate = dataDate;
	}
	/** full constructor */
	public PlanIndexDataReport(SysVersion sysVersion, SysUser sysUser, OrganIndex organIndex, Date dataDate, Double selfFillData, Double selfFillDataMb, Double selfFillDataCx, Double expectFinishData, Double expectData, Double dtpFillData, Double dtpFillDataMb, Double dtpFillDataCx, Double tempExpectData, Double tempDtpFillData, Double tempDtpFillDataMb, Double tempDtpFillDataCx, Long orderby, String remark, String attr1, String attr2, String attr3) {
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
		this.organIndex = organIndex;
		this.dataDate = dataDate;
		this.selfFillData = selfFillData;
		this.selfFillDataMb = selfFillDataMb;
		this.selfFillDataCx = selfFillDataCx;
		this.expectFinishData = expectFinishData;
		this.expectData = expectData;
		this.dtpFillData = dtpFillData;
		this.dtpFillDataMb = dtpFillDataMb;
		this.dtpFillDataCx = dtpFillDataCx;
		this.tempExpectData = tempExpectData;
		this.tempDtpFillData = tempDtpFillData;
		this.tempDtpFillDataMb = tempDtpFillDataMb;
		this.tempDtpFillDataCx = tempDtpFillDataCx;
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
	public Double getExpectFinishData() {
		return this.expectFinishData;
	}
	public void setExpectFinishData(Double expectFinishData) {
		this.expectFinishData = expectFinishData;
	}
	public Double getExpectData() {
		return this.expectData;
	}
	public void setExpectData(Double expectData) {
		this.expectData = expectData;
	}
	public Double getDtpFillData() {
		return this.dtpFillData;
	}
	public void setDtpFillData(Double dtpFillData) {
		this.dtpFillData = dtpFillData;
	}
	public Double getDtpFillDataMb() {
		return this.dtpFillDataMb;
	}
	public void setDtpFillDataMb(Double dtpFillDataMb) {
		this.dtpFillDataMb = dtpFillDataMb;
	}
	public Double getDtpFillDataCx() {
		return this.dtpFillDataCx;
	}
	public void setDtpFillDataCx(Double dtpFillDataCx) {
		this.dtpFillDataCx = dtpFillDataCx;
	}
	public Double getTempExpectData() {
		return this.tempExpectData;
	}
	public void setTempExpectData(Double tempExpectData) {
		this.tempExpectData = tempExpectData;
	}
	public Double getTempDtpFillData() {
		return this.tempDtpFillData;
	}
	public void setTempDtpFillData(Double tempDtpFillData) {
		this.tempDtpFillData = tempDtpFillData;
	}
	public Double getTempDtpFillDataMb() {
		return this.tempDtpFillDataMb;
	}
	public void setTempDtpFillDataMb(Double tempDtpFillDataMb) {
		this.tempDtpFillDataMb = tempDtpFillDataMb;
	}
	public Double getTempDtpFillDataCx() {
		return this.tempDtpFillDataCx;
	}
	public void setTempDtpFillDataCx(Double tempDtpFillDataCx) {
		this.tempDtpFillDataCx = tempDtpFillDataCx;
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