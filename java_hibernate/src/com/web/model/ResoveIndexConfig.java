package com.web.model;
import java.util.Date;
/**
 * ResoveIndexConfig entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ResoveIndexConfig implements java.io.Serializable {
	// Fields
	private Long id;
	private SysOrgan sysOrgan;
	private PlanIndex planIndex;
	private Long configType;
	private Long indexType;
	private Date createDate;
	private Date validBegin;
	private Date validEnd;
	private Date deleteDate;
	private Long isValid;
	private Long orderby;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public ResoveIndexConfig() {
	}
	/** minimal constructor */
	public ResoveIndexConfig(Long configType) {
		this.configType = configType;
	}
	/** full constructor */
	public ResoveIndexConfig(SysOrgan sysOrgan, PlanIndex planIndex, Long configType, Long indexType, Date createDate, Date validBegin, Date validEnd, Date deleteDate, Long isValid, Long orderby, String remark, String attr1, String attr2, String attr3) {
		this.sysOrgan = sysOrgan;
		this.planIndex = planIndex;
		this.configType = configType;
		this.indexType = indexType;
		this.createDate = createDate;
		this.validBegin = validBegin;
		this.validEnd = validEnd;
		this.deleteDate = deleteDate;
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
	public PlanIndex getPlanIndex() {
		return this.planIndex;
	}
	public void setPlanIndex(PlanIndex planIndex) {
		this.planIndex = planIndex;
	}
	public Long getConfigType() {
		return this.configType;
	}
	public void setConfigType(Long configType) {
		this.configType = configType;
	}
	public Long getIndexType() {
		return this.indexType;
	}
	public void setIndexType(Long indexType) {
		this.indexType = indexType;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
	public Date getDeleteDate() {
		return this.deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
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