package framework.webservice.xfire.client;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import framework.webservice.xfire.service.Server;
public class test {
	public static void main(String[] args) {
		String serviceUrl = "http://localhost:80/aaa/services/callImitation";
		Service serviceModel = new ObjectServiceFactory().create(Server.class, null, "http://localhost:80/aaa/services/callImitation?wsdl", null);
		XFireProxyFactory serviceFactory = new XFireProxyFactory();
		try {
			Server service = (Server) serviceFactory.create(serviceModel, serviceUrl);
			String hello = service.getname("hjkj;ljk;k;lkl;h");
			System.out.println(hello);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
