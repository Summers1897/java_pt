package com.web.model;
/**
 * StepRoleId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepRoleId implements java.io.Serializable {
	// Fields
	private SysRole sysRole;
	private SysStep sysStep;
	// Constructors
	/** default constructor */
	public StepRoleId() {
	}
	/** full constructor */
	public StepRoleId(SysRole sysRole, SysStep sysStep) {
		this.sysRole = sysRole;
		this.sysStep = sysStep;
	}
	// Property accessors
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysStep getSysStep() {
		return this.sysStep;
	}
	public void setSysStep(SysStep sysStep) {
		this.sysStep = sysStep;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StepRoleId))
			return false;
		StepRoleId castOther = (StepRoleId) other;
		return ((this.getSysRole() == castOther.getSysRole()) || (this.getSysRole() != null && castOther.getSysRole() != null && this.getSysRole().equals(castOther.getSysRole()))) && ((this.getSysStep() == castOther.getSysStep()) || (this.getSysStep() != null && castOther.getSysStep() != null && this.getSysStep().equals(castOther.getSysStep())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysRole() == null ? 0 : this.getSysRole().hashCode());
		result = 37 * result + (getSysStep() == null ? 0 : this.getSysStep().hashCode());
		return result;
	}
}