package framework.oracle.sun.javax.jaxb.javatransxml.pojolist1;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class JAXBTest {
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Boy.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
		// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println("----------marshaller--------------");
		Boy boy = new Boy();
		Address address = new Address();
		address.setId("BeiJing");
		List<Address> addresses = new ArrayList<Address>();
		Map<String, Address> map = new HashMap<String, Address>();
		map.put("1", address);
		addresses.add(address);
		addresses.add(address);
		boy.setAddresses(addresses);
		boy.setMap(map);
		marshaller.marshal(boy, System.out);
		System.out.println("\n----------unMarshaller--------------");
		String xml = "<Root><addresses><id>BeiJing</id></addresses><map><entry><key>1</key><value><id>BeiJing</id></value></entry></map><name>aa</name></Root>";
		Boy boy2 = (Boy) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(boy2.getName());
		// System.out.println(boy2.getAddress().getId());
	}
}
