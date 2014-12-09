package framework.oracle.sun.javax.jaxb.javatransxml.pojolist;
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
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println("----------marshaller--------------");
		Boy boy = new Boy();
		Address address = new Address();
		address.setId("BeiJing");
		List<Address> addresses = new ArrayList<Address>();
		Map<String, Address> map = new HashMap<String, Address>();
		map.put("1", address);
		addresses.add(address);
		ListAddress address2 = new ListAddress();
		address2.setAddresses1(addresses);
		boy.setAddresses(address2);
		jaxbMap jaxbMap = new jaxbMap();
		jaxbMap.setMap(map);
		boy.setJaxbMap(jaxbMap);
		marshaller.marshal(boy, System.out);
		System.out.println("\n----------unMarshaller--------------");
		String xml = "<Root><addresses><addresses1><id>BeiJing</id></addresses1></addresses><jaxbMap><map><entry><key>1</key><value><id>BeiJing</id></value></entry></map></jaxbMap><name>aa</name></Root>";
		Boy boy2 = (Boy) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(boy2.getName());
		// System.out.println(boy2.getAddress().getId());
	}
}
