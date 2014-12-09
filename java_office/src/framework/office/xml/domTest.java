package framework.office.xml;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class domTest {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 从 XML 文档获取 DOM 文档实例。使用此类，应用程序员可以从 XML 获取一个Document
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		FileInputStream in = new FileInputStream("1.xml");
		Document document = db.parse(in);
		Element root = document.getDocumentElement();
		NodeList nl = document.getElementsByTagName("a");
		showElem(nl);
		in.close();
	}
	/**
	 * 通过递归得到所有子节点
	 * 
	 * @param nl
	 */
	public static void showElem(NodeList nl) {
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			if (n.hasChildNodes()) {
				System.out.print("<" + n.getNodeName() + ">");
				// 递归
				showElem(n.getChildNodes());
				System.out.print("</" + n.getNodeName() + ">");
			} else {
				// 判断是不是文本
				if (n.getNodeType() == Node.TEXT_NODE) {
					System.out.print(n.getNodeValue());
				} else {
					System.out.print("<" + n.getNodeName() + ">");
					System.out.print("</" + n.getNodeName() + ">");
				}
				break;
			}
		}
	}
}
