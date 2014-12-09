package framework.office.xml.dom4j;
import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Dom4jRead {
	private static String root;
	public static void main(String[] args) throws Exception {
		r1(root + "2.xml");
	}
	private static void r1(String path) throws Exception {
		File xf = new File(path);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xf);
		Element eps = doc.getRootElement();
		Iterator<Element> it = eps.elementIterator();
		Element el = null;
		while (it.hasNext()) {
			el = it.next();
			System.out.println(el.attribute("e1"));
		}
	}
}
