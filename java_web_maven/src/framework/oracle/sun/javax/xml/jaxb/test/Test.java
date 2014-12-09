package framework.oracle.sun.javax.xml.jaxb.test;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import framework.oracle.sun.javax.xml.jaxb.Pojo;
public class Test {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Pojo.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
		Pojo p = new Pojo();
		p.setId("北京");
		marshaller.marshal(p, System.out);
	}
}
