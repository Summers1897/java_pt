package framework.oracle.sun.javax.jaxb.sample2.vo;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Child {
	private String id = "1";
	private boolean sex;
	private Date date;
	@XmlElementWrapper(name = "items", namespace = "mylistspa")
	@XmlElement(name = "item")
	private List<Father> list;
	private Map<String, Father> map;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Father> getList() {
		return list;
	}
	public void setList(List<Father> list) {
		this.list = list;
	}
	public Map<String, Father> getMap() {
		return map;
	}
	public void setMap(Map<String, Father> map) {
		this.map = map;
	}
}
