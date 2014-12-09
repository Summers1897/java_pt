package framework.office.xml;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class DomDemo {
	private static Document document;
	private static String fileName = DomDemo.class.getResource("/").getPath() + "test1.xml";
	public static void main(String[] args) throws Exception {
		domparsexml();
	}
	public static void ini() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.newDocument();
	}
	public static void domcreatexml() throws Exception {
		Element root = document.createElement("root");
		document.appendChild(root);
		Element child = document.createElement("emp");
		Element name = document.createElement("name");
		name.appendChild(document.createTextNode("name1"));
		child.appendChild(name);
		root.appendChild(child);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource source = new DOMSource(document);
		transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		StreamResult result = new StreamResult(pw);
		transformer.transform(source, result);
		System.out.println("create   ok");
	}
	public static void domparsexml() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(fileName);
		NodeList root = document.getChildNodes();
		for (int i = 0; i < root.getLength(); i++) {
			Node chi = root.item(i);
			System.out.println(chi.getTextContent());
		}
		System.out.println("parse ok");
	}
}
