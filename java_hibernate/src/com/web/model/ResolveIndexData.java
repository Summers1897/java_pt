package com.web.model;
import java.util.Date;
/**
 * ResolveIndexData entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ResolveIndexData implements java.io.Serializable {
	// Fields
	private Long id;
	private SysOrgan sysOrgan;
	private SysVersion sysVersion;
	private PlanIndex planIndex;
	private Date resolveTime;
	private Date resolveMonth;
	private Double resolveBasevalue;
	private Double resolveGoalvalue;
	private Double resolveCreatevalue;
	private Double resolveBasevalueMd;
	private Double resolveGoalvalueMd;
	private Double resolveCreatevalueMd;
	private Double resolveBasevalueMoTm;
	private Double resolveGoalvalueMoTm;
	private Double resolveCreatevalueMdTm;
	private Long isSubmit;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public ResolveIndexData() {
	}
	/** minimal constructor */
	public ResolveIndexData(Date resolveMonth) {
		this.resolveMonth = resolveMonth;
	}
	/** full constructor */
	public ResolveIndexData(SysOrgan sysOrgan, SysVersion sysVersion, PlanIndex planIndex, Date resolveTime, Date resolveMonth, Double resolveBasevalue, Double resolveGoalvalue, Double resolveCreatevalue, Double resolveBasevalueMd, Double resolveGoalvalueMd, Double resolveCreatevalueMd, Double resolveBasevalueMoTm, Double resolveGoalvalueMoTm, Double resolveCreatevalueMdTm, Long isSubmit, String attr1, String attr2, String attr3) {
		this.sysOrgan = sysOrgan;
		this.sysVersion = sysVersion;
		this.planIndex = planIndex;
		this.resolveTime = resolveTime;
		this.resolveMonth = resolveMonth;
		this.resolveBasevalue = resolveBasevalue;
		this.resolveGoalvalue = resolveGoalvalue;
		this.resolveCreatevalue = resolveCreatevalue;
		this.resolveBasevalueMd = resolveBasevalueMd;
		this.resolveGoalvalueMd = resolveGoalvalueMd;
		this.resolveCreatevalueMd = resolveCreatevalueMd;
		this.resolveBasevalueMoTm = resolveBasevalueMoTm;
		this.resolveGoalvalueMoTm = resolveGoalvalueMoTm;
		this.resolveCreatevalueMdTm = resolveCreatevalueMdTm;
		this.isSubmit = isSubmit;
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
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public SysVersion getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(SysVersion sysVersion) {
		this.sysVersion = sysVersion;
	}
	public PlanIndex getPlanIndex() {
		return this.planIndex;
	}
	public void setPlanIndex(PlanIndex planIndex) {
		this.planIndex = planIndex;
	}
	public Date getResolveTime() {
		return this.resolveTime;
	}
	public void setResolveTime(Date resolveTime) {
		this.resolveTime = resolveTime;
	}
	public Date getResolveMonth() {
		return this.resolveMonth;
	}
	public void setResolveMonth(Date resolveMonth) {
		this.resolveMonth = resolveMonth;
	}
	public Double getResolveBasevalue() {
		return this.resolveBasevalue;
	}
	public void setResolveBasevalue(Double resolveBasevalue) {
		this.resolveBasevalue = resolveBasevalue;
	}
	public Double getResolveGoalvalue() {
		return this.resolveGoalvalue;
	}
	public void setResolveGoalvalue(Double resolveGoalvalue) {
		this.resolveGoalvalue = resolveGoalvalue;
	}
	public Double getResolveCreatevalue() {
		return this.resolveCreatevalue;
	}
	public void setResolveCreatevalue(Double resolveCreatevalue) {
		this.resolveCreatevalue = resolveCreatevalue;
	}
	public Double getResolveBasevalueMd() {
		return this.resolveBasevalueMd;
	}
	public void setResolveBasevalueMd(Double resolveBasevalueMd) {
		this.resolveBasevalueMd = resolveBasevalueMd;
	}
	public Double getResolveGoalvalueMd() {
		return this.resolveGoalvalueMd;
	}
	public void setResolveGoalvalueMd(Double resolveGoalvalueMd) {
		this.resolveGoalvalueMd = resolveGoalvalueMd;
	}
	public Double getResolveCreatevalueMd() {
		return this.resolveCreatevalueMd;
	}
	public void setResolveCreatevalueMd(Double resolveCreatevalueMd) {
		this.resolveCreatevalueMd = resolveCreatevalueMd;
	}
	public Double getResolveBasevalueMoTm() {
		return this.resolveBasevalueMoTm;
	}
	public void setResolveBasevalueMoTm(Double resolveBasevalueMoTm) {
		this.resolveBasevalueMoTm = resolveBasevalueMoTm;
	}
	public Double getResolveGoalvalueMoTm() {
		return this.resolveGoalvalueMoTm;
	}
	public void setResolveGoalvalueMoTm(Double resolveGoalvalueMoTm) {
		this.resolveGoalvalueMoTm = resolveGoalvalueMoTm;
	}
	public Double getResolveCreatevalueMdTm() {
		return this.resolveCreatevalueMdTm;
	}
	public void setResolveCreatevalueMdTm(Double resolveCreatevalueMdTm) {
		this.resolveCreatevalueMdTm = resolveCreatevalueMdTm;
	}
	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
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