<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>编辑角色</title>
	<link rel="stylesheet" type="text/css" href="include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>jscript/extjs/css/ext-all.css" />
	<script type="text/javascript" src="<%=basePath%>jscript/extjs/js/ext-base.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/extjs/js/ext-all.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/extjs/js/TreeCheckNodeUI.js"></script>
	<style>
		.tab1{cursor:pointer;float:left;background-image:url(<%=basePath%>images/btn_bk.png);text-align:center;width:80px;height:25px;line-height:25px;overflow: hidden;position:relative;top:5px;border-color:#b6c6cd; border-style:solid; border-width:1px;padding:0px}
		.tab2{cursor:pointer;float:left;background-image:url(<%=basePath%>images/btn_bk.png);width:80px;text-align:center;height:25px;line-height:25px;overflow: hidden;position:relative;top:5px;border-color:#b6c6cd;border-style:solid; border-width:1px;margin-left:5px;padding:0px}
	</style>
	<script type="text/javascript">
	  	Ext.BLANK_IMAGE_URL = '<%=basePath%>jscript/extjs/images/default/tree/s.gif';
	</script>
	<script type="text/javascript">
	var tree;
	Ext.onReady(function(){
		var url = '<%=basePath%>resource/tree.action';
	  	var loader = new Ext.tree.TreeLoader({dataUrl: url,baseParams:{roleId:"${role.id}"},baseAttrs: { uiProvider: Ext.ux.TreeCheckNodeUI }});
		tree = new Ext.tree.TreePanel({
	    	useArrows:true,
	    	animate:true, 
	    	checkModel: 'parentCascade', //对树的级联多选 
			onlyLeafCheckable: false,//对树所有结点都可选 
	        el: 'resTree',
	        autoScroll : true,
	        rootVisible:false,
	        loader: loader,
	        selModel : new Ext.tree.MultiSelectionModel,
	        listeners:{"render":function(panel){
				 panel.expandAll();
			}}
	    });
		root = new Ext.tree.AsyncTreeNode({
			id: 'ROOT',
			text:'系统资源'
		});
	    tree.setRootNode(root);
    	tree.render();
	});
	
	function save(){
		var roleName=document.getElementById("roleName");
		var roleCode=document.getElementById("roleCode");
		if(roleName.value==""){
			alert('角色名称不能为空！');
			return false;
		}
		if(roleCode.value==""){
			alert('角色编码不能为空！');
			return false;
		}
		var resIds = tree.getChecked("id");
		if(resIds==null||resIds==""){alert("请选择系统资源.");return;}
		document.getElementById("roleResources").value = resIds;
		var jsonVar=$("#roleForm").serialize();
		$.ajax({
			url:"<%=basePath%>role/edit.action",
			type:"post",
			dataType:"json",
			data:jsonVar,
			success:function(data){
			  if(data.message=="YES"){
					 alert("编辑角色成功！");			
					 location.href = "role/list.action";	  
			  }else if(data.message=="NO"){
					 alert("编辑角色失败！"); 
					 return;
			  }
			}
		})
	}
	function tabswitch(obj){
		var cls = obj.className;
		if(cls=="tab1"){
			var roleTbl = document.getElementById("roleInfo");
			var resTbl = document.getElementById("resInfo");
			roleTbl.style.display = "";
			resTbl.style.display = "none";
		}else{
			var roleTbl = document.getElementById("roleInfo");
			var resTbl = document.getElementById("resInfo");
			roleTbl.style.display = "none";
			resTbl.style.display = "";
		}
	}
	</script>
  </head>  
  <body style="height: 100%;">
  	<div id="navi">
	    <div class="name">编辑角色</div>
	</div>
	<table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
  			<tr style="width:100%;">
  			    <td align="left" style=" border-color:#b6c6cd; border-style:solid; border-width:1px 0px 0px 1px;padding-left:3px"bgcolor="#d5e9f9">
  				<div id="roleTab" class="tab1" onclick="tabswitch(this)">基本信息</div><div id="resTab" class="tab2" onclick="tabswitch(this)">资源分配</div>
  				</td>
 					<td align="right" style="height:34px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 0px;padding-left:3px"bgcolor="#d5e9f9">
  					<input type="button" class="button" value="保存" onClick="save()">
  					<input type="button" class="button" value="取消" onClick="javascript:window.history.back(-1)">
  				</td>
  			</tr>
	</table>
	<div  style="border-style:solid; border-width:0px 1px 0px 1px;border-color:#b6c6cd">
     <table id="roleInfo" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#ffffff" class="tab011">
	  <form id="roleForm" name="roleForm" method="post">
	  <input type="hidden" id="roleResources" name="roleResources"/>
	  <input type="hidden" name="role.id" id="role.id" value="${role.id}"/>
		   <tr class="oddline">
			   <td height="20" align="right" style="padding-right:10px" class="black">角色类型:</td>
					<td width="89%">
					<select name="role.roleType" style="height:23px;width:180px;border:1px solid #808080">
					<option value="1" <s:if test="role.roleType==1">selected</s:if>>应用角色</option>
					<option value="2" <s:if test="role.roleType==2">selected</s:if>>业务角色</option>
					</select>
					<span style="color:red;padding-left:5px">*</span>
					</td>
		   </tr>
		   <tr class="oddline">
			   <td height="20" align="right" width="6%" style="padding-right:10px" class="black">角色名称:</td>
				 <td>
				 		<input type="text" name="role.roleName" id="roleName" value="${role.roleName}" class="txt">
				 		<span style="color:red;padding-left:5px">*</span>
				 </td>
		   </tr>
		   <tr class="oddline">
			   <td height="20" align="right" style="padding-right:10px" class="black">角色编码:</td>
				 <td width="89%">					
					<input type="text" name="role.roleCode" id="roleCode" value="${role.roleCode}" class="txt">
					<span style="color:red;padding-left:5px">*</span>
				 </td>
		   </tr>
		  <tr class="oddline">
		     <td height="20" align="right" valign="top" style="padding-right:10px" class="black">角色备注:</td>
				 <td>
				 	<textarea  rows="5" cols="35" name="role.roleRemark" id="roleRemark" class="txt">${role.roleRemark}</textarea>  
			  </td>
		 </tr>	   
		   </form>
   </table>
 <table id="resInfo" width="100%" height="100%" border="0" style="background-color: #FFFFFF;padding:5px 0px 5px 0px;display:none">
	<tr style="height:100%;">
		<td width="100%" bgcolor="#FFFFFF" >
			<div id="resTree" style="height: 100%;width:100%;overflow-y:auto;"></div>
			<input type="hidden" name="selectedRes" id="selectedRes"/>
		</td>
	</tr>
  </table>   
  </div>
  </body>
</html>
