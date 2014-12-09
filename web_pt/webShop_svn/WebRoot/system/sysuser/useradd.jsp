<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>新建用户</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>jscript/extjs/css/ext-all.css" />
	<script type="text/javascript" src="<%=basePath %>jscript/extjs/js/ext-base.js"></script>
	<script type="text/javascript" src="<%=basePath %>jscript/extjs/js/ext-all.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/Listbox.js"></script>
	<style>
		.tab1{cursor:pointer;float:left;background-image:url(<%=basePath%>images/btn_bk.png);text-align:center;width:80px;height:25px;line-height:25px;overflow: hidden;position:relative;top:5px;border-color:#b6c6cd; border-style:solid; border-width:1px;padding:0px}
		.tab2{cursor:pointer;float:left;background-image:url(<%=basePath%>images/btn_bk.png);width:80px;text-align:center;height:25px;line-height:25px;overflow: hidden;position:relative;top:5px;border-color:#b6c6cd;border-style:solid; border-width:1px;margin-left:5px;padding:0px}
	</style>
	<script type="text/javascript">
	function SelectOrgan(){
		var treediv = document.getElementById("tree");
		treediv.style.display="block";
		treediv.style.pixelTop=event.clientY; 
		treediv.style.pixelLeft=event.clientX;
	    var tree = new Ext.tree.TreePanel({
	        el:'tree',
	        rootVisible:false,
	        autoScroll:true,
	        loader: new Ext.tree.TreeLoader({dataUrl:'organ/tree.action'}),
       		listeners:{"render":function(panel){
					panel.expandPath("/ROOT/-1");
				}
			},
			tbar:new Ext.Toolbar({buttons:[{text:"取消",handler:function(){hiddenTree();}},{text:"清空",handler:function(){
			    document.getElementById("organName").value="";
			    document.getElementById("organId").value="";
				hiddenTree();
	        }}]})
	    });	
	    var root = new Ext.tree.AsyncTreeNode({
	        text: '根节点',
	        id:'ROOT'
	    });
		tree.on("click",function(node){
		   document.getElementById("organName").value=node.text;
		   document.getElementById("organId").value=node.id;
		   hiddenTree();
		});
		tree.setRootNode(root);
		tree.render();
	}
	function hiddenTree(){
		document.getElementById("tree").style.display="none";
		document.getElementById("tree").innerHTML="";	
	}
	function Save(){
		var organ = document.getElementById("organId");
		if(organ.value==""){alert("请选择所属机构.");return;}
		var usrCode = document.getElementById("usrCode");
		if(usrCode.value==""){alert("用户编码不能为空.");return;}
		var usrLoginName = document.getElementById("usrLoginname");
		if(usrLoginName.value==""){alert("登陆名不能为空.");return;}
		var usrLoginPwd = document.getElementById("usrLoginpwd");
		if(usrLoginPwd.value==""){alert("密码不能为空.");return;}
		var usrName = document.getElementById("usrName");
		if(usrName.value==""){alert("姓名不能为空.");return;}
		var list=document.getElementById("selfRoleList");
		for(var i=0;i<list.options.length;i++){
			list.options[i].selected = true;
		}
		var jsonVar=$("#userForm").serialize();
		$.ajax({
			url:"<%=basePath%>user/add.action",
			type:"post",
			dataType:"json",
			data:jsonVar,
			success:function(data){
			  if(data.message=="YES"){
				 alert("新建用户成功！");			
				 location.href = "<%=basePath%>user/list.action?organId="+organ.value;	  
			  }else if(data.message=="NO"){
				 alert("新建用户失败！"); 
				 return;
			  }
			}
		})
	}
	function tabswitch(obj){
		var cls = obj.className;
		if(cls=="tab1"){
			var userTbl = document.getElementById("userInfo");
			var roleTbl = document.getElementById("roleInfo");
			userTbl.style.display = "";
			roleTbl.style.display = "none";
		}else{
			var userTbl = document.getElementById("userInfo");
			var roleTbl = document.getElementById("roleInfo");
			userTbl.style.display = "none";
			roleTbl.style.display = "";
		}
	}
	</script>
  </head>
  
  <body style="height:100%;">	
		<div id="navi">
	      <div class="name">新建用户</div>
	    </div>
			<table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
    			<tr style="width:100%;">
    			    <td align="left" style=" border-color:#b6c6cd; border-style:solid; border-width:1px 0px 0px 1px;padding-left:3px"bgcolor="#d5e9f9">
    				<div id="userTab" class="tab1" onclick="tabswitch(this)">基本信息</div><div id="roleTab" class="tab2" onclick="tabswitch(this)">分配角色</div>
    				</td>
   					<td align="right" style="height:34px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 0px;padding-left:3px"bgcolor="#d5e9f9">
    					<input type="button" class="button" value="保存" onClick="Save()">
    					<input type="button" class="button" value="取消" onClick="javascript:window.history.back(-1)">
    				</td>
    			</tr>
 			</table>
		<div style="border-style:solid; border-width:0px 1px 0px 0px;border-color:#b6c6cd">
		<form id="userForm" name="userForm" method="post">
		<table id="userInfo" width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#ffffff" class="tab011">
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">所属机构：</td>
			<td><input type="text" id="organName" readonly onclick="SelectOrgan()" class="selectInput">
			<input type="hidden" id="organId" name="user.sysOrgan.id">
			<span style="color:red;padding-left:5px">*</span>
			</td></tr>
			<tr class="oddline"><td height="30" align="right" style="width:8%;padding-right:10px" class="black">员工编号：</td>
			<td><input type="text" name="user.usrCode" id="usrCode" class="txt">
			<span style="color:red;padding-left:5px">*</span></td></tr>
			<tr class="oddline"><td height="30" align="right" style="width:8%;padding-right:10px" class="black">登录名称：</td>
			<td><input type="text" name="user.usrLoginname" id="usrLoginname" class="txt">
			<span style="color:red;padding-left:5px">*</span></td></tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">登录密码：</td>
			<td><input type="password" id="usrLoginpwd" name="user.usrLoginpwd" class="txt">
			<span style="color:red;padding-left:5px">*</span>
			</td></tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">姓 名：</td>
			<td><input type="text" name="user.usrName" id="usrName" class="txt">
			<span style="color:red;padding-left:5px">*</span></td>
			</tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">性 别：</td>
			<td>
			<select name="user.usrGender" style="height:25px;width:180px;border:1px solid #808080">
			<option value="1">男</option>
			<option value="0">女</option>
			</select>
			</td></tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">职 务：</td><td><input type="text" name="user.usrPosition" class="txt"></td></tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">电子邮件：</td><td><input type="text" name="user.usrEmail" class="txt"></td></tr>
			<tr class="oddline"><td height="30" align="right" style="padding-right:10px" class="black">用户状态：</td><td>
			<select name="user.usrState" style="height:25px;width:180px;border:1px solid #808080">
			<option value="1">启用</option>
			<option value="0">禁用</option>
			</select>
			</td></tr>
			<tr class="oddline">
			  <td height="30"  align="right" style="padding-right:10px" class="black">备 注：</td><td>
			     <textarea rows="5" cols="35" name="user.usrRemark" class="txt"></textarea>
			  </td>
			</tr>
		</table> 
		<table id="roleInfo" width="100%" border="0" style="background-color: #FFFFFF;padding:5px 0px 5px 0px;display:none">
			<tr>
			<td width="200px" height="400px">
			<select id="orginalList" multiple="multiple"  ondblclick="moveSelecteds('orginalList','selfRoleList',true)" style="width:100%;height:380px">
			<s:iterator value="roleList">
		  	 	<option value="${id}">${roleName}</option>
		    </s:iterator> 
			</select>
			</td>
			<td width="20px;" align="center" valign="middle" style="padding-left:8px">
			<input type="button" style="width:50px;height:24px"  class="button" value="&gt;&gt;" onClick="moveSelecteds('orginalList','selfRoleList',true)"><br><br><br>
			<input type="button" style="width:50px;height:24px" class="button" value="&lt;&lt;" onClick="moveSelecteds('selfRoleList','orginalList',true)">
			</td>
			<td height="400px">
			<select id="selfRoleList" name="selfRoleList" multiple="multiple" style="width:200px;height:380px;" ondblclick="moveSelecteds('selfRoleList','orginalList',true)"></select>
			</td>
			</tr>
		</table>
		</form>
		</div>		
		<div style="display:none;position:absolute; width: 200px; height: 300px;border:1px solid #bbcee6" id="tree"></div>
  </body>
</html>
