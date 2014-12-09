package com.web.model;
/**
 * RoleIndexId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RoleIndexId implements java.io.Serializable {
	// Fields
	private SysRole sysRole;
	private PlanIndex planIndex;
	// Constructors
	/** default constructor */
	public RoleIndexId() {
	}
	/** full constructor */
	public RoleIndexId(SysRole sysRole, PlanIndex planIndex) {
		this.sysRole = sysRole;
		this.planIndex = planIndex;
	}
	// Property accessors
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public PlanIndex getPlanIndex() {
		return this.planIndex;
	}
	public void setPlanIndex(PlanIndex planIndex) {
		this.planIndex = planIndex;
	}
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleIndexId))
			return false;
		RoleIndexId castOther = (RoleIndexId) other;
		return ((this.getSysRole() == castOther.getSysRole()) || (this.getSysRole() != null && castOther.getSysRole() != null && this.getSysRole().equals(castOther.getSysRole()))) && ((this.getPlanIndex() == castOther.getPlanIndex()) || (this.getPlanIndex() != null && castOther.getPlanIndex() != null && this.getPlanIndex().equals(castOther.getPlanIndex())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysRole() == null ? 0 : this.getSysRole().hashCode());
		result = 37 * result + (getPlanIndex() == null ? 0 : this.getPlanIndex().hashCode());
		return result;
	}
}