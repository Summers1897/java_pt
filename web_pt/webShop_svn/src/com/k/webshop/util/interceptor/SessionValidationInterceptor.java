package com.k.webshop.util.interceptor;
import java.util.Map;

import com.k.webshop.model.SysUser;
import com.k.webshop.util.SystemAttributes;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
public class SessionValidationInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		SysUser user = (SysUser) session.get(SystemAttributes.LOGIN_USER);
		if (user != null) {
			return invocation.invoke();
		} else {
			return "index";
		}
	}
}
