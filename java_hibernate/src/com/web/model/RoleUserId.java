package com.web.model;
/**
 * RoleUserId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleUserId implements java.io.Serializable {
	// Fields
	private SysRole sysRole;
	private SysUser sysUser;
	// Constructors
	/** default constructor */
	public RoleUserId() {
	}
	/** full constructor */
	public RoleUserId(SysRole sysRole, SysUser sysUser) {
		this.sysRole = sysRole;
		this.sysUser = sysUser;
	}
	// Property accessors
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleUserId))
			return false;
		RoleUserId castOther = (RoleUserId) other;
		return ((this.getSysRole() == castOther.getSysRole()) || (this.getSysRole() != null && castOther.getSysRole() != null && this.getSysRole().equals(castOther.getSysRole()))) && ((this.getSysUser() == castOther.getSysUser()) || (this.getSysUser() != null && castOther.getSysUser() != null && this.getSysUser().equals(castOther.getSysUser())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysRole() == null ? 0 : this.getSysRole().hashCode());
		result = 37 * result + (getSysUser() == null ? 0 : this.getSysUser().hashCode());
		return result;
	}
}