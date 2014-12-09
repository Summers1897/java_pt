package com.web.model;
/**
 * RoleResId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleResId implements java.io.Serializable {
	// Fields
	private SysResource sysResource;
	private SysRole sysRole;
	// Constructors
	/** default constructor */
	public RoleResId() {
	}
	/** full constructor */
	public RoleResId(SysResource sysResource, SysRole sysRole) {
		this.sysResource = sysResource;
		this.sysRole = sysRole;
	}
	// Property accessors
	public SysResource getSysResource() {
		return this.sysResource;
	}
	public void setSysResource(SysResource sysResource) {
		this.sysResource = sysResource;
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
		if (!(other instanceof RoleResId))
			return false;
		RoleResId castOther = (RoleResId) other;
		return ((this.getSysResource() == castOther.getSysResource()) || (this.getSysResource() != null && castOther.getSysResource() != null && this.getSysResource().equals(castOther.getSysResource()))) && ((this.getSysRole() == castOther.getSysRole()) || (this.getSysRole() != null && castOther.getSysRole() != null && this.getSysRole().equals(castOther.getSysRole())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysResource() == null ? 0 : this.getSysResource().hashCode());
		result = 37 * result + (getSysRole() == null ? 0 : this.getSysRole().hashCode());
		return result;
	}
}