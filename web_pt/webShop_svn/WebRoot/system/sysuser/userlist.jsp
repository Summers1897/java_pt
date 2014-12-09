<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>用户列表</title>    
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/query-1.4.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/Main.js"></script>
	<script type="text/javascript">
		function addUser(){
			usrForm.action="user/addpage.action";
			usrForm.submit();
		}
		function editUser(){
			var form = document.usrForm;
		 	var id = document.getElementsByName("userId");
				var cnt = 0;
				for(var i=0;i<id.length;i++){
					if(id[i].checked){cnt++;}			
				}
			if(cnt==0||cnt>1){alert("请选择一项进行编辑!");return}
			form.action="user/editpage.action";
			form.submit();
		}
		function delUser(){
			var form = document.usrForm;
			var id = document.getElementsByName("userId");
			var cnt = 0;
			for(var i=0;i<id.length;i++){
			  if(id[i].checked){cnt++;}
			}
			if(cnt<1){alert("请选择要删除的用户!"); return;}
			if(confirm("你确认要删除选择的用户么?")){
				form.action="user/delete.action";
				form.submit();
			}
		}
		function search(){
			usrForm.action="user/list.action";
			usrForm.submit();
		}
	</script>
	<script language="JavaScript" type="text/JavaScript">
  		<s:property value="outPutStatndardJs()" escape="false"/>
	</script>
  </head>
	<body style="height:100%;" >
		<form id="usrForm" name="usrForm" method="post">
		<input type="hidden" name="organId" id="organId" value="${organId}"/>
		<div id="navi">
	      <div class="name" >用户管理</div>
	    </div>
		<div style="border: 0px solid #87CDFF;float: left; width: 100%; overflow: hidden;" id="innerTop">
			      <table border="0" cellpadding="0" cellspacing="0" width="100%">
			        <tr>
			          <td align="left" style="height:30px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 1px;padding:3px 0px 1px 3px"bgcolor="#d5e9f9"><div style="float:left">
			           <input type="button" class="button" onclick="addUser()" value="新建"/>
						<input type="button" class="button" onclick="editUser()" value="编辑"/>
						<input type="button" class="button" onclick="delUser()" value="删除"/>
		               </div>
		               <div style="text-align:right;padding-right:3px">
		               	用户名称：<input type="text" name="keyName" value="${keyName}" class="txt" style="width:120px">
			          	<input type="button" class="button" onclick="search()" value="查询"/></div>
					  </td>
			        </tr>
			      </table>
	  		</div> 
			<table width="100%" border="0" cellpadding="0" cellspacing="1" class="tab01">
			<s:property value="outPutPageVariables()" escape="false" />	
		    <thead>
				<tr>
					<th width="5%"><input type="checkbox" onClick="selectAll(this,'userId')"></th>
					<th width="10%">姓名</th>
					<th width="8%">性别</th>
					<th width="12%">登录名</th>
					<th width="13%">电子邮件</th>
					<th width="15%">职务</th>
					<th width="7%">状态</th>
					<th width="30%">备注</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="page.lst" status="stat">
					<tr class="line${stat.index%2}" align="center">
						<td align="center">
							<input type="checkbox" name="userId" value="<s:property value='id'/>">
						</td>							    
						<td nowrap="nowrap">${usrName}</td>
						<td >
						<s:if test="usrGender==0">女</s:if>
						<s:else>男</s:else>
						</td>
						<td>${usrLoginname}</td>
						<td>${usrEmail}</td>
						<td>${usrPosition}</td>
						<td><s:if test="usrState==0">停用</s:if><s:else>启用</s:else></td>
						<td>${usrRemark}</td>
					</tr>
				</s:iterator>
				<s:property value="outPutStandardNavBar(8)" escape="false" />
			</tbody>
			</table> 
		</form>
	</body>
</html>
