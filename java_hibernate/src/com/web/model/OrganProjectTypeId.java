package com.web.model;
/**
 * OrganProjectTypeId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class OrganProjectTypeId implements java.io.Serializable {
	// Fields
	private SysOrgan sysOrgan;
	private ProjectType projectType;
	// Constructors
	/** default constructor */
	public OrganProjectTypeId() {
	}
	/** full constructor */
	public OrganProjectTypeId(SysOrgan sysOrgan, ProjectType projectType) {
		this.sysOrgan = sysOrgan;
		this.projectType = projectType;
	}
	// Property accessors
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
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
		if (!(other instanceof OrganProjectTypeId))
			return false;
		OrganProjectTypeId castOther = (OrganProjectTypeId) other;
		return ((this.getSysOrgan() == castOther.getSysOrgan()) || (this.getSysOrgan() != null && castOther.getSysOrgan() != null && this.getSysOrgan().equals(castOther.getSysOrgan()))) && ((this.getProjectType() == castOther.getProjectType()) || (this.getProjectType() != null && castOther.getProjectType() != null && this.getProjectType().equals(castOther.getProjectType())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysOrgan() == null ? 0 : this.getSysOrgan().hashCode());
		result = 37 * result + (getProjectType() == null ? 0 : this.getProjectType().hashCode());
		return result;
	}
}