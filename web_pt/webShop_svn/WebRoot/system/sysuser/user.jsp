<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>用户管理</title>	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>jscript/extjs/css/ext-all.css">
	<script type="text/javascript" src="<%=basePath%>jscript/Main.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/extjs/js/ext-base.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/extjs/js/ext-all.js"></script>
	<script type="text/javascript">
	  	Ext.BLANK_IMAGE_URL = '<%=basePath%>jscript/extjs/images/default/tree/s.gif';
	</script>
	<script type="text/javascript">
	Ext.onReady(function(){
		var Tree = Ext.tree;
	    var tree = new Tree.TreePanel({
	        el:'tree',
	        rootVisible:false,
	        autoScroll:true,
	        loader: new Tree.TreeLoader({dataUrl:'<%=basePath%>organ/tree.action'}),
       		listeners:{"render":function(panel){
					panel.expandPath("/ROOT/-1");
				}
			}
	    });	
	    var root = new Tree.AsyncTreeNode({
	        text: '根节点',
	        id:'ROOT'
	    });
		tree.on("click",function(node){
			toTarget.location.href="<%=basePath%>user/list.action?organId="+node.id+'&date='+new Date();
		});
		tree.setRootNode(root);
		tree.render();
	    root.expand();	    
	});
	</script>
  </head>  
  <body style="height: 100%;overflow: hidden;">
  <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout: fixed; word-break: break-all;">
	<tr>
		<td id="LeftFrame" width="20%" height="100%" align="left" valign="top" style="display:block;border: 0px;" align="center">
			<table width="100%" id="table" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout: fixed; word-break: break-all;">
			<tr>
			<td style="border-color:#b6c6cd; border-style:solid; border-width:0px 1px 1px 1px;background-image:url(<%=basePath%>images/title_bk.png);height: 28px;line-height:28px;padding-left:3px;color:#333333; font-weight:bold">组织机构</td></tr>
			<tr>
				<td align="left"  valign="top" style=" border-width:0px 1px 1px 1px; border-style: solid; border-color:#b6c6cd;">
					<div id="tree" style="height: 100%;background-color:#ffffff"></div>
				</td>
			</tr>
			</table>
		</td>
		<td width="7" style="background-color: #EEEEEE;">
			<img id="showhidebtn" style="cursor: hand;"  width="7" height="100" onClick="treeView('LeftFrame','showhidebtn','RightFrame');" src="<%=basePath%>images/treeHide.gif">
		</td>
		<td id="RightFrame" align="left" valign="top" style="padding-left:0px;" >
			<iframe id="toTarget" src="<%=basePath %>user/list.action" name="toTarget" frameborder="0" width="100%" height="100%"  scrolling="no" ></iframe>
		</td>
	</tr>
  </table>
  </body>
</html>
