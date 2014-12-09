package com.web.model;
/**
 * StepIndex entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class StepIndex implements java.io.Serializable {
	// Fields
	private StepIndexId id;
	// Constructors
	/** default constructor */
	public StepIndex() {
	}
	/** full constructor */
	public StepIndex(StepIndexId id) {
		this.id = id;
	}
	// Property accessors
	public StepIndexId getId() {
		return this.id;
	}
	public void setId(StepIndexId id) {
		this.id = id;
	}
}