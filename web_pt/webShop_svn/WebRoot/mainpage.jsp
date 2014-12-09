<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>电价调整列表</title>
	<link rel="stylesheet" type="text/css" href="common/css/style.css">
	<script type="text/javascript" src="common/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="common/js/Main.js"></script>
	<script language="JavaScript" src="common/js/date/WdatePicker.js"  defer="defer"></script>
	<script language="JavaScript" src="common/js/util.js"  defer="defer"></script>
	<script type="text/javascript">
	function search(){
		var form=document.getElementById("organForm");
		form.action="<%=basePath%>goods/list.action";
		form.submit();
	}
	</script>
<script language="JavaScript" type="text/JavaScript">
  <s:property value="outPutStatndardJs()" escape="false"/>
</script>
  </head>
	<body style="height:100%;margin:0px;">
	<s:form id="organForm" name="organForm" method="post" cssStyle="height:100%;">
	  <div id="navi">
	    <div class="name">商品列表</div>
	  </div>
		<div style="border: 0px solid #87CDFF;float: left; width: 100%; overflow: hidden;" id="innerTop">
	      <table border="0" cellpadding="0" cellspacing="0" width="100%">
	        <tr>
	          <td align="left" style="height:30px; border-color:#b6c6cd; border-style:solid; border-width:1px 1px 0px 1px;padding:3px 0px 1px 3px" bgcolor="#d5e9f9"><div style="float:left">
               </div>
               <div style="text-align:right;padding-right:3px">
	商品名称： <input type="text" class="searchbox" id="goodsName" name="goodsName" value="${goodsName}"     >
	店铺名称： <input type="text" class="searchbox" id="shopName" name="shopName" value="${shopName}"   <s:if test="${!empty shopId}">readonly="readonly"</s:if>   >
	商品类型： <input type="text" class="searchbox" id="typeName" name="typeName" value="${typeName}"     >
               <input type="button" class="button"  onclick="search();"  value="查询"/></div>
			  </td>
	        </tr>
	      </table>
	  </div> 
	  <div style="border: 0px solid #87CDFF;float: left; width: 100%;height:80%;overflow-y: scroll;" id="innerButtom">
	  <table width="100%" border="0" cellpadding="0" cellspacing="1" class="tab01">
		<s:property value="outPutPageVariables()" escape="false" />	
		<tbody>
			<s:iterator value="page.lst" status="stat">
				<s:if test="${stat.index%4==0}">
					<tr class="line${stat.index%4}" align="center">
				</s:if>
					<td nowrap="nowrap">
						<div style="width: 80px;height: 60px;text-align: center">
							<div >
								<img alt="图片" src="common/image/update-pw.png"></img>
							</div>  
							<div >
								${goodsName }<br> ${shop.shopName} <br> ${goodsPrice }
							</div> 
						</div>  
					</td>
			</s:iterator>
			<s:property value="outPutStandardNavBar(8)" escape="false" />
		</tbody>
	</table> 
	</div>
	</s:form>
	</body>
</html>
