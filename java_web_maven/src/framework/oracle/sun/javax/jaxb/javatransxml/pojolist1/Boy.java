package framework.oracle.sun.javax.jaxb.javatransxml.pojolist1;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Boy {
	private String name = "aa";
	private Map<String, Address> map;
	private List<Address> addresses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Address> getMap() {
		return map;
	}
	public void setMap(Map<String, Address> map) {
		this.map = map;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
