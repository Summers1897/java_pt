<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>电价调整列表</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>jscript/Main.js"></script>
	<script language="JavaScript" src="<%=basePath%>jscript/date/WdatePicker.js"  defer="defer"></script>
	<script language="JavaScript" src="<%=basePath%>jscript/util.js"  defer="defer"></script>
	<script type="text/javascript">
	function search(){
		var form=document.getElementById("organForm");
		form.action="<%=basePath%>mapType/list.action";
		form.submit();
	}
	function add(){
		var form=document.getElementById("organForm");
		form.action="<%=basePath%>mapType/addPage.action";
		form.submit();
	}
	function edit(){
		var num=getCheckBoxCheckedNum("ids");
		if(num!=1){alert('请选择一项进行编辑!');return;}
			var form=document.getElementById("organForm");
			form.action="<%=basePath%>mapType/editPage.action";
			form.submit();
	}
	//删除
	function del(){
		var num=getCheckBoxCheckedNum("ids");
		if(num==0){alert('请至少选择一项进行删除');return;} 
			var form=document.getElementById("organForm");
			 	var formData = $("form").serialize();
				$.ajax({
					type:'post',
					url:"<%=basePath%>mapType/delete.action",
					dataType:"json",
					data:formData,
					success:function(data){
						if(data.flag=='ok'){
							alert('删除成功');
							var form=document.getElementById("organForm");
							form.action="<%=basePath%>mapType/list.action";
							form.submit();
						}else{
							alert('删除失败,请刷新后删除');
							}
					}
				});
		}
	 
	</script>
<script language="JavaScript" type="text/JavaScript">
  <s:property value="outPutStatndardJs()" escape="false"/>
</script>
  </head>
	<body style="height:100%;margin:0px;">
	<s:form id="organForm" name="organForm" method="post" cssStyle="height:100%;">
	  <div id="navi">
	    <div class="name">映射类型管理</div>
	  </div>
		<div style="border: 0px solid #87CDFF;float: left; width: 100%; overflow: hidden;" id="innerTop">
	      <table border="0" cellpadding="0" cellspacing="0" width="100%">
	        <tr>
	          <td align="left" style="height:30px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 1px;padding:3px 0px 1px 3px" bgcolor="#d5e9f9"><div style="float:left">
	           <input type="button" class="button" onclick="add();"  value="新建"/>
	           <input type="button" class="button" onclick="edit();"  value="编辑"/>
	           <input type="button" class="button" onclick="del();"  value="删除"/>
               </div>
               <div style="text-align:right;padding-right:3px">
	类型名称： <input type="text" class="searchbox" id="searchKey" name="searchKey" value="${searchKey}"     >
               <input type="button" class="button"  onclick="search();"  value="查询"/></div>
			  </td>
	        </tr>
	      </table>
	  </div> 
	  <div style="border: 0px solid #87CDFF;float: left; width: 100%;height:80%;overflow-y: scroll;" id="innerButtom">
	  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="tab01">
		<s:property value="outPutPageVariables()" escape="false" />	
	    <thead>
			<tr  >
				<th width="2%"  style="text-align: center;"><input id="allcheck" type="checkbox" onClick="selectAllDisabled(this.id,'ids')"></th>
				<th width="3%"  style="text-align: center;" >序号</th>
				<th width="10%" style="text-align: center;" >类型代码</th>
				<th width="10%" style="text-align: center;" >类型名称</th>
				<th width="5%" style="text-align: center;">类型状态</th>
				<th width="20%" style="text-align: center;" >备注</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="page.lst" status="stat">
				<tr class="line${stat.index%2}" align="center">
					<td align="center">
						<input type="checkbox" name="ids"   value="${id}">
					</td>							    
					<td nowrap="nowrap">${stat.index+1}</td>
					<td nowrap="nowrap">${typecode}</td>
					<td nowrap="nowrap">${typename}</td>
					<td nowrap="nowrap"><s:if test="${isvalid==1}">是</s:if><s:else>否</s:else>   </td>
					<td nowrap="nowrap" class="remark" >     <s:property  value="@com.k.market.util.Utils@interceptStringContent(remark,20)"/></td>
					
				</tr>
			</s:iterator>
			<s:property value="outPutStandardNavBar(8)" escape="false" />
		</tbody>
	</table> 
	</div>
	</s:form>
	</body>
</html>
