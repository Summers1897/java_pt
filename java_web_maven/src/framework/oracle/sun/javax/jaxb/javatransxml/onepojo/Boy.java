package framework.oracle.sun.javax.jaxb.javatransxml.onepojo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Boy {
	private String name = "aa";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
