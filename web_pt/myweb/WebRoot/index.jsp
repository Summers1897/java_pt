<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java"   pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
 <head>
<base href="<%=basePath%>"/>
<title>营销管理信息系统.登录</title>

<style type=text/css>
*		{ margin:0px; padding:0px; font-family:宋体,Arial,sans-serif; border:0px; }
html	{ overflow-y:hidden; }
body	{ background:#fff; background:url(images/login_bg.jpg) repeat-x 0 0;}


.logo		{ height:77px; background:url(images/logo_dtpi.png) no-repeat 20px 13px; }
.login_bgimg{ height:500px; background:url(images/login_bg_img.jpg) no-repeat 50% 0; border-bottom:1px solid #ccc;}

/* form */
.login_bgimg div input { vertical-align:middle; }

form		{ margin: 0px auto; width:700px; padding:0px; text-align:center; }

label		{ font-size:14px; color:#036; font-weight:bold; width:40px; text-align:right;padding-left:10px;}
input		{ background: #cde; border:1px solid #569; color:#666; height:22px; line-height:22px; padding-left:3px;}

.sffocus	{ background: #fff; border:1px solid #036; color:#000; }/* for IE */
input:focus { background: #fff; border:1px solid #036; color:#000;}/* for firefox..*/

.foot	{ height:30px; line-height:30px; text-align:center; font-size:12px; color:#999;  }

/* button  */
.btn_b {
	border:1px solid #369;
	padding:0px 15px; 
	margin-left:10px;
	height:26px;
	width:auto;	
	overflow:visible;
	/*font-size:14px;*/ 
	color:#fff; 
	cursor:pointer;
	background:#69c url(images/btn_bg_b.png) repeat-x 0 0 ;
}

</style>
</head>  
<body >
<div class="logo"></div>
<div class="login_bgimg">
	<div style="height:430px; clear:both;"></div>
	<div style="height:30px; clear:both;margin-top:20px">
		<form name="login" action="<%=basePath%>user/login.action" method="post">
			<label for="name">用户名:</label>
			<input type="text" name="user.usrLoginname" id="usrName"   style="width:120px;" />

			<label for="pw">密码:</label>
			<input type="password" name="user.usrLoginpwd" id="usrPass"   style="width:120px;font-size:8px;" />

			<input type="submit" class="btn_b" onclick ="login()" value=" 确 定 " />
			<input type="button" class="btn_b" onclick="reset()" value=" 取 消 "/>
		</form>
	</div>
</div>
<div class="foot">版权所有:大唐国际发电股份有限公司</div>
</body>
</html>
