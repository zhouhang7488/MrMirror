<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>regist</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/regist.js"></script>
<script type="text/javascript" src="js/calendar.js"></script>
<style type="text/css">
select {
	padding: 6px 12px;
}
</style>
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
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>用户列表</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>电话号码</th>
				<th>地址</th>
				<th>注册时间</th>
				<th>操作</th>
			</tr>
			<c:forEach var="u" items="${list}" varStatus="vs">
				<c:if test="${vs.count%2!=0}">
					<c:set var="c" value="c1"></c:set>
				</c:if>
				<c:if test="${vs.count%2==0 }">
					<c:set var="c" value=""></c:set>
				</c:if>
				<tr class="${c}">
					<td>${u.uid}</td>
					<td>${u.name}</td>
					<td>${u.sex}</td>
					<td>${u.age}</td>
					<td>${u.tel}</td>
					<td>${u.ip}</td>
					<td></td>
					<td><a href="#">删除</a>&nbsp;&nbsp;<a href="#">编辑</a></td>
				</tr>
			</c:forEach>

		</table>

	</div>
	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>