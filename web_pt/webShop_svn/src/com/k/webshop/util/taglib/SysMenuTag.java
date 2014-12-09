package com.k.webshop.util.taglib;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.k.webshop.model.SysResource;
import com.k.webshop.service.system.SysResourceService;
import com.k.webshop.util.BeanLoaderService;
public class SysMenuTag extends TagSupport {
	@Override
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		HttpServletRequest req = (HttpServletRequest) pageContext.getRequest();
		HttpSession session = req.getSession(true);
		// SysUser user = (SysUser)
		// session.getAttribute(SystemAttributes.LOGIN_USER);
		// if (user == null) {
		// return SKIP_BODY;
		// }
		StringBuffer buffer = new StringBuffer();
		try {
			// 手工加载ResourceService
			SysResourceService resourceService = (SysResourceService) BeanLoaderService.getService("sysResourceService");
			// List<SysResource> resList =
			// resourceService.findUserResource(user, true);
			List<SysResource> resList = resourceService.findSysResourceList();
			resList = iniList(resList);
			// 生成用户集成应用菜单,只包含功能/模块资源
			SysResource resource = null;
			SysResource nextRes = null;
			long level = 1;
			if (resList != null && resList.size() > 0) {
				for (int i = 0; i < resList.size(); i++) {
					resource = resList.get(i);
					nextRes = i < resList.size() - 1 ? resList.get(i + 1) : null;
					level = resource.getLevel();
					if (level == 2) {// /第一层
						if (resource.getResUrl() != null && "/".equals(resource.getResUrl())) {
							buffer.append("<li class='current'><a>" + resource.getResName() + "</a>");
						} else {
							buffer.append("<li class='current'><a href='" + resource.getResUrl() + "'>" + resource.getResName() + "</a>");
						}
						if (nextRes != null && level < nextRes.getLevel()) {
							buffer.append(loadResourceHTML(3, i + 1, resList));
						} else {
							buffer.append("<ul></ul>");
						}
						buffer.append("</li>");
					}
				}
			}
			out.write(buffer.toString());
			out.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return SKIP_BODY;
	}
	// 加载资源菜单，生成HTML代码
	public String loadResourceHTML(int level, int beginIndex, List<SysResource> resList) {
		StringBuffer buffer = new StringBuffer();
		try {
			List<SysResource> child = resList;
			// 加载下一级资源，并递归查询
			buffer.append("<ul>");
			for (int i = beginIndex; child != null && i < child.size(); i++) {
				SysResource res = child.get(i);
				SysResource nextRes = i < resList.size() - 1 ? resList.get(i + 1) : null;
				if (res.getLevel() == level) {
					buffer.append("<li><a");
					if (res.getResUrl() != null && "/".equals(res.getResUrl())) {
						buffer.append(">");
					} else {
						buffer.append(" href='");
						buffer.append(res.getResUrl());
						buffer.append("'>");
					}
					if (nextRes != null && level < nextRes.getLevel()) {
						buffer.append(res.getResName() + "&nbsp;&nbsp;<img src='images/right_pointer.gif' style='border:0;'/>");
						buffer.append(loadResourceHTML(level + 1, i + 1, resList));
						buffer.append("</a></li>");
					} else {
						buffer.append(res.getResName());
						buffer.append("</a></li>");
					}
				} else if (res.getLevel() < level) {
					break;
				}
			}
			buffer.append("</ul>");
		} catch (Exception ex) {
			return "";
		}
		return buffer.toString();
	}
	private List<SysResource> iniList(List<SysResource> list) {
		List<SysResource> newList = new ArrayList<SysResource>();
		SysResource root = null;
		for (SysResource vo : list) {
			if (vo.getId() == -1) {
				vo.setLevel(1);
				root = vo;
				list.remove(vo);
				break;
			}
		}
		SysResource vo1 = null;
		SysResource vo2 = null;
		SysResource voPar = null;
		newList.add(root);
		if (list.size() > 0) {
			for (int i1 = newList.size() - 1; i1 >= 0; i1--) {
				vo1 = newList.get(i1);
				for (int i = list.size() - 1; i >= 0; i--) {
					vo2 = list.get(i);
					voPar = vo2.getSysResource();
					if (vo1.getId() == voPar.getId()) {
						vo2.setLevel(vo1.getLevel() + 1);
						newList.add(vo2);
						list.remove(i);
					}
				}
			}
		}
		if (list.size() > 0) {
			for (int i1 = newList.size() - 1; i1 >= 0; i1--) {
				vo1 = newList.get(i1);
				for (int i = list.size() - 1; i >= 0; i--) {
					vo2 = list.get(i);
					voPar = vo2.getSysResource();
					if (vo1.getId() == voPar.getId()) {
						vo2.setLevel(vo1.getLevel() + 1);
						newList.add(vo2);
						list.remove(i);
					}
				}
			}
		}
		if (list.size() > 0) {
			for (int i1 = newList.size() - 1; i1 >= 0; i1--) {
				vo1 = newList.get(i1);
				for (int i = list.size() - 1; i >= 0; i--) {
					vo2 = list.get(i);
					voPar = vo2.getSysResource();
					if (vo1.getId() == voPar.getId()) {
						vo2.setLevel(vo1.getLevel() + 1);
						newList.add(vo2);
						list.remove(i);
					}
				}
			}
		}
		if (list.size() > 0) {
			for (int i1 = newList.size() - 1; i1 >= 0; i1--) {
				vo1 = newList.get(i1);
				for (int i = list.size() - 1; i >= 0; i--) {
					vo2 = list.get(i);
					voPar = vo2.getSysResource();
					if (vo1.getId() == voPar.getId()) {
						vo2.setLevel(vo1.getLevel() + 1);
						newList.add(vo2);
						list.remove(i);
					}
				}
			}
		}
		return newList;
	}
}