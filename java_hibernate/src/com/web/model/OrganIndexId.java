package com.web.model;
/**
 * OrganIndexId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class OrganIndexId implements java.io.Serializable {
	// Fields
	private SysOrgan sysOrgan;
	private PlanIndex planIndex;
	// Constructors
	/** default constructor */
	public OrganIndexId() {
	}
	/** full constructor */
	public OrganIndexId(SysOrgan sysOrgan, PlanIndex planIndex) {
		this.sysOrgan = sysOrgan;
		this.planIndex = planIndex;
	}
	// Property accessors
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
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
		if (!(other instanceof OrganIndexId))
			return false;
		OrganIndexId castOther = (OrganIndexId) other;
		return ((this.getSysOrgan() == castOther.getSysOrgan()) || (this.getSysOrgan() != null && castOther.getSysOrgan() != null && this.getSysOrgan().equals(castOther.getSysOrgan()))) && ((this.getPlanIndex() == castOther.getPlanIndex()) || (this.getPlanIndex() != null && castOther.getPlanIndex() != null && this.getPlanIndex().equals(castOther.getPlanIndex())));
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getSysOrgan() == null ? 0 : this.getSysOrgan().hashCode());
		result = 37 * result + (getPlanIndex() == null ? 0 : this.getPlanIndex().hashCode());
		return result;
	}
}