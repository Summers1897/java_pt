
/**
 * @param objNam
 * @returns {Number}
 */
function getCheckBoxCheckedNum(objNam) {
	var obj = document.getElementsByName(objNam);
	if (obj == null) {
		return 0;
	}
	var objLen = obj.length;
	var objYN = 0;
	var i;
	for (i = 0; i < objLen; i++) {
		if (obj[i].checked == true) {
			objYN = objYN + 1;
		}
	}
	return objYN;
}
/**
 * @param chooseId
 * @param objName
 * @returns {Number}
 */
function selectAllDisabled(chooseId, objName) {
	var flag = document.getElementById(chooseId).checked;
	var obj = document.getElementsByName(objName);
	if (obj == null) {
		return 0;
	}
	var objLen = obj.length;
	for (i = 0; i < objLen; i++) {
		if (obj[i].disabled != true) {
			obj[i].checked = flag;
		}
	}
}
function checkTextEmpty(objId, showMessage) {
	var obj = document.getElementById(objId);
	if (obj.value == "") {
		alert(showMessage + "\xe4\xb8\x8d\xe8\x83\xbd\xe4\xb8\xba\xe7\xa9\xba");
	}
}
function getCheckBox(objName) {
	var objs = document.getElementsByName(objName);
	var i = 0;
	var len = objs.length;
	for (; i < len; i++) {
		var obj = objs[i];
		if (obj.checked == true) {
			return obj;
		}
	}
}
function getById(id) {
	return document.getElementById(id);
}
function getByName(name) {
	return document.getElementsByName(name);
}
function getOptionSelect(objId) {
	var ops = document.getElementById(objId);
	for (var i = 0; i < ops.length; i++) {
		if (ops[i].selected == true) {
			return ops[i];
		}
	}
}

