package com.k.webshop.util;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BeanLoaderService {
	
	//手工加载系统Service
	public static Object getService(String serviceName) {
		return WebApplicationContextServlet.getWebApplicationContext().getBean(serviceName);
		
		//ServletContext servletContext = ServletActionContext.getServletContext();
		//WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		
		//return wac.getBean(serviceName);
	}
}
