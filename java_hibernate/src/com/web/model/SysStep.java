package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * SysStep entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysStep implements java.io.Serializable {
	// Fields
	private Long id;
	private SysFlow sysFlow;
	private String stepName;
	private Long stepNum;
	private String submiter;
	private String flowTip;
	private Long isSubmit;
	private Date submitTime;
	private String submitInfo;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;
	private Set stepParentStepsForStep = new HashSet(0);
	private Set stepParentStepsForParentStep = new HashSet(0);
	private Set stepProjects = new HashSet(0);
	private Set stepIndexes = new HashSet(0);
	private Set sysStepHises = new HashSet(0);
	private Set stepRoles = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysStep() {
	}
	/** minimal constructor */
	public SysStep(Long stepNum) {
		this.stepNum = stepNum;
	}
	/** full constructor */
	public SysStep(SysFlow sysFlow, String stepName, Long stepNum, String submiter, String flowTip, Long isSubmit, Date submitTime, String submitInfo, String remark, String attr1, String attr2, String attr3, String attr4, String attr5, Set stepParentStepsForStep, Set stepParentStepsForParentStep, Set stepProjects, Set stepIndexes, Set sysStepHises, Set stepRoles) {
		this.sysFlow = sysFlow;
		this.stepName = stepName;
		this.stepNum = stepNum;
		this.submiter = submiter;
		this.flowTip = flowTip;
		this.isSubmit = isSubmit;
		this.submitTime = submitTime;
		this.submitInfo = submitInfo;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
		this.stepParentStepsForStep = stepParentStepsForStep;
		this.stepParentStepsForParentStep = stepParentStepsForParentStep;
		this.stepProjects = stepProjects;
		this.stepIndexes = stepIndexes;
		this.sysStepHises = sysStepHises;
		this.stepRoles = stepRoles;
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
	public String getStepName() {
		return this.stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public Long getStepNum() {
		return this.stepNum;
	}
	public void setStepNum(Long stepNum) {
		this.stepNum = stepNum;
	}
	public String getSubmiter() {
		return this.submiter;
	}
	public void setSubmiter(String submiter) {
		this.submiter = submiter;
	}
	public String getFlowTip() {
		return this.flowTip;
	}
	public void setFlowTip(String flowTip) {
		this.flowTip = flowTip;
	}
	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
	}
	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public String getSubmitInfo() {
		return this.submitInfo;
	}
	public void setSubmitInfo(String submitInfo) {
		this.submitInfo = submitInfo;
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
	public Set getStepParentStepsForStep() {
		return this.stepParentStepsForStep;
	}
	public void setStepParentStepsForStep(Set stepParentStepsForStep) {
		this.stepParentStepsForStep = stepParentStepsForStep;
	}
	public Set getStepParentStepsForParentStep() {
		return this.stepParentStepsForParentStep;
	}
	public void setStepParentStepsForParentStep(Set stepParentStepsForParentStep) {
		this.stepParentStepsForParentStep = stepParentStepsForParentStep;
	}
	public Set getStepProjects() {
		return this.stepProjects;
	}
	public void setStepProjects(Set stepProjects) {
		this.stepProjects = stepProjects;
	}
	public Set getStepIndexes() {
		return this.stepIndexes;
	}
	public void setStepIndexes(Set stepIndexes) {
		this.stepIndexes = stepIndexes;
	}
	public Set getSysStepHises() {
		return this.sysStepHises;
	}
	public void setSysStepHises(Set sysStepHises) {
		this.sysStepHises = sysStepHises;
	}
	public Set getStepRoles() {
		return this.stepRoles;
	}
	public void setStepRoles(Set stepRoles) {
		this.stepRoles = stepRoles;
	}
}