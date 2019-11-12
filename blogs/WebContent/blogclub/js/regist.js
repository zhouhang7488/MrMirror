function newAccount() {
	window.location.href = "regist.html";
}
function check() {
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;
	var name = document.getElementById("name").value;
	var year = document.getElementById("year").value;
	var month = document.getElementById("month").value;
	var day = document.getElementById("day").value;
	var mes = $("#mes").html();
	if (name == "please input your name") {
		alert("用户名不能为空");
		return false;
	}
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if (year ==0){
		alert("please select your birthday: year");
		return false;
	}
	if (month==0){
		alert("please select your birthday: month");
		return false;
	}
	if (day==0){
		alert("please select your birthday: day");
		return false;
	}
	if(mes!=""){
		alert(mes);
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}
}