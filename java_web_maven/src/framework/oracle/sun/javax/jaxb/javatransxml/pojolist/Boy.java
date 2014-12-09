package framework.oracle.sun.javax.jaxb.javatransxml.pojolist;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Boy {
	private String name = "aa";
	private ListAddress addresses;
	private jaxbMap jaxbMap;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ListAddress getAddresses() {
		return addresses;
	}
	public void setAddresses(ListAddress addresses) {
		this.addresses = addresses;
	}
	public jaxbMap getJaxbMap() {
		return jaxbMap;
	}
	public void setJaxbMap(jaxbMap jaxbMap) {
		this.jaxbMap = jaxbMap;
	}
}
