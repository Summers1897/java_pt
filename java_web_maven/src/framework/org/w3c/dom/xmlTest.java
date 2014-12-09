package framework.org.w3c.dom;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
public class xmlTest {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("1.xml"));
		Element root = doc.getDocumentElement();
		NodeList rootlist = root.getChildNodes();
		for (int i = 0; i < rootlist.getLength(); i++) {
			Node n = rootlist.item(i);
			if (n instanceof Element) {
				Element n1 = ((Element) n);
				System.out.println(n1.getElementsByTagName("name").item(0).getNodeValue());
			}
			if (n instanceof NodeList) {
				NodeList nlist = (NodeList) n;
				System.out.println("111" + nlist);
			}
		}
	}
}
