package com.web.model;
/**
 * StepParentStep entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepParentStep implements java.io.Serializable {
	// Fields
	private StepParentStepId id;
	// Constructors
	/** default constructor */
	public StepParentStep() {
	}
	/** full constructor */
	public StepParentStep(StepParentStepId id) {
		this.id = id;
	}
	// Property accessors
	public StepParentStepId getId() {
		return this.id;
	}
	public void setId(StepParentStepId id) {
		this.id = id;
	}
}