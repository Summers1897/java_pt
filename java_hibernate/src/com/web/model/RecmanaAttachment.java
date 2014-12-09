package com.web.model;
import java.util.Date;
/**
 * RecmanaAttachment entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class RecmanaAttachment implements java.io.Serializable {
	// Fields
	private Long id;
	private SysVersion sysVersion;
	private SysUser sysUser;
	private Long proId;
	private String attachName;
	private String attachPath;
	private Date uploadDate;
	private String belongTable;
	private String belongId;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public RecmanaAttachment() {
	}
	/** minimal constructor */
	public RecmanaAttachment(SysVersion sysVersion, SysUser sysUser) {
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
	}
	/** full constructor */
	public RecmanaAttachment(SysVersion sysVersion, SysUser sysUser, Long proId, String attachName, String attachPath, Date uploadDate, String belongTable, String belongId, String attr1, String attr2, String attr3) {
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
		this.proId = proId;
		this.attachName = attachName;
		this.attachPath = attachPath;
		this.uploadDate = uploadDate;
		this.belongTable = belongTable;
		this.belongId = belongId;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysVersion getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(SysVersion sysVersion) {
		this.sysVersion = sysVersion;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Long getProId() {
		return this.proId;
	}
	public void setProId(Long proId) {
		this.proId = proId;
	}
	public String getAttachName() {
		return this.attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getAttachPath() {
		return this.attachPath;
	}
	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}
	public Date getUploadDate() {
		return this.uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getBelongTable() {
		return this.belongTable;
	}
	public void setBelongTable(String belongTable) {
		this.belongTable = belongTable;
	}
	public String getBelongId() {
		return this.belongId;
	}
	public void setBelongId(String belongId) {
		this.belongId = belongId;
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
}