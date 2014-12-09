function add (listTo, listFrom) {
    for (var item = 0; item < listFrom.options.length; item++) {
        if (listFrom.options[item].selected) {
            var temp = document.createElement("OPTION");
            temp.text = listFrom.options[item].text;
            temp.value = listFrom.options[item].value;
            var index = listTo.length;
            var isExist = false;
            for(var i=0;i<index;i++){
            	if(temp.value==listTo[i].value){
            	  	isExist = true;
            	}
            }
            if(!isExist){
            	listTo.add(temp, index);
            }
        }
    }
}

function remove (listTo) {
    for (var i = 0; i < listTo.options.length; i++) {
        if (listTo.options[i].selected) {
			listTo.remove(i);
			i--;
        }
    }	
}

function moveUp(direction,currentSel){ 
	if(currentSel == null) return; 
	var index;
	
	if(direction){//up 
		for(var i=0;i<currentSel.length;i++){
			if(currentSel.options[i].selected){
				index=i;
				if(index==0) return; 
				var value = currentSel.options[index-1].value; 
				var text = currentSel.options[index-1].text; 

				currentSel.options[index-1].value = currentSel.options[index].value; 
				currentSel.options[index-1].text = currentSel.options[index].text; 

				currentSel.options[index].value = value; 
				currentSel.options[index].text = text; 

				currentSel.options[index].selected = false; 
				currentSel.options[index-1].selected = true; 
			}
		}
	}else{//down 
		for(var i=currentSel.length-1;i>=0;i--){
			if(currentSel.options[i].selected){
				index=i;
				if(index==(currentSel.length-1)) return; 

				var value = currentSel.options[index+1].value; 
				var text = currentSel.options[index+1].text; 

				currentSel.options[index+1].value = currentSel.options[index].value; 
				currentSel.options[index+1].text = currentSel.options[index].text; 

				currentSel.options[index].value = value; 
				currentSel.options[index].text = text; 

				currentSel.options[index].selected = false; 
				currentSel.options[index+1].selected = true; 
			}
		}
	} 
	
} 
function moveSelecteds(fromListBox,toListBox,noRepit){
	var fromBox=document.getElementById(fromListBox);
	var toBox=document.getElementById(toListBox);
	if(fromBox&&toBox){
		if(noRepit&&noRepit==true){
			for(var i=0;i<fromBox.options.length;){
				if(fromBox.options[i].selected){
					var value=fromBox.options[i].value;
					var text=fromBox.options[i].text;
					if(isOptionInTheList(value,toBox)){
						//alert("已经存在！");
					}else{
						toBox.options.add(new Option(text,value));
					}
					fromBox.options.remove(i);
				}else{
					i++;
				}
			}
		}else{
			for(var i=0;i<fromBox.options.length;){
				if(fromBox.options[i].selected){
					var value=fromBox.options[i].value;
					var text=fromBox.options[i].text;
					fromBox.options.remove(i);
					toBox.options.add(new Option(text,value));
				}else{
					i++;
				}
			}
		}
		
	}
}
function isOptionInTheList(id,list){
	for(var i=0;i<list.length;i++){
		if(id==list.options[i].value){
			return true;
		}
	}
	return false;
}
function copyItemAndChangeText(fromBoxId,toBoxId,addText,selectedIndex){
	var fromBox=document.getElementById(fromBoxId);
	var toBox=document.getElementById(toBoxId);
	if(fromBox&&toBox){
		var selectText=fromBox.options[selectedIndex].text;
		var selectValue=fromBox.options[selectedIndex].value;
		var _text="_("+addText+")";
		if(selectText.indexOf(_text)==-1){
			toBox.add(new Option(selectText,selectValue));
			fromBox.options[selectedIndex].text=selectText+_text;
		}else{
			alert(addText+"!");
		}
	}
}
function deleteTextFlag(fromBoxId,toBoxId,subBoxId,addText,selectIndex){
	var fromBox=document.getElementById(fromBoxId);
	var toBox=document.getElementById(toBoxId);
	if(fromBox&&toBox){
		var _text="_("+addText+")";
		if(selectIndex){
			var value=fromBox.options[selectIndex].value;
			for(var j=0;j<toBox.options.length;j++){
				if(toBox.options[j].value==value){
					toBox.options[j].text=toBox.options[j].text.replace(_text,"");
				}
			}
			if(subBoxId!=""){
				var subBox=document.getElementById(subBoxId);
				if(subBox){
					for(var k=0;k<subBox.options.length;k++){
						if(toBox.options[k].value==value){
							subBox.remove(k)
						}
					}
				}
			}
			fromBox.remove(selectIndex);
		}else{
			for(var i=0;i<fromBox.options.length;){
				if(fromBox.options[i].selected){
					var value=fromBox.options[i].value;
					for(var j=0;j<toBox.options.length;j++){
						if(toBox.options[j].value==value){
							toBox.options[j].text=toBox.options[j].text.replace(_text,"");
						}
					}
					if(subBoxId!=""){
						var subBox=document.getElementById(subBoxId);
						if(subBox){
							for(var k=0;k<subBox.options.length;k++){
								if(subBox.options[k].value==value){
									subBox.remove(k)
								}
							}
						}
					}
					fromBox.remove(i);
				}else{
					i++;
				}
			}
			
		}
	}
}
