package com.k.util.core.spring;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
public class SpringContextListener implements ServletContextListener {
	private static WebApplicationContext applicationContext;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		applicationContext = null;
	}
	@Override
	public void contextInitialized(ServletContextEvent event) {
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
	}
	public static WebApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
