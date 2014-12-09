package com.k.core.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
public class SpringBeanLoadListener implements ServletContextListener {
	private static WebApplicationContext webApplicationContext;
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		webApplicationContext = null;
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContextListener:" + webApplicationContext);
		webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
	}
	public static Object getBean(String beanName) {
		return webApplicationContext.getBean(beanName);
	}
}
