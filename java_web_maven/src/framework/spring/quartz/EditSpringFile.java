package framework.spring.quartz;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
public class EditSpringFile {
	/**
	 * 首先遍历一个bean配置文件里的所有bean，获取id和class的值， 然后修改HelloWorld这个bean的msg的值
	 * @throws IOException
	 */
	public static void editXML(String xmlPath, String msg) throws DocumentException, IOException {
		Document XmlDoc = new SAXReader().read(new File(xmlPath));
		List<Element> xmlList = XmlDoc.selectNodes("/beans/bean");
		System.out.println("\r\n遍历所有的bean获得id和class：");
		for (Element element : xmlList) {
			System.out.println("id:" + element.attributeValue("id") + " / class:" + element.attributeValue("class"));
		}
		System.out.println("\r\n动态修改HelloWorld这个bean的msg值：");
		// 用XPath来获取单一节点
		Node valueHelloWorld = XmlDoc.selectSingleNode("/beans/bean[@id='cronTrigger']/property[@name='cronExpression']/value");
		System.out.println("原始值为：" + valueHelloWorld.getText());
		valueHelloWorld.setText(msg);
		System.out.println("修改后的值为：" + valueHelloWorld.getText());
		// 修改完了以后记得保存，要不然你会纳闷为什么XML文件没变的，哈哈
		XMLWriter outXml = new XMLWriter(new FileWriter(new File(xmlPath)));
		outXml.write(XmlDoc);
		outXml.close();
	}
}
