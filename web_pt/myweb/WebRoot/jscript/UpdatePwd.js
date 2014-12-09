var requestPath;//请求服务路径

function updatePwd(name,url){
  //初始化变量参数
  requestPath = url;
  var bgDiv = document.createElement("div");
  bgDiv.id = "bgDiv";
  bgDiv.className = "UpdatePwdDiv";
  bgDiv.innerHTML = "<iframe  frameborder=0 src='javascript:false' style='position:absolute; visibility:inherit; top:0px; left:0px; width:100%; height:100%; z-index:-1; filter='progid:DXImageTransform.Microsoft.Alpha(style=0,opacity=0)'></iframe>"+
  "<table style='width:100%;height:100%;margin:0px;padding:0px;border:2px solid #92bbdd;background-color:#d3e8f9' id='tab'>" +
     "<tr>" +
     	"<td align='center'>"+
  			"<table width='100%' height='100%' style='border:0px;'>"+ 
  				"<tr>" +
  					"<td style='padding-left:20px;font-size:13px;text-align:left;' height='20' width='60'>用户名:</td>" +
  					"<td><input type='text' id='userName' size='18' class='txt' style='width:150px;height:18px;' value='"+name+"' disabled></td>" +
  					"<td rowspan='4'><img src=\""+url+"/images/update-pw.png\"></td>"+
  				"</tr>"+ 
  				"<tr>" +
  					"<td style='padding-left:20px;font-size:13px;text-align:left;' height='20' width='60'>新密码:</td>"+ 
  					"<td><input type='password' id='newPwd' size='18' class='txt' style='width:150px;height:18px;'></td>" +
  				"</tr>" + 
  				"<tr>" +
  					"<td style='padding-left:20px;font-size:13px;text-align:left;' height='20' width='60'>重新输入:</td>"+ 
  					"<td><input type='password' id='againPwd' size='18' class='txt' style='width:150px;height:18px;'></td>" +
  				"</tr>"+ 
  				"<tr>" +
  					"<td></td>" +
  					"<td align='left' style='padding-left:4px'>" +
	  					"<input type='button' onclick='subForm()' class='button' value='确认' style='width:72px;cursor: hand;padding:5px 15px 5px;'>"+ 
	  					"<input type='button' onclick='document.body.removeChild(bgDiv);' class='button' value='取消' style='width:72px;cursor: hand;padding:5px 15px 5px;margin-left:4px;'>" +
  					"</td>" +
  				"</tr>"+ 
  				"<tr align='center'>" +
  					"<td colspan='3' style='padding-top:10px;color:#ff0000;font-size:13px'>"+ 
  						"信息提示：<span id='info' style='color:#009900;padding-left:5px;'>请输入新密码修改个人信息.</span>" +
  					"</td>" +
  				"</tr>" +
  			"</table>" +
  	    "</td>"+
  	"</tr>"
  "</table>"
  document.body.appendChild(bgDiv);
  document.getElementById("newPwd").focus();
}

function subForm(){
	var newPwd = document.getElementById("newPwd").value;
	var againPwd = document.getElementById("againPwd").value;
	if(newPwd == "" || againPwd == ""){
		document.getElementById("info").innerText = "新密码输入不能为空!";
		return false;
	}else{
	  document.getElementById("info").innerText="";
	}
	if(newPwd != againPwd){
		document.getElementById("info").innerText = "两次输入密码不同!";
		return false;
	}else{
	   document.getElementById("info").innerText="";
	}
	
	ajaxService();
}

function ajaxService(){	
	$.ajax(
	{
			url:requestPath+"user/updatepwd.action",
			type:"post",
			data:{"user.usrLoginpwd":document.getElementById("newPwd").value},
			dataType:"json",
			success:function(data){
				document.getElementById("info").innerText=data.message;
			}
	});
}
