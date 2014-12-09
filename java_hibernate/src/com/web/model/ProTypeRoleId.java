package com.web.model;
/**
 * ProTypeRoleId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ProTypeRoleId implements java.io.Serializable {
	// Fields
	private ProjectType projectType;
	private SysRole sysRole;
	// Constructors
	/** default constructor */
	public ProTypeRoleId() {
	}
	/** full constructor */
	public ProTypeRoleId(ProjectType projectType, SysRole sysRole) {
		this.projectType = projectType;
		this.sysRole = sysRole;
	}
	// Property accessors
	public ProjectType getProjectType() {
		return this.projectType;
	}
	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProTypeRoleId))
			return false;
		ProTypeRoleId castOther = (ProTypeRoleId) other;
		return ((this.getProjectType() == castOther.getProjectType()) || (this.getProjectType() != null && castOther.getProjectType() != null && this.getProjectType().equals(castOther.getProjectType()))) && ((this.getSysRole() == castOther.getSysRole()) || (this.getSysRole() != null && castOther.getSysRole() != null && this.getSysRole().equals(castOther.getSysRole())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getProjectType() == null ? 0 : this.getProjectType().hashCode());
		result = 37 * result + (getSysRole() == null ? 0 : this.getSysRole().hashCode());
		return result;
	}
}