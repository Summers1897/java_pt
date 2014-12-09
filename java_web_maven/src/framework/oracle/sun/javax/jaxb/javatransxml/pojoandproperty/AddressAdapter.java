package framework.oracle.sun.javax.jaxb.javatransxml.pojoandproperty;
import javax.xml.bind.annotation.adapters.XmlAdapter;
public class AddressAdapter extends XmlAdapter<Address, Address> {
	@Override
	public Address unmarshal(Address v) throws Exception {
		return v;
	}
	@Override
	public Address marshal(Address v) throws Exception {
		return v;
	}
}
