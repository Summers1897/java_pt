package framework.oracle.sun.javax.jaxb.sample1.pojo1;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class jaxbTesst {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);
		try {
			String xml = "<Root><age>29</age><id>100</id><name>mkyong</name></Root>";
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
			// true);
			// jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT,
			// true);
			jaxbMarshaller.marshal(customer, System.out);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customer customer2 = (Customer) unmarshaller.unmarshal(new StringReader(xml));
			System.out.println(customer2.getId());
			// jaxbMarshaller.marshal(customer, System.out);
			/*
			 * // output pretty printed jaxbMarshaller.setProperty(Marshaller
			 * .JAXB_FORMATTED_OUTPUT, true);
			 * 
			 * jaxbMarshaller.marshal(customer, file);
			 */
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
