package com.k.core.page;
public class PageComponent {
	private String id;
	private String type;
	private String name;
	private String value;
	private String disabled;
	private String style;
	private String cssClass;
	private String onclick;
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<input");
		if (id != null && "".equals(id)) {
			buffer.append("id='" + id + "'");
		}
		if (type != null && "".equals(type)) {
			buffer.append("type='" + type + "'");
		}
		if (name != null && "".equals(name)) {
			buffer.append("name='" + name + "'");
		}
		if (value != null && "".equals(value)) {
			buffer.append("value='" + value + "'");
		}
		if (cssClass != null && "".equals(cssClass)) {
			buffer.append("class='" + cssClass + "'");
		}
		if (style != null && "".equals(style)) {
			buffer.append("style='" + style + "'");
		}
		if (onclick != null && "".equals(onclick)) {
			buffer.append("onclick='" + onclick + "'");
		}
		if (disabled != null && "".equals(disabled)) {
			buffer.append("disabled");
		}
		buffer.append(">");
		return buffer.toString();
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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
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
	public PageComponent(String type, String name, String value, String disabled, String onclick) {
		this.type = type;
		this.name = name;
		this.value = value;
		this.disabled = disabled;
		this.onclick = onclick;
	}
	public PageComponent(String id, String type, String name, String value, String disabled, String onclick) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.value = value;
		this.disabled = disabled;
		this.onclick = onclick;
	}
	public PageComponent(String id, String type, String name, String value, String disabled, String style, String cssClass, String onclick) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.value = value;
		this.disabled = disabled;
		this.style = style;
		this.cssClass = cssClass;
		this.onclick = onclick;
	}
	public PageComponent() {
		super();
	}
}
