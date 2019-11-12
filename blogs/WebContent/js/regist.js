//用户名称检查
function nameBlur() {
	var n = $("#name").val();
	console.log(n);

	$.ajax({
		type : 'post',
		url : 'check.action',
		data : {name:n},
		success : function(result) {
			console.log(result);
			if (result == "true") {
				$("#name_exit").html("");
			} else {
				$("#name_exit").html("用户名已存在，请更换");
			}
		},
		dataType : 'text'
	});
}

$(function(){
	$.post("pca.action",{type:1},function(result){
		console.log(result);
		var html = "<option value='0'>-prov-</option>";
		//将集合遍历到"html"中
		$.each(result.list,function(i,data){
			html+="<option value='"+data.provinceID+"'>"+data.province+"</option>"
		});
		$("#provinceId").html(html);
	},"json");
});

function showCity(pid){
	$.post("pca.action",{type:2,provinceId:pid},function(result){
		console.log(result);
		var html = "<option value='0'>-city-</option>";
		$.each(result.list,function(i,data){
			html+="<option value='"+data.cityID+"'>"+data.city+"</option>"
		});
		$("#cityId").html(html);
	},"json");
}

function showArea(cid){
	$.post("pca.action",{type:3,cityId:cid},function(result){
		console.log(result);
		var html="<option value='0'>-area-</option>";
		$.each(result.list,function(i,data){
			html+="<option value='"+data.areaID+"'>"+data.areas+"</option>";
		});
		$("#areaId").html(html);
	},"json");
}

function check() {
	var name = document.getElementById("name").value;
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;
	var age = document.getElementById("age").value;
	var name_exit = $("#name_exit").html();
	if (name == "") {
		alert("用户名不能为空");
		return false;
	}
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if(name_exit!=""){
		alert(name_exit);
		return false;
	}
	if (age == "") {
		alert("年龄不能为空");
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}
}