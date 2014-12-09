package com.k.core.interceptor;
import org.apache.struts2.dispatcher.SessionMap;

import com.k.model.User;
import com.k.util.SysAttr;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
public class UserLoginIntercepter extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		SessionMap session = (SessionMap) context.getSession();
		User user = (User) session.get(SysAttr.USER_lOGINNAME);
		if (user != null) {
			return invocation.invoke();
		} else {
			return "index";
		}
	}
}
