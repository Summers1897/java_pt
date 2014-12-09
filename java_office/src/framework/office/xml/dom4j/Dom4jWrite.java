package framework.office.xml.dom4j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
public class Dom4jWrite {
	private static String root;
	public static void main(String[] args) throws Exception {
		w1(root + "2.xml");
	}
	private static void w1(String path) throws IOException {
		Document doc = DocumentHelper.createDocument();
		Element eps = doc.addElement("eps");
		Element ep1 = eps.addElement("ep");
		ep1.setText("myvafgfdlue");
		ep1.addAttribute("e1", "efdgfda");
		File file = new File(path);
		Writer fileWriter = new FileWriter(file);
		XMLWriter xmlWriter = new XMLWriter(fileWriter);
		xmlWriter.write(doc);
		xmlWriter.flush();
		xmlWriter.close();
	}
}
