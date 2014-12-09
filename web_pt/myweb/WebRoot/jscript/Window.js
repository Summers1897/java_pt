  function isNumber(oNum){
	  	if(oNum=="") return true;
	  	if(!oNum) return false;
	 	var strP=/^\d+(\.\d+)?$/;
	 	if(!strP.test(oNum)) return false;
	  	try{ if(parseFloat(oNum)!=oNum) return false;
	  	}catch(ex){return false;}
      return true;
   }
/** 打开模式对话框   @author tanxm*/
var openedWindow = null;
var url = "";
var width = 0;
var height = 0;
var top = 0;
var left = 0;
var windowStyle = "";
var yellowRow=-1;
function $openModalWindow(url, width, height, top, left) {
  this.url = url;
  this.width = width || 800;
  this.height = height || 600;
  this.top = top || (screen.height - this.height) / 2;
  this.left = left || (screen.width - this.width) / 2;

  windowStyle = "dialogWidth:"+this.width+"px; dialogHeight:"+this.height+"px; center: yes; help: no; resizable: no; status: no; edge: sunken;scroll:no";
  return window.showModalDialog(this.url, null, windowStyle);
}
