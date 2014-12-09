package framework.oracle.sun.javax.servletContext;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
public class BeanLoaderService {
	/**
	 * 鎵嬪伐鍔犺浇绯荤粺Service
	 * @param serviceName
	 * @return
	 */
	public static Object getService(String serviceName) {
		ServletContext servletContext = ServletActionContext.getServletContext();
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		return wac.getBean(serviceName);
	}
}
