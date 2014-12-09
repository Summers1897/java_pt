package com.k.mybatis;
public class Blog {
	private Integer id;
	private String bname;
	public Integer getId() {
		return id;
	}
	public Blog() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
