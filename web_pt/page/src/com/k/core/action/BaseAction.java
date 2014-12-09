package com.k.core.action;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L;
	private SessionMap session;
	private HttpServletResponse response;
	private HttpServletRequest request;
	public void setSession(Map session) {
		this.session = (SessionMap) session;
	}
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}
	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}
	public SessionMap getSession() {
		return session;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
}
