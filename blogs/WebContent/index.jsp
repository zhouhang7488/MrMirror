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
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<h1>热门博客</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>作者</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${hotList }" var="blogVO">
				<tr>
					<td><a href="#">作者：${blogVO.authorName } <a></td>
					<td><a href="bloginfo.action?bid=${blogVO.id }">标题：${blogVO.title }</a></td>
					<td><a href="#">${blogVO.kindName }</a></td>
					<td>${blogVO.dateTime }</td>
					<td>${blogVO.clicks }</td>
				</tr>
			</c:forEach>
		</table>

		<h1>博客列表</h1>
		<table class="table table-hover">
			<caption>基本的表格布局</caption>
			<tr>
				<th>作者</th>
				<th>标题</th>
				<th>类型</th>
				<th>发表时间</th>
				<th>浏览量</th>
			</tr>
			<c:forEach items="${indexList}" var="blogVO">
				<tr>
					<td><a href="#">作者：${blogVO.authorName } <a></td>
					<td><a href="#">标题：${blogVO.title }</a></td>
					<td><a href="#">${blogVO.kindName }</a></td>
					<td>${blogVO.dateTime }</td>
					<td>${blogVO.clicks}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>