package com.k.model;
import java.util.Date;
/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */
public class SysUser implements java.io.Serializable {
	// Fields
	private Integer id;
	private SysOrgan sysOrgan;
	private SysRole sysRole;
	private String userActualName;
	private String userCode;
	private String userName;
	private Date userCreateDate;
	private Date latsLoginDate;
	private Date userDeleteDate;
	private Integer userIsvalid;
	private String attr1;
	private String attr2;
	private String attr3;
	// Constructors
	/** default constructor */
	public SysUser() {
	}
	/** full constructor */
	public SysUser(SysOrgan sysOrgan, SysRole sysRole, String userActualName, String userCode, String userName, Date userCreateDate, Date latsLoginDate, Date userDeleteDate, Integer userIsvalid, String attr1, String attr2, String attr3) {
		this.sysOrgan = sysOrgan;
		this.sysRole = sysRole;
		this.userActualName = userActualName;
		this.userCode = userCode;
		this.userName = userName;
		this.userCreateDate = userCreateDate;
		this.latsLoginDate = latsLoginDate;
		this.userDeleteDate = userDeleteDate;
		this.userIsvalid = userIsvalid;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	// Property accessors
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public SysRole getSysRole() {
		return this.sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public String getUserActualName() {
		return this.userActualName;
	}
	public void setUserActualName(String userActualName) {
		this.userActualName = userActualName;
	}
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserCreateDate() {
		return this.userCreateDate;
	}
	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public Date getLatsLoginDate() {
		return this.latsLoginDate;
	}
	public void setLatsLoginDate(Date latsLoginDate) {
		this.latsLoginDate = latsLoginDate;
	}
	public Date getUserDeleteDate() {
		return this.userDeleteDate;
	}
	public void setUserDeleteDate(Date userDeleteDate) {
		this.userDeleteDate = userDeleteDate;
	}
	public Integer getUserIsvalid() {
		return this.userIsvalid;
	}
	public void setUserIsvalid(Integer userIsvalid) {
		this.userIsvalid = userIsvalid;
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