<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8" />
		<title></title>
		<!-- 引入 Bootstrap -->
		<link href="blogclub/css/bootstrap.min.css" rel="stylesheet">
		<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="blogclub/js/jquery.js"></script>
		<!-- 包括所有已编译的插件 -->
		<script src="blogclub/js/bootstrap.min.js"></script>
		<link href="blogclub/css/style.css" rel="stylesheet" />
	</head>
<body>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>
	<!-- 头部结束 -->
	<!--中间内容部分开始-->
	<div class="container fourzerofour">
		<img src="blogclub/img/404.jpg" />
	</div>
	<!--内容部分结束-->
	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>