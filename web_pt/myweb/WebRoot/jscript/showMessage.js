function getMsg(){
		try{
			 
			divTop = parseInt(document.getElementById("eMeng").style.top,10)
			divLeft = parseInt(document.getElementById("eMeng").style.left,10)
			divHeight = parseInt(document.getElementById("eMeng").offsetHeight,10)
			divWidth = parseInt(document.getElementById("eMeng").offsetWidth,10)
			docWidth = document.body.clientWidth;
			docHeight = document.body.clientHeight;
			document.getElementById("eMeng").style.top = parseInt(document.body.scrollTop,10) +	docHeight + 10;// divHeight
			document.getElementById("eMeng").style.left = parseInt(document.body.scrollLeft,10) + docWidth - divWidth
			document.getElementById("eMeng").style.visibility="visible";
			div=document.getElementById("eMeng");
			div.style.top=697+"px";
			objTimer = window.setInterval("moveDiv()",1)
		}catch(e){}
	}
	function resizeDiv(){
		//i+=1
		//if(i>1300) closeDiv() //客户想不用自动消失由用户来自己关闭所以屏蔽这句
		try{
			divHeight = parseInt(document.getElementById("eMeng").offsetHeight,10)
			divWidth = parseInt(document.getElementById("eMeng").offsetWidth,10)
			docWidth = document.body.clientWidth;
			docHeight = document.body.clientHeight;
			document.getElementById("eMeng").style.top = docHeight - divHeight + parseInt
			(document.body.scrollTop,10)
			document.getElementById("eMeng").style.left = docWidth - divWidth + parseInt
			(document.body.scrollLeft,10)
		}catch(e){}
	}var div;
	function moveDiv(){
		try{
			var di=div;
			if((parseInt(document.getElementById("eMeng").style.top,10)) <= (docHeight - divHeight +parseInt(document.body.scrollTop,10))){
				window.clearInterval(objTimer)
				objTimer = window.setInterval("resizeDiv()",1)
			}
			divTop = parseInt(document.getElementById("eMeng").style.top,10)
			document.getElementById("eMeng").style.top = divTop - 1;
		}catch(e){}
	}
	function disDiv(){
		document.getElementById("eMeng").style.top=docHeight+parseInt(document.body.scrollTop,10);
		//document.getElementById("eMeng").style.height="12px";
		document.getElementById('eMeng').style.visibility='hidden';
	}
	function appDiv(){
		document.getElementById("eMeng").style.height="255px";
		document.getElementById("eMeng").style.top=docHeight-divHeight+parseInt(document.body.scrollTop,10);
	}

	function closeDiv(){
		document.getElementById('eMeng').innerHTML='';
		document.getElementById('eMeng').style.visibility='hidden';
		document.getElementById('eMeng').style.height="12px";
		if(objTimer) window.clearInterval(objTimer)
	}