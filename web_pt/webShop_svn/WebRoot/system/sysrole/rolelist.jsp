<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>角色列表</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/Main.js"></script>
	<script type="text/javascript">
	function addRole(){
		roleForm.action="role/addpage.action";
		roleForm.submit();
	}
	function editRole(){
		var form = document.roleForm;
	 	var id = document.getElementsByName("roleId");
			var cnt = 0;
			for(var i=0;i<id.length;i++){
				if(id[i].checked){cnt++;}			
			}
		if(cnt==0||cnt>1){alert("请选择一项进行编辑!");return}
		form.action="role/editpage.action";
		form.submit();
	}
	function delRole(){
		var id = document.getElementsByName("roleId");
			var cnt = 0;
			for ( var i = 0; i < id.length; i++) {
				if (id[i].checked) {
					cnt++;
				}
			}
			if (cnt < 1) {
				alert("请选择要删除的角色!");
				return;
			}else if (cnt >= 1) {
				if (confirm("你确认要删除选中的角色么?")) {
					roleForm.action="role/delete.action";
					roleForm.submit();
				}
			}
		
		
	}
	function search(){
		roleForm.action="role/list.action";
		roleForm.submit();
	}
	
	</script>
	<script language="JavaScript" type="text/JavaScript">
  		<s:property value="outPutStatndardJs()" escape="false"/>
	</script>
  </head>
	<body style="height:100%; margin:0px;">
		<form id="roleForm" name="roleForm" method="post">
			<div id="navi">
	      <div class="name">角色管理</div>
	    </div>
			<div style="border: 0px solid #87CDFF;float: left; width: 100%; overflow: hidden;" id="innerTop">	
				<table border="0" cellpadding="0" cellspacing="0" width="100%">
					<tr>
						<td align="left" style="height:30px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 1px;padding:3px 0px 1px 3px"bgcolor="#d5e9f9">
							<div style="float:left">
								<input type="button" class="button" onclick="addRole()" value="新建"/>
								<input type="button" class="button" onclick="editRole()" value="编辑"/>
								<input type="button" class="button" onclick="delRole()" value="删除"/>
							</div>
							<div style="text-align:right;padding-right:3px">
								角色名称：<input type="text" name="keyName" value="${keyName}" class="txt" style="width:120px">
          						<input type="button" class="button" onclick="search()" value="查询"/>
          	  </div>
						</td>
					</tr>
				</table>
			</div>
			<table width="100%" border="0" cellpadding="0" cellspacing="1" class="tab01">
				<s:property value="outPutPageVariables()" escape="false" />	
			    <thead>
					<tr>
						<th width="5%"><input type="checkbox" id='checkAll' onclick="selectAll(this,'roleId')"></th>
						<th width="10%">角色名称</th>
						<th width="10%">角色编码</th>
						<th width="8%">角色类型</th>
						<th>备注</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="page.lst" status="stat">
						<tr class="line${stat.index%2}" align="center">
							<td align="center">
								<input type="checkbox" id="roleId" name="roleId" value="${id}">
							</td>							    
							<td nowrap="nowrap">${roleName}</td>
							<td nowrap="nowrap">${roleCode}</td>
							<td nowrap="nowrap">
								<s:if test="roleType==1">应用</s:if><s:else>业务</s:else>
							</td>
							<td align="left">${roleRemark}</td>
						</tr>
					</s:iterator>
					<s:property value="outPutStandardNavBar(5)" escape="false" />
				</tbody>
			</table> 
		</form>
	</body>
</html>
