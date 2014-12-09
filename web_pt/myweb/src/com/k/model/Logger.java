package com.k.model;
/**
 * Logger entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Logger implements java.io.Serializable {
	// Fields
	private Long id;
	private User user;
	private String logType;
	private String logEvent;
	// Constructors
	/** default constructor */
	public Logger() {
	}
	/** full constructor */
	public Logger(User user, String logType, String logEvent) {
		this.user = user;
		this.logType = logType;
		this.logEvent = logEvent;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return this.user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getLogType() {
		return this.logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getLogEvent() {
		return this.logEvent;
	}
	public void setLogEvent(String logEvent) {
		this.logEvent = logEvent;
	}
}