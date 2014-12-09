package com.web.model;
/**
 * OrganProjectType entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class OrganProjectType implements java.io.Serializable {
	// Fields
	private OrganProjectTypeId id;
	private SysOrgan sysOrgan;
	private ProjectType projectType;
	// Constructors
	/** default constructor */
	public OrganProjectType() {
	}
	/** minimal constructor */
	public OrganProjectType(OrganProjectTypeId id) {
		this.id = id;
	}
	/** full constructor */
	public OrganProjectType(OrganProjectTypeId id, SysOrgan sysOrgan, ProjectType projectType) {
		this.id = id;
		this.sysOrgan = sysOrgan;
		this.projectType = projectType;
	}
	// Property accessors
	public OrganProjectTypeId getId() {
		return this.id;
	}
	public void setId(OrganProjectTypeId id) {
		this.id = id;
	}
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
}