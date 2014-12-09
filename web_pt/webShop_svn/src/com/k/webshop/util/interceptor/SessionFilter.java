package com.k.webshop.util.interceptor;
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

import com.k.webshop.util.SystemAttributes;

public class SessionFilter implements Filter {
public FilterConfig config;
	

	public void setFilterConfig(FilterConfig config) {
		this.config = config;
	}

	public FilterConfig getFilterConfig() {
		return config;
	}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpreq = (HttpServletRequest) request;
		HttpServletResponse httpres = (HttpServletResponse) response;
		String context = httpreq.getContextPath();
		HttpSession httpSession = httpreq.getSession(true);
		String uri = httpreq.getRequestURI();
		if(uri.indexOf("login.action")==-1){
			if (httpSession.getAttribute(SystemAttributes.LOGIN_USER) == null) {
				httpres.sendRedirect(context);
				return;
			}
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
		this.config = null;
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
			
	}
}

