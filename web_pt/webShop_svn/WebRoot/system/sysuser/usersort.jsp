<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title></title>    
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/branch_main.css">
	<script type="text/javascript" src="<%=basePath%>jscript/Listbox.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.js"></script>
	<script type="text/javascript">
	function Save(){
		var userForm = document.getElementById("sysUser");	
		if(userForm["orginalList"].length!=0){
			alert("请将机构全部移至右边的框中！");
			return;
		}
		for(var i=0;i<userForm["organList"].length;i++){
			userForm["organList"].options[i].selected = true;
		}
		var jsonVar=$("#sysUser").serialize();
		$.ajax({
			url:"<%=basePath%>user/sortUser.action",
			type:"post",
			dataType:"json",
			data:jsonVar,
			success:function(data){
				alert("排序成功！");
				userForm.action="<%=basePath%>user/queryUserList.action";
				userForm.submit();
			},
			error:function(data){
				alert("排序失败！");
				return;
			}
		})
	}
	
	</script>

  </head>
  
  <body style="height: 100%;overflow: hidden;padding:0 0 0 0;border:0px;">
  	<div id="lanmt">
      <div class="name" >用户排序</div>
    </div>
	 <table style="width:100%;" border="0"  cellpadding="0" cellspacing="0" >
      	<tr style="width:100%;">
        	<td style="height:34px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 1px;padding-left:3px"bgcolor="#d5e9f9">
          	<input type="button" class="save"  onClick="Save()">
          	<input type="button" class="cancel"  onClick="javascript:window.history.back(-1)"></td>
     	</tr>
 	</table> 
      	<form action="/organ/updateIndexSort.action" method="post" name="sysUser" id="sysUser">
      	<input type="hidden" name="orgId" value="${orgId}">
		<table width="100%" border="0" cellpadding="0" cellspacing="1" style="margin-bottom:0px; background-color:#ffffff; border:1px solid #b6c6cd">
       	<tr class="oddline"><th colspan="2" align="left">原始用户:</th><th colspan="2" align="left">排序结果:</th></tr>
       	<tr class="oddline" height="75%">
       	<td width="20%" height="370px" valign="top" style="padding:3px">
       		<select id="orginalList" ondblclick="moveSelecteds('orginalList','organList')"  multiple="multiple" style="height:450;width:300">
          		<s:iterator value="userList" status="stat">
          			<option value="<s:property value="#stat.index" />_<s:property value="id" />"><s:property value="usrName" /></option>
          		</s:iterator>
      		</select> 
       	</td>
       	<td width="10%" valign="middle">
       		<input type="button" value=">>" id="btnUp" class="button" onClick="moveSelecteds('orginalList','organList')" style="width:65"/> <br><br>
			<input type="button" value="&lt;&lt;" id="btnDowm" class="button" onClick="moveSelecteds('organList','orginalList')" style="width:65" /> 
       	</td>
        <td nowrap width="30%" valign="middle">
          	<select id="organList" name="userList" ondblclick="moveSelecteds('organList','orginalList')"  multiple="multiple" style="height:450;width:300">
      		</select> 
        </td>
        <td width="40%" valign="middle">
         	<input type="button" value="上移" id="btnUp" class="button" onClick="moveUp(true,this.form.organList);" style="width:65"/> <br><br>
			<input type="button" value="下移" id="btnDowm" class="button" onClick="moveUp(false,this.form.organList);" style="width:65" /> 
        </td>
       </tr>
      </table>
      </form>
  </body>
</html>
