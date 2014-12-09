/**显示隐藏左侧导航栏*/
function treeView(LeftFrame, showhidebtn, RightFrame) {
	var left = eval("document.all('" + LeftFrame + "')");
	var show = eval("document.all('" + showhidebtn + "')");
	var right = eval("document.all('" + RightFrame + "')");
	var path=show.src.substr(0,show.src.length-12);
	switch (left.style.display) {
	case "block":
		left.style.display = "none";
		show.src = path+"treeShow.gif"
		right.style.paddingLeft = "0px";
		break;
	case "none":
		left.style.display = "block";
		show.src = path+"treeHide.gif"
		right.style.paddingLeft = "0px";
		break;
	}
}
//变色table加onclick="clickIt(this)"
var yellowRow=-1;
/*
 * table的行样式效果，鼠标移动上去后出现背景色，移走后取消，点击后显示特别颜色，其实id为exceptLine的行除外
 * */
function clickIt(obj) {
	var the_obj = event.srcElement;
	if (the_obj && the_obj.tagName.toLowerCase() == "td") {
		the_obj = the_obj.parentElement;
		if(the_obj.id=="exceptLine"||the_obj.className=="exceptLine"){
			return;
		}
		if (yellowRow != -1) {
			obj.rows.item(yellowRow).style.backgroundColor = '';
		}
		yellowRow = the_obj.rowIndex;
		the_obj.oBgc = the_obj.currentStyle.backgroundColor;
		the_obj.oFc = the_obj.currentStyle.color;
		the_obj.style.backgroundColor = '#FBEC88';
	}
}
/** 全选、取消全选*/
function selectAll(obj,tagName) {
	var status = obj.checked;
	var checkboxs = document.getElementsByName(tagName);
	for ( var i = 0; i < checkboxs.length; i++) {
		checkboxs[i].checked = status;
	}
}
