<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>" />
		<title>营销管理信息系统.登录</title>
		<s:property value="outputJS()" escape="false"/>
		
	</head>
	<body>
		<div class="logo"></div>
		<div class="login_bgimg">
			<div style="height: 430px; clear: both;"></div>
			<div style="height: 30px; clear: both; margin-top: 20px">
			
			<s:form name="login"   method="post">
<s:iterator value="page.list" status="stat"  >
id:${id }
</s:iterator>
					<s:property value="outputBarArgs()" escape="false"/>
				</s:form>
			</div>
		</div>
		<div class="foot">
		</div>
	</body>
</html>
