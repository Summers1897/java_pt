package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * OrganIndex entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class OrganIndex implements java.io.Serializable {
	// Fields
	private OrganIndexId id;
	private Date validBegin;
	private Date validEnd;
	private Long isValid;
	private String attr1;
	private String attr2;
	private String attr3;
	private Set indexMonthDatas = new HashSet(0);
	private Set planIndexDataReports = new HashSet(0);
	private Set planIndexDatas = new HashSet(0);
	// Constructors
	/** default constructor */
	public OrganIndex() {
	}
	/** minimal constructor */
	public OrganIndex(OrganIndexId id) {
		this.id = id;
	}
	/** full constructor */
	public OrganIndex(OrganIndexId id, Date validBegin, Date validEnd, Long isValid, String attr1, String attr2, String attr3, Set indexMonthDatas, Set planIndexDataReports, Set planIndexDatas) {
		this.id = id;
		this.validBegin = validBegin;
		this.validEnd = validEnd;
		this.isValid = isValid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.indexMonthDatas = indexMonthDatas;
		this.planIndexDataReports = planIndexDataReports;
		this.planIndexDatas = planIndexDatas;
	}
	// Property accessors
	public OrganIndexId getId() {
		return this.id;
	}
	public void setId(OrganIndexId id) {
		this.id = id;
	}
	public Date getValidBegin() {
		return this.validBegin;
	}
	public void setValidBegin(Date validBegin) {
		this.validBegin = validBegin;
	}
	public Date getValidEnd() {
		return this.validEnd;
	}
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
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
	public Set getIndexMonthDatas() {
		return this.indexMonthDatas;
	}
	public void setIndexMonthDatas(Set indexMonthDatas) {
		this.indexMonthDatas = indexMonthDatas;
	}
	public Set getPlanIndexDataReports() {
		return this.planIndexDataReports;
	}
	public void setPlanIndexDataReports(Set planIndexDataReports) {
		this.planIndexDataReports = planIndexDataReports;
	}
	public Set getPlanIndexDatas() {
		return this.planIndexDatas;
	}
	public void setPlanIndexDatas(Set planIndexDatas) {
		this.planIndexDatas = planIndexDatas;
	}
}