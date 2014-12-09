package framework.oracle.sun.javax.jaxb.javatransxml.pojoandproperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Boy {
	private String name = "aa";
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlJavaTypeAdapter(AddressAdapter.class)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
