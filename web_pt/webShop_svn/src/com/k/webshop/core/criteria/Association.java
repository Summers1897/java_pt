package com.k.webshop.core.criteria;

public class Association {

	private String path;

	private String alias;

	private int joinType;

	private OfflineCriteria subCriteria;

	public Association() {

	}

	public Association(String path, String alias, int type) {
		this(path, alias, type, null);
	}

	public Association(String path, String alias, int type,
			OfflineCriteria criteria) {
		this.alias = alias;
		this.joinType = type;
		this.path = path;
		this.subCriteria = criteria;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getJoinType() {
		return joinType;
	}

	public void setJoinType(int joinType) {
		this.joinType = joinType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public OfflineCriteria getSubCriteria() {
		return subCriteria;
	}

	public void setSubCriteria(OfflineCriteria subCriteria) {
		this.subCriteria = subCriteria;
	}
}
