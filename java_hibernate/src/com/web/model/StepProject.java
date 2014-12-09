package com.web.model;
/**
 * StepProject entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepProject implements java.io.Serializable {
	// Fields
	private StepProjectId id;
	// Constructors
	/** default constructor */
	public StepProject() {
	}
	/** full constructor */
	public StepProject(StepProjectId id) {
		this.id = id;
	}
	// Property accessors
	public StepProjectId getId() {
		return this.id;
	}
	public void setId(StepProjectId id) {
		this.id = id;
	}
}