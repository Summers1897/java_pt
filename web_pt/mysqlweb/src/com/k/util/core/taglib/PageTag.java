package com.k.util.core.taglib;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.k.model.SysResource;
import com.k.service.SysResourceService;
import com.k.util.core.spring.BeanUtil;
/**
 * @author K
 * 
 */
public class PageTag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		StringBuilder builder = new StringBuilder();
		SysResourceService sysResourceService = (SysResourceService) BeanUtil.getBean("sysResourceService");
		List<SysResource> list = sysResourceService.getSysResource();
		for (SysResource res : list) {
			builder.append(res.getId() + "");
		}
		try {
			out.println(builder.toString());
		} catch (IOException e) {
		}
		return SKIP_BODY;
	}
}
