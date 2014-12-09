var x0 = 0, y0 = 0, x1 = 0, y1 = 0;
var offx = 6, offy = 6;
var moveable = false;
var hover = 'orange', normal = '#4ab4de';//color;
var index = 20000;//z-index;
var xx;
//显示/隐藏;
function ShowHide() {
	if (xx != null)
		if (xx.style.visibility == "hidden")
			xx.style.visibility = "visible";
		else if (xx.style.visibility == "visible")
			xx.style.visibility = "hidden";
}
function hidden() {
	if (xx != null)
		xx.style.visibility = "hidden";
}
function show() {
	if (xx != null)
		xx.style.visibility = "visible";
}
//创建一个对象;
function xWin(id, w, h, l, t, tit, msg, fileid, filename) {
	index = index + 2;
	this.id = id;
	this.width = w;
	this.height = h;
	this.left = l;
	this.top = t;
	this.zIndex = index;
	this.title = tit;
	this.message = msg;
	this.obj = null;
	this.fileid = fileid;
	this.filename = filename;
	this.bulid = bulid;
	this.bulid();
	xx = document.getElementById('allx');
	xx.style.visibility = "visible";

}
//初始化;
function bulid() {
	var str = "" + "<div id='allx'><div id='xMsg'"
			+ this.id
			+ " "
			+ "style='"
			+ "z-index:"
			+ this.zIndex
			+ ";"
			+ "width:"
			+ this.width
			+ ";"
			+ "height:"
			+ this.height
			+ ";"
			+ "left:"
			+ this.left
			+ ";"
			+ "top:"
			+ this.top
			+ ";"
			+ "background-color:"
			+ normal
			+ ";"
			+ "font-size:11px;"
			+ "font-family:Verdana;"
			+ "position:absolute;"
			+ "cursor:default;"
			+ "border:2px solid "
			+ normal
			+ ";"
			+ "' "
			+ "onmousedown='getFocus(this)'>"
			+ "<div "
			+ "style='"
			+ "background-color:"
			+ normal
			+ ";"
			+ "width:"
			+ (this.width - 2 * 2)
			+ ";"
			+ "height:20;"
			+ "color:white;"
			+ "' "
			+ "onmousedown='startDrag(this)' "
			+ "onmouseup='stopDrag(this)' "
			+ "onmousemove='drag(this)' "
			+ "ondblclick='min(this.childNodes[1])'"
			+ ">"
			+ "<span style='width:"
			+ (this.width - 2 * 14 - 10)
			+ ";padding-left:3px;text-align:left;'>"
			+ this.title
			+ "</span>"
			+ "<span style='width:14;border-width:0px;color:white;cursor:hand;font-family:webdings;' onclick='min(this)'>0</span>"
			+ "<span style='width:14;border-width:0px;color:white;cursor:hand;font-family:webdings;' onclick='cls(this)'>r</span>"
			+ "</div>" + "<div style='" + "width:100%;" + "height:"
			+ (this.height - 24) + ";" + "background-color:white;"
			+ "line-height:14px;" + "word-break:break-all;"
			+ "filter:alpha(opacity=100);" + "padding:3px;" + "'>"
			+ this.message;
	if (this.fileid != "null" && this.fileid != "" && this.fileid
			&& this.filename && this.filename != "null" && this.filename != "") {
		str += "<a href='javascript:showFileDetial(" + this.fileid + ")'>"
				+ this.filename + "</a>";
	}
	str += "</div>" + "</div>" + "<div id='xshadow' style='" + "width:"
			+ this.width + ";" + "height:" + this.height + ";" + "top:"
			+ this.top + ";" + "left:" + this.left + ";" + "z-index:"
			+ (this.zIndex - 1) + ";" + "position:absolute;"
			+ "background-color:black;" + "filter:alpha(opacity=100);"
			+ "'>by wildwind</div></div>";
	document.getElementById('msgbox').innerHTML = str;
}
function initialize(tagI,title,context,fileid,filename,width,hight,left,clientX1,clientY1){
     var x=0;
     var y=0;
     var ev=event;
     if(event){
    	 if(event.clientX==0&&clientX1){
    		 x=clientX1;
    	 }else{
	         x=event.clientX+5;
    	 }
	     if(left){
	         x-=left;
	     }
	     if(event.clientY==0&&clientY1){
    		  y=clientY1;
    	 }else{
    		 y=event.clientY;
    	 }
     }
	 if(tagI){
     	tagI.style.cursor='hand';
	 }
     var regx=new RegExp("\r","g"); 

    a = new xWin("1",width,hight,x,y,title,context,fileid,filename);
    showDiv();
}
//开始拖动;
function startDrag(obj)
{
        if(event.button==1)
        {
                //锁定标题栏;
                obj.setCapture();
                //定义对象;
                var win = obj.parentNode;
                var sha = win.nextSibling;
                //记录鼠标和层位置;
                x0 = event.clientX;
                y0 = event.clientY;
                x1 = parseInt(win.style.left);
                y1 = parseInt(win.style.top);
                //记录颜色;
                normal = obj.style.backgroundColor;
                //改变风格;
                obj.style.backgroundColor = hover;
                win.style.borderColor = hover;
                obj.nextSibling.style.color = hover;
                sha.style.left = x1 + offx;
                sha.style.top  = y1 + offy;
                moveable = true;
        }
}
//拖动;
function drag(obj)
{
        if(moveable)
        {
                var win = obj.parentNode;
                var sha = win.nextSibling;
                win.style.left = x1 + event.clientX - x0;
                                sha.style.left = parseInt(win.style.left) + offx;
                                //if ((y1 + event.clientY - y0)>0 && (y1 + event.clientY - y0)<600){
                win.style.top  = y1 + event.clientY - y0;
                sha.style.top  = parseInt(win.style.top) + offy;
                sha.style.zIndex=9999;
                //}
        }
}

//停止拖动;
function stopDrag(obj)
{
        if(moveable)
        {
                var win = obj.parentNode;
                var sha = win.nextSibling;
                var msg = obj.nextSibling;
                win.style.borderColor     = normal;
                obj.style.backgroundColor = normal;
                msg.style.color           = 'black';
                if(obj.parentNode.style.left<'0px'){
                	obj.parentNode.style.left='0px';
                    }
                if(obj.parentNode.style.top<'0px'){
                	obj.parentNode.style.top='0px';
                    }
                sha.style.left = obj.parentNode.style.left;
                sha.style.top  = obj.parentNode.style.top;
                obj.releaseCapture();
                moveable = false;
        }
}
function getFocus(obj)
{
        if(obj.style.zIndex!=index)
        {
                index = index + 2;
                var idx = index;
                obj.style.zIndex=idx;
                obj.nextSibling.style.zIndex=idx-1;
        }
}
function cls(obj)
{
        var win = obj.parentNode.parentNode.parentNode;
        //var sha = win.nextSibling;
        win.style.visibility = "hidden";
        //sha.style.visibility = "hidden";
}
function hiddenDiv(){
	var obj=document.getElementById("msgbox");
	if(obj){
		obj.style.display="none";
	}
}
function showDiv(){
	var obj=document.getElementById("msgbox");
	if(obj){
		obj.style.display="block";
	}
}
