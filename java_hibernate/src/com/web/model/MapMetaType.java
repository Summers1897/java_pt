package com.web.model;
import java.util.HashSet;
import java.util.Set;
/**
 * MapMetaType entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class MapMetaType implements java.io.Serializable {
	// Fields
	private Long id;
	private String typeCode;
	private String typeName;
	private Long isValid;
	private String remark;
	private Set mapMetaDatas = new HashSet(0);
	// Constructors
	/** default constructor */
	public MapMetaType() {
	}
	/** minimal constructor */
	public MapMetaType(String typeCode, String typeName, Long isValid) {
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.isValid = isValid;
	}
	/** full constructor */
	public MapMetaType(String typeCode, String typeName, Long isValid, String remark, Set mapMetaDatas) {
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.isValid = isValid;
		this.remark = remark;
		this.mapMetaDatas = mapMetaDatas;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set getMapMetaDatas() {
		return this.mapMetaDatas;
	}
	public void setMapMetaDatas(Set mapMetaDatas) {
		this.mapMetaDatas = mapMetaDatas;
	}
}