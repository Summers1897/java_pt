package com.k.model;
import java.util.HashSet;
import java.util.Set;
/**
 * SysResource entity. @author MyEclipse Persistence Tools
 */
public class SysResource implements java.io.Serializable {
	// Fields
	private Integer id;
	private String resName;
	private Integer resType;
	private String resAddr;
	private Integer resIsvalid;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set sysRoleResources = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysResource() {
	}
	/** full constructor */
	public SysResource(String resName, Integer resType, String resAddr, Integer resIsvalid, String attr1, String attr2, String attr3, Set sysRoleResources) {
		this.resName = resName;
		this.resType = resType;
		this.resAddr = resAddr;
		this.resIsvalid = resIsvalid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.sysRoleResources = sysRoleResources;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResName() {
		return this.resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public Integer getResType() {
		return this.resType;
	}
	public void setResType(Integer resType) {
		this.resType = resType;
	}
	public String getResAddr() {
		return this.resAddr;
	}
	public void setResAddr(String resAddr) {
		this.resAddr = resAddr;
	}
	public Integer getResIsvalid() {
		return this.resIsvalid;
	}
	public void setResIsvalid(Integer resIsvalid) {
		this.resIsvalid = resIsvalid;
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
	public Set getSysRoleResources() {
		return this.sysRoleResources;
	}
	public void setSysRoleResources(Set sysRoleResources) {
		this.sysRoleResources = sysRoleResources;
	}
}