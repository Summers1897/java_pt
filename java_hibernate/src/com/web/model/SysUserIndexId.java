package com.web.model;
/**
 * SysUserIndexId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysUserIndexId implements java.io.Serializable {
	// Fields
	private PlanIndex planIndex;
	private SysUser sysUser;
	// Constructors
	/** default constructor */
	public SysUserIndexId() {
	}
	/** full constructor */
	public SysUserIndexId(PlanIndex planIndex, SysUser sysUser) {
		this.planIndex = planIndex;
		this.sysUser = sysUser;
	}
	// Property accessors
	public PlanIndex getPlanIndex() {
		return this.planIndex;
	}
	public void setPlanIndex(PlanIndex planIndex) {
		this.planIndex = planIndex;
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
		if (!(other instanceof SysUserIndexId))
			return false;
		SysUserIndexId castOther = (SysUserIndexId) other;
		return ((this.getPlanIndex() == castOther.getPlanIndex()) || (this.getPlanIndex() != null && castOther.getPlanIndex() != null && this.getPlanIndex().equals(castOther.getPlanIndex()))) && ((this.getSysUser() == castOther.getSysUser()) || (this.getSysUser() != null && castOther.getSysUser() != null && this.getSysUser().equals(castOther.getSysUser())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getPlanIndex() == null ? 0 : this.getPlanIndex().hashCode());
		result = 37 * result + (getSysUser() == null ? 0 : this.getSysUser().hashCode());
		return result;
	}
}