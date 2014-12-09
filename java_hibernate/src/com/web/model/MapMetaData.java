package com.web.model;
import java.util.Date;
/**
 * MapMetaData entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class MapMetaData implements java.io.Serializable {
	// Fields
	private Long id;
	private MapMetaType mapMetaType;
	private String metaScode;
	private String metaSname;
	private String metaTcode;
	private String metaTname;
	private String metaFormula;
	private Date metaStartTime;
	private Date metaEndTime;
	private Double metaVariable;
	private String remark;
	private Long isValid;
	// Constructors
	/** default constructor */
	public MapMetaData() {
	}
	/** minimal constructor */
	public MapMetaData(MapMetaType mapMetaType, String metaScode, String metaSname) {
		this.mapMetaType = mapMetaType;
		this.metaScode = metaScode;
		this.metaSname = metaSname;
	}
	/** full constructor */
	public MapMetaData(MapMetaType mapMetaType, String metaScode, String metaSname, String metaTcode, String metaTname, String metaFormula, Date metaStartTime, Date metaEndTime, Double metaVariable, String remark, Long isValid) {
		this.mapMetaType = mapMetaType;
		this.metaScode = metaScode;
		this.metaSname = metaSname;
		this.metaTcode = metaTcode;
		this.metaTname = metaTname;
		this.metaFormula = metaFormula;
		this.metaStartTime = metaStartTime;
		this.metaEndTime = metaEndTime;
		this.metaVariable = metaVariable;
		this.remark = remark;
		this.isValid = isValid;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MapMetaType getMapMetaType() {
		return this.mapMetaType;
	}
	public void setMapMetaType(MapMetaType mapMetaType) {
		this.mapMetaType = mapMetaType;
	}
	public String getMetaScode() {
		return this.metaScode;
	}
	public void setMetaScode(String metaScode) {
		this.metaScode = metaScode;
	}
	public String getMetaSname() {
		return this.metaSname;
	}
	public void setMetaSname(String metaSname) {
		this.metaSname = metaSname;
	}
	public String getMetaTcode() {
		return this.metaTcode;
	}
	public void setMetaTcode(String metaTcode) {
		this.metaTcode = metaTcode;
	}
	public String getMetaTname() {
		return this.metaTname;
	}
	public void setMetaTname(String metaTname) {
		this.metaTname = metaTname;
	}
	public String getMetaFormula() {
		return this.metaFormula;
	}
	public void setMetaFormula(String metaFormula) {
		this.metaFormula = metaFormula;
	}
	public Date getMetaStartTime() {
		return this.metaStartTime;
	}
	public void setMetaStartTime(Date metaStartTime) {
		this.metaStartTime = metaStartTime;
	}
	public Date getMetaEndTime() {
		return this.metaEndTime;
	}
	public void setMetaEndTime(Date metaEndTime) {
		this.metaEndTime = metaEndTime;
	}
	public Double getMetaVariable() {
		return this.metaVariable;
	}
	public void setMetaVariable(Double metaVariable) {
		this.metaVariable = metaVariable;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
}