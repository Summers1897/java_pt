package com.web.model;
/**
 * SysUserVersionId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUserVersionId implements java.io.Serializable {
	// Fields
	private SysUser sysUser;
	private Long sysVersion;
	// Constructors
	/** default constructor */
	public SysUserVersionId() {
	}
	/** full constructor */
	public SysUserVersionId(SysUser sysUser, Long sysVersion) {
		this.sysUser = sysUser;
		this.sysVersion = sysVersion;
	}
	// Property accessors
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Long getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(Long sysVersion) {
		this.sysVersion = sysVersion;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SysUserVersionId))
			return false;
		SysUserVersionId castOther = (SysUserVersionId) other;
		return ((this.getSysUser() == castOther.getSysUser()) || (this.getSysUser() != null && castOther.getSysUser() != null && this.getSysUser().equals(castOther.getSysUser()))) && ((this.getSysVersion() == castOther.getSysVersion()) || (this.getSysVersion() != null && castOther.getSysVersion() != null && this.getSysVersion().equals(castOther.getSysVersion())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysUser() == null ? 0 : this.getSysUser().hashCode());
		result = 37 * result + (getSysVersion() == null ? 0 : this.getSysVersion().hashCode());
		return result;
	}
}