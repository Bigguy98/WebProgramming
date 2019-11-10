var giatri=document.getElementById('values');
var a;
function minus_quantity_product() {
	if(giatri.value==""){
		a=0;
	}
	else{
		a=parseInt(giatri.value);
	}

	if(a>0){
		giatri.value = a-1;
	}else{
		giatri.value=0;
	}

	// body...
}