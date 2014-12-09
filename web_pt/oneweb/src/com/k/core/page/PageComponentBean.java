package com.k.core.page;
public class PageComponentBean {
	private String type = "";
	private String name = "";
	private String id = "";
	private String onclick = "";
	public PageComponentBean() {
		id = "";
		name = "";
		onclick = "";
		type = "";
	}
	public PageComponentBean(String id, String name, String onclick, String type) {
		this.id = id;
		this.name = name;
		this.onclick = onclick;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOnclick() {
		return onclick;
	}
	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
