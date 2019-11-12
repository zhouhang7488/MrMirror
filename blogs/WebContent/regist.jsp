<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<base href="<%=basePath%>">
<title></title>
<!-- 引入 Bootstrap -->
<link href="blogclub/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="blogclub/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="blogclub/js/bootstrap.min.js"></script>
<link href="blogclub/css/style.css" rel="stylesheet" />
<script type="text/javascript" src="blogclub/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="blogclub/js/regist.js"></script>
<script type="text/javascript" src="blogclub/js/calendar.js"></script>
<script type="text/javascript" src="js/regist.js"></script>
</head>

<body>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>
	<!-- 头部结束 -->

	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="widthtwo regist">
			<h1>注&nbsp;册&nbsp;用&nbsp;户</h1>
			<form id="form1" action="regist.action" method="post">
				<table class="t1">
					<tr>
						<td>username:<input id="name" onblur="nameBlur()" type="text"
							class="form-control" name="name"
							placeholder="please input your name" /> <span id="name_exit"
							style="color: red;"></span>
						</td>
					</tr>
					<tr>
						<td>password:<input id="pass1" type="password"
							class="form-control" name="pass" /></td>
					</tr>
					<tr>
						<td>passsure:<input id="pass2" type="password"
							class="form-control" name="pass2" /></td>
					</tr>
					<tr>
						<td>age:<br />
						<input id="age" type="text" class="form-control" name="age"
							style="text-align: center; display: inline; width: 15%; margin-right: 8%;" />

							<input type="radio" checked="checked" name="sex" value="f" />female&nbsp;&nbsp;
							<input type="radio" name="sex" value="m" />male
						</td>
					</tr>
					<tr>
						<td>address:<br /> <select class="form-control address"
							id="provinceId" name="provinceId"
							onchange="showCity(this.value)"><option value='0'>-prov-</option></select>
							<select class="form-control address" id="cityId" name="cityId"
							onchange="showArea(this.value)"><option value='0'>-city-</option></select>
							<select class="form-control address" id="areaId" name="areaId"><option
									value='0'>-area-</option></select>
						</td>
					</tr>
					<tr>
						<td>tel:<input id="tel" type="text" class="form-control"
							name="tel" /></td>
					</tr>
					<tr class="button1">
						<td align="center">
							<button type="button" onclick="check()" class="btn btn-success">submit</button>
							<button type="reset" class="btn btn-info">reset</button>
						</td>
					</tr>
					<tr>
						<td style="color: red; font-weight: 900">
							<p name="mess"></p>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!--内容部分结束-->

	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>