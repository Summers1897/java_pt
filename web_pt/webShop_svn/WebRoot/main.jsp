<%@ page language="java" import="com.k.webshop.util.*,com.k.webshop.model.SysUser" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/taglibs.tld" prefix="amis" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title></title>
    <meta http-equiv="X-UA-Compatible" content="IE=8">
	<link rel="stylesheet" href="common/css/style.css" type="text/css" />
	<link rel="stylesheet" href="common/css/menu.css" type="text/css" />
	<script type="text/javascript" SRC="common/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" SRC="common/js/jquery.ui.widget.min.js"></script>
	<script type="text/javascript" SRC="common/js/jquery.ui.tabs.min.js"></script>
    <script type="text/javascript" src="common/js/UpdatePwd.js"></script>
<style type="text/css"> 
html,body { width:100%; height:100%;overflow:hidden;margin:0px; padding:0px; font-size:12px; }
.UpdatePwdDiv{overflow: hidden;position: absolute;top:1px;right:1px;z-index: 10000;width:360px;height:180px;}
.UpdatePwdDiv input{border-color: #369;}
/* default */
html,body { width:100%; height:100%; margin:0px; padding:0px; font-size:12px; }
a:link,a:hover,a:visited{text-decoration:none;}
body	{ background:url(common/image/top_bg.jpg) repeat-x 0 0; background-attachment: fixed; }
 
/* top */
.topbox		{ height:80px; background:url(common/image/top_img.jpg) no-repeat 0 0; }
.innerbox_1	{ height:49px; padding-right:10px; }
.innerbox_1 table  { border-collapse:collapse; margin:0 0 0 auto; }
.innerbox_1 table td { padding:0px;}
.innerbox_2	{ height:25px;padding-right:5px; overflow:visible;margin: 0 auto;}

/* top-menu */
.menu			{ background:#0060a0; color:#69c; }
.menu a			{ height:24px; line-height:24px; color:#69bcf4; display:inline-block; margin: 0 2px;}
.menu a:hover	{ color:#fff;}

.icon_t1 { background:url(common/image/icon_t1.png) no-repeat 5px 50%; }
.menu .icon_t2 { background-:url(common/image/icon_t2.png) no-repeat 5px 50%; padding-left-:20px;padding-right:10px; color:#fff;}
.menu a.icon_t3 { background:url(common/image/icon_t3.png) no-repeat 5px 50%; padding-left:25px; 
</style>

<script type="text/javascript">
	function loginOut(){
		document.location.href = "<%=basePath%>user/logout.action";
	}
	 
	window.onload=setIframeHeight;
	window.onresize=setIframeHeight;
	function setIframeHeight(){
		document.getElementById("frameDiv").style.height=document.body.clientHeight-80;
	}
</script>
  </head>  
  <base target="bodyFrame"/>
  <body> 

	<!-- top部分 -->
	<div class="topbox">
	 
		<!-- 帮助菜单 -->
		<div class="innerbox_1">
			<table>
				<tr>
					<td><img src="common/image/helpmenu_bg_left.png"></td>
					<td class="menu">
						<span class="icon_t2">欢迎你，</span>
						 ︳ <a >修改密码</a>
						 ︳ <a href="#">帮助文档</a>
						 ︳ <a href="#">退出系统</a>
					</td>
					<td><img src="common/image/helpmenu_bg_right.png"></td>
				</tr>
			</table>
		</div>
	 
		<!-- 导航菜单 -->
		<div class="innerbox_2">
			<div class="nav">
				<ul class="nav-menu">
					<li class="current"><a href="goods/list.action">首 页</a></li>
					<amis:menu/>
				</ul>
			</div>
		</div>
	 
	</div>
	
	<!-- 内容部分 -->
	<div id="frameDiv" style="width: 100%;height: 100%;">
		<iframe id="bodyFrame" name="bodyFrame"  width="100%" height="100%" frameborder="0" scrolling="auto" ></iframe>
	</div>
	
  </body>
</html>
