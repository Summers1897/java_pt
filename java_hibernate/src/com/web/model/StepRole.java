package com.web.model;
/**
 * StepRole entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepRole implements java.io.Serializable {
	// Fields
	private StepRoleId id;
	// Constructors
	/** default constructor */
	public StepRole() {
	}
	/** full constructor */
	public StepRole(StepRoleId id) {
		this.id = id;
	}
	// Property accessors
	public StepRoleId getId() {
		return this.id;
	}
	public void setId(StepRoleId id) {
		this.id = id;
	}
}