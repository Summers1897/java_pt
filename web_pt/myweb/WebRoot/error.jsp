<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'error.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
function go_go(){
	var MaxNo=document.getElementById('page.maxNo');
	var pageCurrent=document.getElementById('pageCurrent');
	MaxNo.value=pageCurrent.value;
	document.forms[0].submit();
}
function go_page(mn){
	var pageCurrent=document.getElementById('pageCurrent');
	var totalPage=document.getElementById('page.totalPage');
	if(mn==1){
		pageCurrent.value=1;
	}else if(mn==2){
		pageCurrent.value-=1;
	}else if(mn==3){
		pageCurrent.value+=1;
	}else if(mn==4){
		pageCurrent.value=totalPage.value;
	} 
}

</script>
	<script type="text/javascript">
	function analysis(){
		var JSON =[
		    {"id":'1',"pid":'0','type':1,'name':'会议年度计划提交','count':1,'user':'戴力壮','receivetime':'2012-12-11 12:12:22','sendtime':'2012-12-11 12:12:22'},
		    {"id":'2',"pid":'1','type':3,'name':'处长1审核','count':2,'user':'许云飞','receivetime':'2012-12-11 12:12:22','sendtime':'2012-12-11 12:12:22'},
		    {"id":'3',"pid":'1','type':3,'name':'处长2审核','count':2,'user':'高波','receivetime':'2012-12-11 12:12:22'},
		    {"id":'4',"pid":'2','type':2,'name':'处室1拟定','count':3,'user':'处室11','receivetime':'2012-12-11 12:12:22'},
		    {"id":'5',"pid":'2','type':2,'name':'处室2拟定','count':3,'user':'处室22','receivetime':'2012-12-11 12:12:22'},
		    {"id":'6',"pid":'2','type':2,'name':'处室3拟定','count':3,'user':'处室33','receivetime':'2012-12-11 12:12:22'},
		    {"id":'9',"pid":'4,5,6','type':0,'name':'处长1审核','count':1,'user':'许云飞','receivetime':'2012-12-11 12:12:22'},
		    {"id":'11',"pid":'9,3','type':0,'name':'文书汇总','count':1,'user':'尹小妹','receivetime':'2012-12-11 12:12:22'},
		    {"id":'12',"pid":'11','type':0,'name':'领导1会签','count':4,'user':'领导11','receivetime':'2012-12-11 12:12:22'},
		    {"id":'13',"pid":'11','type':0,'name':'领导2会签','count':4,'user':'领导22','receivetime':'2012-12-11 12:12:22'},
			{"id":'14',"pid":'11','type':0,'name':'领导3会签','count':4,'user':'领导33','receivetime':'2012-12-11 12:12:22'},
		    {"id":'15',"pid":'11','type':0,'name':'领导4会签','count':4,'user':'领导44','receivetime':'2012-12-11 12:12:22'},
			{"id":'16',"pid":'12,13,14,15','type':0,'name':'结束','count':1}
		];
		dealWithArray(JSON);
		JSON[0].rowspan=lcm;
		var lcm=getSerialLCM(JSON[0],JSON);
		var list=new Array();
		for(var i=0;i<JSON.length;i++){
			list.push(i);
		}
		calculateRowspan(JSON,list);
		for(var j=0;j<JSON.length;j++){
			alert(JSON[j].rowspan);
		}
	}
	
	function calculateRowspan(objs,list){
		for(var i=0;i<list.length;i++){
			if(objs[list[i]].rowspan){
				list.remove(i);
				if(objs[i].children.length!=0){
					var h=objs[i].rowspan/objs[i].children.length;
					for(var j=0;j<objs[i].children.length;j++){
						if(objs[objs[i].children[j]].parent.length==1){
							if(!objs[objs[i].children[j]].rowspan){
								objs[objs[i].children[j]].rowspan=h;
							}
						}
					}
				}
			}else{
				var par=objs[list[i]].parent;
				if(par.length>1){
					var t=0;
					var j=0;
					for(;j<par.length;j++){
						if(objs[par[j]].rowspan){
							t+=objs[par[j]].rowspan;
						}else{
							break;
						}
					}
					if(j==par.length){
						objs[list[i]].rowspan=t;
						list.remove(i);
					}
				}
			}
		}
		if(list.length>0){
			calculateRowspan(objs,list);
		}
	}
	function dealWithArray(objs){
		for(var i=0;i<objs.length;i++){
			if(!objs[i].children)objs[i].children=new Array();
			if(!objs[i].parent)objs[i].parent=new Array();
			for(var j=i+1;j<objs.length;j++){
				if(!objs[j].children)objs[j].children=new Array();
				if(!objs[j].parent)objs[j].parent=new Array();
				if((","+objs[j].pid+",").indexOf(","+objs[i].id+",")!=-1){
					objs[i].children.push(j);
					objs[j].parent.push(i);
				}
				if((","+objs[i].pid+",").indexOf(","+objs[j].id+",")!=-1){
					objs[j].children.push(i);
					objs[i].parent.push(j);
				}
			}
		}
	}
	function getSerialLCM(startNode,objs){///获取串行的最小公倍数
		var numbers=new Array();
		numbers.push(1);
		if(startNode.children.length>1){
			numbers.push(getParallelLCM(startNode,objs));
			var node=getFirstNodeAfterParallel(startNode,objs);
			if(node!=null)numbers.push(getSerialLCM(node,objs));
		}else if(startNode.children.length==1){
			if(objs[startNode.children[0]].parent.length>1||objs[startNode.children[0]].children.length==0){//串行结束
				
			}else{
				numbers.push(getSerialLCM(objs[startNode.children[0]],objs));
			}
		}
		return calculateLCM(numbers);
	}
	function getFirstNodeAfterParallel(startNode,objs){
		for(var i=0;i<objs.length;i++){
			if(objs[i].parent.length>1){
				for(var j=0;j<startNode.children.length;j++){
					var b=isReachability(objs[startNode.children[j]],objs[i],objs);
					if(!b){
						break;
					}
				}
				if(j==startNode.children.length){
					return objs[i];
				}
			}
		}
		return null;
	}
	function isReachability(fromNode,toNode,objs){
		if(fromNode.id==toNode.id){
			return true;
		}
		if(fromNode.children.length==1){
			return isReachability(objs[fromNode.children[0]],toNode,objs);
		}else if(fromNode.children.length>1){
			for(var i=0;i<fromNode.children.length;i++){
				var b=isReachability(objs[fromNode.children[i]],toNode,objs);
				if(b){
					return true;
				}
			}
		}
	}
	function getParallelLCM(pNode,objs){///获取并行的最小公倍数
		var numbers=new Array();
		for(var i=0;i<pNode.children.length;i++){
			numbers.push(getSerialLCM(objs[pNode.children[i]],objs));
		}
		return pNode.children.length*calculateLCM(numbers);
	}
	function calculateLCM(numbers){//就算出最小公倍数
		var i=numbers[0];
		for(;;i++){
			var j=0;
			for(;j<numbers.length;j++){
				if(i%numbers[j]!=0){
					break;
				}
			}
			if(j==numbers.length){
				break;
			}
		}
		return i;
	}
	</script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body onload="analysis()">
  <!--<label id="" class=""> 1/23 </label>
					<input type="text" value="1" />
					<input type="button" onclick="go_go(0)" class="button" value="转" />
					<input type="button" onclick="go_page(1)" class="button" value="首页" />
					<input type="button" onclick="go_page(2)" class="button" value="上页" />
					<input type="button"  onclick="go_page(3)"class="button" value="下页" />
					<input type="button"  onclick="go_page(4)"class="button" value="末页" />
					<input type="hidden" id="" name=""   value="末页" />
					
					-->
					
					
					
					
					
					
					
					
					<input name='page.maxNo'  id='page.maxNo' type='hidden' value="1"/>
					<input name='page.currentPage' value="0" id='page.currentPage' type='hidden' />
					<input name='page.totalPage' value="0" id='page.totalPage' type='hidden' />


					<input id='pageindex' type='button' class='cssclass' onclick='(1)'
						value='首页' />
					<label >
						1/23
					</label>
					<input type="text" id="pageCurrent" value="1" />
					<input type="button" onclick="go_go()" class="button" value="转" />
					<input type="button" onclick="go_page(1)" class="button" value="首页" />
					<input type="button" onclick="go_page(2)" class="button" value="上页" />
					<input type="button" onclick="go_page(3)" class="button" value="下页" />
					<input type="button" onclick="go_page(4)" class="button" value="末页" />
    系统异常<br>
  </body>
</html>
