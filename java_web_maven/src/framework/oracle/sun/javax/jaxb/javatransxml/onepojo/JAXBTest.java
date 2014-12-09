package framework.oracle.sun.javax.jaxb.javatransxml.onepojo;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class JAXBTest {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Boy.class);
		Marshaller marshaller = context.createMarshaller();
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println("----------marshaller--------------");
		Boy boy = new Boy();
		marshaller.marshal(boy, System.out);
		System.out.println("\n----------unMarshaller--------------");
		String xml = "<Root><name>aa</name></Root>";
		Boy boy2 = (Boy) unmarshaller.unmarshal(new StringReader(xml));
		System.out.println(boy2.getName());
	}
}
