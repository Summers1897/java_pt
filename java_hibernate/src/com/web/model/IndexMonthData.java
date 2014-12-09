package com.web.model;
import java.util.Date;
/**
 * IndexMonthData entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class IndexMonthData implements java.io.Serializable {
	// Fields
	private Long id;
	private OrganIndex organIndex;
	private Date dataTime;
	private Double monthData;
	private Double monthSumData;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public IndexMonthData() {
	}
	/** minimal constructor */
	public IndexMonthData(OrganIndex organIndex) {
		this.organIndex = organIndex;
	}
	/** full constructor */
	public IndexMonthData(OrganIndex organIndex, Date dataTime, Double monthData, Double monthSumData, String attr1, String attr2, String attr3) {
		this.organIndex = organIndex;
		this.dataTime = dataTime;
		this.monthData = monthData;
		this.monthSumData = monthSumData;
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
	public OrganIndex getOrganIndex() {
		return this.organIndex;
	}
	public void setOrganIndex(OrganIndex organIndex) {
		this.organIndex = organIndex;
	}
	public Date getDataTime() {
		return this.dataTime;
	}
	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}
	public Double getMonthData() {
		return this.monthData;
	}
	public void setMonthData(Double monthData) {
		this.monthData = monthData;
	}
	public Double getMonthSumData() {
		return this.monthSumData;
	}
	public void setMonthSumData(Double monthSumData) {
		this.monthSumData = monthSumData;
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