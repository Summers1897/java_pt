package com.web.model;
import java.util.Date;
/**
 * SysMessage entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysMessage implements java.io.Serializable {
	// Fields
	private Long id;
	private SysUser sysUserByMessageReceive;
	private SysUser sysUserByMessageSend;
	private Long messageType;
	private String messageTitle;
	private String messageText;
	private Date messageTime;
	private Long messageStatus;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;
	// Constructors
	/** default constructor */
	public SysMessage() {
	}
	/** minimal constructor */
	public SysMessage(SysUser sysUserByMessageReceive, SysUser sysUserByMessageSend, Long messageType, String messageText, Date messageTime, Long messageStatus) {
		this.sysUserByMessageReceive = sysUserByMessageReceive;
		this.sysUserByMessageSend = sysUserByMessageSend;
		this.messageType = messageType;
		this.messageText = messageText;
		this.messageTime = messageTime;
		this.messageStatus = messageStatus;
	}
	/** full constructor */
	public SysMessage(SysUser sysUserByMessageReceive, SysUser sysUserByMessageSend, Long messageType, String messageTitle, String messageText, Date messageTime, Long messageStatus, String remark, String attr1, String attr2, String attr3, String attr4, String attr5) {
		this.sysUserByMessageReceive = sysUserByMessageReceive;
		this.sysUserByMessageSend = sysUserByMessageSend;
		this.messageType = messageType;
		this.messageTitle = messageTitle;
		this.messageText = messageText;
		this.messageTime = messageTime;
		this.messageStatus = messageStatus;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysUser getSysUserByMessageReceive() {
		return this.sysUserByMessageReceive;
	}
	public void setSysUserByMessageReceive(SysUser sysUserByMessageReceive) {
		this.sysUserByMessageReceive = sysUserByMessageReceive;
	}
	public SysUser getSysUserByMessageSend() {
		return this.sysUserByMessageSend;
	}
	public void setSysUserByMessageSend(SysUser sysUserByMessageSend) {
		this.sysUserByMessageSend = sysUserByMessageSend;
	}
	public Long getMessageType() {
		return this.messageType;
	}
	public void setMessageType(Long messageType) {
		this.messageType = messageType;
	}
	public String getMessageTitle() {
		return this.messageTitle;
	}
	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}
	public String getMessageText() {
		return this.messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public Date getMessageTime() {
		return this.messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}
	public Long getMessageStatus() {
		return this.messageStatus;
	}
	public void setMessageStatus(Long messageStatus) {
		this.messageStatus = messageStatus;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAttr1() {
		return this.attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	public String getAttr2() {
		return this.attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public String getAttr3() {
		return this.attr3;
	}
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	public String getAttr4() {
		return this.attr4;
	}
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	public String getAttr5() {
		return this.attr5;
	}
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
}