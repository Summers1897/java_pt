<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="" rel="stylesheet" type="text/css"></link>
<link href="<%=basePath%>include/styles.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>include/tab.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>jscript/FusionCharts.js"></script>
<script type="text/javascript" src="<%=basePath%>MSLine1.js"></script>
<title>主页</title>
<style type="text/css">
body{ background:url(<%=basePath%>images/bg_page.png) repeat-x 0 0; }
a	{ text-decoration:none; color:#333;  }
ul	{ list-style-type:none; }
/* left部分 ============= */
.left_box {overflow:hidden; border:0px solid #bdf;}
/* 主要生产指标 */
.left_t { border-bottom:1px solid #a4c7d6;padding-left:10px; height:28px;line-height:28px; color:#3d9ac1;font-size:13px; font-weight:bold; overflow:hidden;background:url(<%=basePath%>images/menubg.jpg) repeat-x 0 0; }
.left_t span { float:left; height:26px;width:30px;display:inline-block; background:url(<%=basePath%>images/bar.png) no-repeat 0 50%; }
.left_c_1	{ float: left;width: 100%;height:270px; background:#fff; position:relative;  }
.left_c_1 a {color:#369;}
.left_c_1 li	{ float:left; width:100%; margin-right:25px; padding-left:5px;height:24px; line-height:24px;overflow:hidden; }
.left_c_1 li span:hover {cursor:pointer }
.left_c_1 li span{color:#369;height: 20px;border:0px;overflow: hidden; text-overflow:ellipsis;float:left;}
/* 发电量趋势 */
.left_t1  { border-top:1px solid #a4c7d6; border-bottom:1px solid #a4c7d6; padding-left:10px; height:28px;line-height:28px; color:#3d9ac1;font-size:13px; font-weight:bold; overflow:hidden;background:url(<%=basePath%>images/menubg.jpg) repeat-x 0 0; }
.left_t1 span { float:left; height:26px;width:30px;display:inline-block; background:url(<%=basePath%>images/line.png) no-repeat 0 50%; }
/* 右栏 ============= */
.right_box{ position:relative; border:1px solid #8fbed2; }
.r_t_1		{ border-bottom:1px solid #a4c7d6;padding-left:10px; height:28px; line-height:28px; color:#3d9ac1;font-size:13px; font-weight:bold; overflow:hidden;background:url(<%=basePath%>images/menubg.jpg) repeat-x 0 0; }
.r_c_1		{  background:#f3f6f9; overflow:hidden; }
.r_c_1 ul	{ padding:0px; }
.r_c_1 li	{ list-style-type:none; height:28px; line-height:28px;}
.r_c_1 li span		{text-align:center; color:#369; display:block;height:28px; }
.r_c_1 li span:hover { color:#fff; background:#51A8FF; cursor:pointer}

/*  最新通知*/
.r_c_1_ul_news li a {width-:160px;height:22px;  overflow:hidden; color:#369; display:block; padding-left:10px;}
.r_c_1_ul_news li a:hover { color:#e60;text-decoration: underline;}

/*  相关文件*/
.r_c_1_ul_file li a {width-:160px;height:22px;  overflow:hidden; color:#369; display:block; padding-left:10px;}
.r_c_1_ul_file li a:hover { color:#e60;text-decoration: underline;}

/* 图标 */
.icon_1	span{ float:left; height:26px;width:30px;display:inline-block; background:url(<%=basePath%>images/direction.png) no-repeat 0 50%; }
.icon_2	span{ float:left; height:26px;width:30px;display:inline-block; background:url(<%=basePath%>images/viewstack.png) no-repeat 0 50%; }
.caption{
width: 25%;
height: 10% ;
padding-left: 5px;
vertical-align: bottom;
text-align: center;
margin-bottom: 0px;
}
.fushioncharts{
height:100%;
text-align: left;
margin-top: 0px;
}
</style>
</head>
<body>	
<div style="width:1000px; overflow:hidden; margin:0 auto;">
<table width="1000px" border="0" cellpadding="0" cellspacing="0" style="margin-top:5px;" >
<tr><td width="800px" valign="top">
<!-- * left * 1 -->
<div style="border:1px solid #a4c7d6;width: 800px;">
<div class="left_box">
	<div class="left_t"><span></span>主要生产指标（${dayDataLastDate }）
	</div>
	<div class="left_c_1" >
		<table style="height: 100%;" >
			<tr style="height: 10%">
				<td class="caption">${fdlLabel }</td>
				<td class="caption">${lyxsLabel }</td>
				<td class="caption">${gdmhLabel }</td>
				<td class="caption">${zhlyxsLabel }</td>
			</tr>
			<tr style="height: 90%">
				<td><div id="lyxsdiv" class="fushioncharts" ></div></td>
				<td><div id="lyxsdiv1" class="fushioncharts"></div></td>
				<td><div id="lyxsdiv2" class="fushioncharts"></div></td>
				<td><div id="lyxsdiv3" class="fushioncharts"></div></td>
			</tr>
		</table>
	</div>
</div>
<div class="left_box" style="margin-top:5px; width:100%">
	<div class="left_t1"><span></span>2013年发电量完成趋势图（亿瓦时）&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <img src="<%=basePath%>images/red.png"/><font color="#CD919E">实际值</font>  <img src="<%=basePath%>images/blue.png"/><font color="#6495ED">同期值</font></div>
		<div id="n1" class="left_c_1" style="height: 200px">
			<div id="fdlYearDiv"></div>
		</div>
	</div>
</div>
</td>
<td  width="10"><div style="width:10px;"></div></td>	
<td  width="200" valign="top">
<!-- * 右边栏 *  -->
<div class="right_box" style="padding-bottom:0px;">
	<div class="r_t_1 icon_1"><span></span>公告通知</div>
	<div class="r_c_1_ul_news" style=" height:270px; background-color:#FFF">	
	<ul>	
		<s:subset source="newsList" start="0" count= "10" >
			<s:iterator id="news"  status="status">
				<li style="padding-left:0px;list-style-type:none; height:22px; line-height:22px;"><a href="javascript:viewNews('${news.id}')" title="${news.newsTitle}">${status.index+1}.${news.newsTitle}</a></li>
			</s:iterator>
		</s:subset> 
	</ul>
	</div>	
</div>
<div class="right_box" style="margin-top:5px">
	<div class="r_t_1 icon_2"><span></span>相关文件</div>
	<div class="r_c_1_ul_file" style=" height:200px;  background-color:#FFF">	
		<ul>		
		<s:subset source="relFileList" start="0" count= "5" >
			<s:iterator id="relFile"  status="status">
				<li style="padding-left:0px;list-style-type:none; height:22px; line-height:22px;"><a href="javascript:downFile('${relFile.id}')" title="${relFile.fileTitle}">${status.index+1}.${relFile.fileTitle}</a></li>
			</s:iterator>
		</s:subset> 
		</ul>				
	</div>	
</div>
</td>
</tr>   
<tr><td colspan="3" align="center">
<div style="clear: both;color: #999999;margin-top:10px;display:none">
	<span>底部维护说明</span>
</div>
</td></tr>  
</table>
</div>
</body>
</html>
