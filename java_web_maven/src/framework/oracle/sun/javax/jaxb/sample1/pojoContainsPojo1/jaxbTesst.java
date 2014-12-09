package framework.oracle.sun.javax.jaxb.sample1.pojoContainsPojo1;
import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class jaxbTesst {
	public static void main(String[] args) {
		Father customer = new Father();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);
		Child child = new Child();
		child.setId(1010);
		child.setName("mky11ong");
		child.setAge(291);
		customer.setChild(child);
		try {
			String xml = "<Root><age>29</age><id>100</id><name>mkyong</name></Root>";
			JAXBContext jaxbContext = JAXBContext.newInstance(Father.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT,
			// true);
			jaxbMarshaller.marshal(customer, System.out);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Father customer2 = (Father) unmarshaller.unmarshal(new StringReader(xml));
			System.out.println(customer2.getId());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
