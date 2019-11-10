
function add_quantity_product() {
	var giatri=document.getElementById('values');
	var a;
	if(giatri.value==""){
		a=0;
	}
	else{
		a=parseInt(giatri.value);
	}
	giatri.value = a+1;
	

	// body...
}


//var list = [{
//	id:1
//	tensp: name,
//	soluong: 2
//},{},...]
//foreach(list -> {
//		input id = "abc" + id
//})