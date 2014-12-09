package com.k.core.action.page;
public class PageComponent {
	private String id;
	private String type;
	private String name;
	private String cssClass;
	private String onclick;
	private String value;
	public PageComponent() {
		super();
	}
	public PageComponent(String id, String type, String name, String value) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.value = value;
	}
	public PageComponent(String id, String type, String name, String cssClass, String onclick, String value) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.cssClass = cssClass;
		this.onclick = onclick;
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCssClass() {
		return cssClass;
	}
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	public String getOnclick() {
		return onclick;
	}
	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" <input ");
		if (name != null && !"".equals(name)) {
			buffer.append(" name='" + name + "'");
		}
		if (id != null && !"".equals(id)) {
			buffer.append(" id='" + id + "'");
		}
		if (type != null && !"".equals(type)) {
			buffer.append(" type='" + type + "'");
		}
		if (cssClass != null && !"".equals(cssClass)) {
			buffer.append(" class='" + cssClass + "'");
		}
		if (onclick != null && !"".equals(onclick)) {
			buffer.append(" onclick='" + onclick + "'");
		}
		if (value != null && !"".equals(value)) {
			buffer.append(" value='" + value + "'");
		}
		buffer.append(" />");
		return buffer.toString();
	}
}
