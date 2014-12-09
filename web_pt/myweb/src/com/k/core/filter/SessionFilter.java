package com.k.core.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.k.model.User;
import com.k.util.SysAttr;
public class SessionFilter implements Filter {
	private FilterConfig config;
	@Override
	public void destroy() {
		config = null;
	}
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpSession session = request.getSession();
		String root = request.getContextPath();
		String url = request.getRequestURI();
		User user = null;
		if (url.indexOf("login.action") == -1) {
			user = (User) session.getAttribute(SysAttr.USER_lOGINNAME);
			if (user != null) {
				chain.doFilter(request, response);
			} else {
				response.sendRedirect(root);
			}
		} else {
			chain.doFilter(request, response);
		}
	}
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}
}
