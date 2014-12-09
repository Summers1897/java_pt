package com.k.vo;
public class SysResourceVO {
	private String id;
	private String parentId;
	private String resType;
	private String resCode;
	private String resName;
	private String resUrl;
	private String resIsvalid;
	private int resOrderby;
	private int level;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResUrl() {
		return resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	public String getResIsvalid() {
		return resIsvalid;
	}
	public void setResIsvalid(String resIsvalid) {
		this.resIsvalid = resIsvalid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getResOrderby() {
		return resOrderby;
	}
	public void setResOrderby(int resOrderby) {
		this.resOrderby = resOrderby;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
