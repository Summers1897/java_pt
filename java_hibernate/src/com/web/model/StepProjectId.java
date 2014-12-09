package com.web.model;
/**
 * StepProjectId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepProjectId implements java.io.Serializable {
	// Fields
	private SysStep sysStep;
	private ProjectType projectType;
	// Constructors
	/** default constructor */
	public StepProjectId() {
	}
	/** full constructor */
	public StepProjectId(SysStep sysStep, ProjectType projectType) {
		this.sysStep = sysStep;
		this.projectType = projectType;
	}
	// Property accessors
	public SysStep getSysStep() {
		return this.sysStep;
	}
	public void setSysStep(SysStep sysStep) {
		this.sysStep = sysStep;
	}
	public ProjectType getProjectType() {
		return this.projectType;
	}
	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StepProjectId))
			return false;
		StepProjectId castOther = (StepProjectId) other;
		return ((this.getSysStep() == castOther.getSysStep()) || (this.getSysStep() != null && castOther.getSysStep() != null && this.getSysStep().equals(castOther.getSysStep()))) && ((this.getProjectType() == castOther.getProjectType()) || (this.getProjectType() != null && castOther.getProjectType() != null && this.getProjectType().equals(castOther.getProjectType())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysStep() == null ? 0 : this.getSysStep().hashCode());
		result = 37 * result + (getProjectType() == null ? 0 : this.getProjectType().hashCode());
		return result;
	}
}