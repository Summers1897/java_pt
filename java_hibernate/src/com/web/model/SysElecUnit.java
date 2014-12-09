package com.web.model;
import java.util.Date;
/**
 * SysElecUnit entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class SysElecUnit implements java.io.Serializable {
	// Fields
	private Long id;
	private SysOrgan sysOrgan;
	private String unitName;
	private String unitCode;
	private Long unitType;
	private Long unitShl;
	private Double unitCapacity;
	private Double unitSteamEngine;
	private Double unitBoiler;
	private Date productDate;
	private Long designLife;
	private Date dischargeDate;
	private String dispatchRelation;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public SysElecUnit() {
	}
	/** minimal constructor */
	public SysElecUnit(SysOrgan sysOrgan, String unitName, String unitCode) {
		this.sysOrgan = sysOrgan;
		this.unitName = unitName;
		this.unitCode = unitCode;
	}
	/** full constructor */
	public SysElecUnit(SysOrgan sysOrgan, String unitName, String unitCode, Long unitType, Long unitShl, Double unitCapacity, Double unitSteamEngine, Double unitBoiler, Date productDate, Long designLife, Date dischargeDate, String dispatchRelation, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3) {
		this.sysOrgan = sysOrgan;
		this.unitName = unitName;
		this.unitCode = unitCode;
		this.unitType = unitType;
		this.unitShl = unitShl;
		this.unitCapacity = unitCapacity;
		this.unitSteamEngine = unitSteamEngine;
		this.unitBoiler = unitBoiler;
		this.productDate = productDate;
		this.designLife = designLife;
		this.dischargeDate = dischargeDate;
		this.dispatchRelation = dispatchRelation;
		this.isValid = isValid;
		this.orderby = orderby;
		this.remark = remark;
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
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public Long getUnitType() {
		return this.unitType;
	}
	public void setUnitType(Long unitType) {
		this.unitType = unitType;
	}
	public Long getUnitShl() {
		return this.unitShl;
	}
	public void setUnitShl(Long unitShl) {
		this.unitShl = unitShl;
	}
	public Double getUnitCapacity() {
		return this.unitCapacity;
	}
	public void setUnitCapacity(Double unitCapacity) {
		this.unitCapacity = unitCapacity;
	}
	public Double getUnitSteamEngine() {
		return this.unitSteamEngine;
	}
	public void setUnitSteamEngine(Double unitSteamEngine) {
		this.unitSteamEngine = unitSteamEngine;
	}
	public Double getUnitBoiler() {
		return this.unitBoiler;
	}
	public void setUnitBoiler(Double unitBoiler) {
		this.unitBoiler = unitBoiler;
	}
	public Date getProductDate() {
		return this.productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public Long getDesignLife() {
		return this.designLife;
	}
	public void setDesignLife(Long designLife) {
		this.designLife = designLife;
	}
	public Date getDischargeDate() {
		return this.dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	public String getDispatchRelation() {
		return this.dispatchRelation;
	}
	public void setDispatchRelation(String dispatchRelation) {
		this.dispatchRelation = dispatchRelation;
	}
	public Long getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}
	public Long getOrderby() {
		return this.orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
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
}