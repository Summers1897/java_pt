package com.web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * SysPowerGrid entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysPowerGrid implements java.io.Serializable {
	// Fields
	private Long id;
	private SysPowerGrid sysPowerGrid;
	private String gridName;
	private String gridCode;
	private Long gridType;
	private Long isValid;
	private String attr1;
	private String attr2;
	private String attr3;
	private Long orderby;
	private Set sysPowerGrids = new HashSet(0);
	private Set sysOrgans = new HashSet(0);
	// Constructors
	/** default constructor */
	public SysPowerGrid() {
	}
	/** full constructor */
	public SysPowerGrid(SysPowerGrid sysPowerGrid, String gridName, String gridCode, Long gridType, Long isValid, String attr1, String attr2, String attr3, Long orderby, Set sysPowerGrids, Set sysOrgans) {
		this.sysPowerGrid = sysPowerGrid;
		this.gridName = gridName;
		this.gridCode = gridCode;
		this.gridType = gridType;
		this.isValid = isValid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.orderby = orderby;
		this.sysPowerGrids = sysPowerGrids;
		this.sysOrgans = sysOrgans;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SysPowerGrid getSysPowerGrid() {
		return this.sysPowerGrid;
	}
	public void setSysPowerGrid(SysPowerGrid sysPowerGrid) {
		this.sysPowerGrid = sysPowerGrid;
	}
	public String getGridName() {
		return this.gridName;
	}
	public void setGridName(String gridName) {
		this.gridName = gridName;
	}
	public String getGridCode() {
		return this.gridCode;
	}
	public void setGridCode(String gridCode) {
		this.gridCode = gridCode;
	}
	public Long getGridType() {
		return this.gridType;
	}
	public void setGridType(Long gridType) {
		this.gridType = gridType;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
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
	public Long getOrderby() {
		return this.orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}
	public Set getSysPowerGrids() {
		return this.sysPowerGrids;
	}
	public void setSysPowerGrids(Set sysPowerGrids) {
		this.sysPowerGrids = sysPowerGrids;
	}
	public Set getSysOrgans() {
		return this.sysOrgans;
	}
	public void setSysOrgans(Set sysOrgans) {
		this.sysOrgans = sysOrgans;
	}
}