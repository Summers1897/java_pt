<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>">  
		<title>机构添加</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>include/style.css">
	<script type="text/javascript" src="<%=basePath%>jscript/jquery-1.4.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>jscript/extjs/css/ext-all.css">
	<script language="javascript" src="<%=basePath%>jscript/util.js"></script>
    <script language="javascript" type="text/javascript">
	 function add(){
		 var typeCode=document.getElementById("typeCode");
		var typeName=document.getElementById("typeName");
		if(typeCode.value==''){
			alert('类型代码不能为空');
			return;
		}else if(typeName.value==''){
			alert('类型名称不能为空');
			return;
		}
	  	var formData = $("form").serialize();
		$.ajax({
			type:'post',
			url:"<%=basePath%>mapType/edit.action",
			dataType:"json",
			data:formData,
			success:function(data){
				if(data.flag=='ok'){
					alert('修改成功');
					var form=document.getElementById("organForm");
					form.action="<%=basePath%>mapType/list.action";
					form.submit();
				}else{
					alert('修改失败,请重新修改');
					}
			
			}
		});
	 }
	</script>
</head>
<body style="height:100%;margin:0px;">
   <div id="navi">
    <div class="name">修改映射类型</div>
   </div>
 		 <table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
    			<tr style="width:100%;">
   					<td align="right" style="height:34px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 1px 1px;padding-left:3px"bgcolor="#d5e9f9">
    					<input type="button" class="button" value="保存" onClick="add()">
    					<input type="button" class="button" value="取消" onClick="javascript:window.history.back(-1)">
    				</td>
    			</tr>
 		</table>
    	<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#ffffff" align="left" class="tab011">   
			 <s:form method="post" name="organForm" id="organForm" >
			 <input type="hidden" name="maptype.isvalid" value="1"  >
			 <input type="hidden" name="maptype.id" value="${maptype.id}">
     		     <tr class="oddline"> 
			          <td height="30" width="8%" align="right" style="padding-right:10px" class="black">类型代码：</td>
				          <td class="backIetmTd1">
			                 <input class="txt" style="width:180px;" type="text" id="typeCode" name="maptype.typecode" value="${maptype.typecode}"    />
			                  <span style="color:red;padding-left:5px">*</span>
		          		</td>            
		        </tr>
		        <tr class="oddline">
			          <td height="30" align="right" style="padding-right:10px" class="black">类型名称：</td>
			          <td class="backIetmTd1"><input class="txt" style="width:180px;" type="text" id="typeName" name="maptype.typename"  value="${maptype.typename}"  />
			          <span style="color:red;padding-left:5px">*</span></td>
		        </tr>
		         <tr class="oddline">
			          <td height="30" align="right" style="padding-right:10px" class="black">备注：</td>
			          <td class="backIetmTd1"><textarea class="txt"      name="maptype.remark"   rows="5" cols="35" >${maptype.remark}</textarea> </td>
		        </tr>
		      </s:form>
		    </table>
		    <div id="tree" style="width: 200px; height: 400px; position: absolute; display: none;" ></div>
	</body>
</html>


