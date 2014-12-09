package framework.oracle.sun.javax.jaxb.sample2.vo;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class JaxbTest {
	public static void main(String[] args) throws Exception {
		JAXBContext content = JAXBContext.newInstance(Child.class);
		Child vo = new Child();
		// vo.setId("1");
		vo.setSex(true);
		vo.setDate(new Date());
		Father fa = new Father();
		fa.setId(Math.random() + "");
		List<Father> list = new ArrayList<Father>();
		list.add(fa);
		list.add(fa);
		vo.setList(list);
		Map<String, Father> map = new HashMap<String, Father>();
		map.put("f1", fa);
		map.put("f2", fa);
		vo.setMap(map);
		Marshaller ma = content.createMarshaller();
		ma.setProperty(Marshaller.JAXB_FRAGMENT, true);
		ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Unmarshaller un = content.createUnmarshaller();
		Writer wri = new StringWriter();
		ma.marshal(vo, wri);
		Child vo1 = new Child();
		Reader reader = new StringReader(wri.toString());
		// Reader reader1=new
		// StringReader("<ns2:childroot xmlns:ns2='chilespace'><id>1</id><sex>true</sex><date>2013-01-26</date></ns2:childroot>");
		vo1 = (Child) un.unmarshal(reader);
		System.out.println(wri);
	}
}
