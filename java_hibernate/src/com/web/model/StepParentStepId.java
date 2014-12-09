package com.web.model;
/**
 * StepParentStepId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepParentStepId implements java.io.Serializable {
	// Fields
	private SysStep sysStep;
	private SysStep sysStep_1;
	// Constructors
	/** default constructor */
	public StepParentStepId() {
	}
	/** full constructor */
	public StepParentStepId(SysStep sysStep, SysStep sysStep_1) {
		this.sysStep = sysStep;
		this.sysStep_1 = sysStep_1;
	}
	// Property accessors
	public SysStep getSysStep() {
		return this.sysStep;
	}
	public void setSysStep(SysStep sysStep) {
		this.sysStep = sysStep;
	}
	public SysStep getSysStep_1() {
		return this.sysStep_1;
	}
	public void setSysStep_1(SysStep sysStep_1) {
		this.sysStep_1 = sysStep_1;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StepParentStepId))
			return false;
		StepParentStepId castOther = (StepParentStepId) other;
		return ((this.getSysStep() == castOther.getSysStep()) || (this.getSysStep() != null && castOther.getSysStep() != null && this.getSysStep().equals(castOther.getSysStep()))) && ((this.getSysStep_1() == castOther.getSysStep_1()) || (this.getSysStep_1() != null && castOther.getSysStep_1() != null && this.getSysStep_1().equals(castOther.getSysStep_1())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysStep() == null ? 0 : this.getSysStep().hashCode());
		result = 37 * result + (getSysStep_1() == null ? 0 : this.getSysStep_1().hashCode());
		return result;
	}
}