package com.k.core.taglib;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.k.core.listener.SpringBeanLoadListener;
import com.k.model.User;
import com.k.service.system.ResourceService;
import com.k.util.SysAttr;
import com.k.vo.SysResourceVO;
public class MenuPageTagLib extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		HttpSession session = pageContext.getSession();
		JspWriter out = pageContext.getOut();
		User user = (User) session.getAttribute(SysAttr.USER_lOGINNAME);
		ResourceService resourceService = (ResourceService) SpringBeanLoadListener.getBean("resourceService");
		try {
			List<SysResourceVO> list = resourceService.getMysqlAllRes();
			SysResourceVO vo = null;
			SysResourceVO nextvo = null;
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				nextvo = i + 1 > list.size() - 1 ? null : list.get(i + 1);
				if (vo.getLevel() == 2) {
					buffer.append("<li class='current'>");
					buffer.append("<a ");
					if(vo.getResUrl()!=null&&!"/".equals(vo.getResUrl())){
						buffer.append(" href='"+vo.getResUrl()+"'");
					}
					buffer.append(" >");
					buffer.append(vo.getResName());
					buffer.append("</a>");
					if (nextvo != null) {
						buffer.append(getSecondMenu(3, i + 1, list));
					}
					buffer.append("</li>");
				} else if (vo.getLevel() > 2) {
					continue;
				} else if (vo.getLevel() < 2) {
					break;
				}
			}
			System.out.println(buffer.toString());
			out.write(buffer.toString());
		} catch (Exception e) {
		}
		return SKIP_BODY;
	}
	// 加载二级菜单
	public String getSecondMenu(int level, int begin, List<SysResourceVO> list) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<ul>");
		SysResourceVO vo = null;
		SysResourceVO nextvo = null;
		for (int i = begin; i < list.size(); i++) {
			vo = list.get(i);
			nextvo = i + 1 > list.size() - 1 ? null : list.get(i + 1);
			if (vo.getLevel() == level) {
				buffer.append("<li>");
				buffer.append("<a ");
				if(vo.getResUrl()!=null&&!"/".equals(vo.getResUrl())){
					buffer.append(" href='"+vo.getResUrl()+"'");
				}
				buffer.append(" >");
				buffer.append(vo.getResName());
				if (nextvo != null&&nextvo.getLevel()>level) {
					buffer.append("<img src='images/right_pointer.gif' style='border:0;'>");
				}
				buffer.append("</a>");
				if (nextvo != null&&nextvo.getLevel()>level) {
					buffer.append(getSecondMenu(level + 1, i + 1, list));
				}
				buffer.append("</li>");
			} else if (vo.getLevel() > level) {
				continue;
			} else if (vo.getLevel() < level) {
				break;
			}
		}
		buffer.append("</ul>");
		return buffer.toString();
	}
}
