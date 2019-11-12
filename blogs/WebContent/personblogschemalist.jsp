<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入 Bootstrap -->
<link href="blogclub/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="blogclub/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="blogclub/js/bootstrap.min.js"></script>
<link href="blogclub/css/style.css" rel="stylesheet" />
<script>
		function delete_blog(param){
			var del = confirm("确定删除编号为："+param+"的博客吗？");
			if(del){
				window.location="editblog.action?type=1&bid="+param;
			}
		}
		</script>
<title>Insert title here</title>
</head>
<body>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>
	<!-- 头部结束 -->
	<!-- 内容模块1 -->
	<div class="d2 allwidth">
		<!--用户信息-->
		<div id="userinfo" class="templatemo-container userinfo">
			<ul>
				<li><span class="glyphicon glyphicon-user">：${user.name }</span></li>
				<li><span class="glyphicon glyphicon-tree-conifer">：</span> <c:if
						test="${user.sex!='f'}">♂</c:if>&nbsp; <c:if
						test="${user.sex=='f'}">♀</c:if></li>
				<li><span class="glyphicon glyphicon-circle-arrow-right">：</span>${user.age}</li>
				<li><span class="glyphicon glyphicon-earphone">：${user.tel}</span></li>
				<c:if test="${user != null }">
					<li><a href="personbloglist.action?type=1&uid=${user.uid }">click
							me into my blog</a></li>
					<li><a href="addblog.action?type=1">create blog</a></li>
				</c:if>
			</ul>
		</div>
		<!--用户博客概要列表-->
		<div class="schemalist">
			<table class="table table-hover bloglist">
				<tr class="personbloginfo_tr">
					<th style="width: 10%;">作者</th>
					<th>标题</th>
					<th>时间</th>
				</tr>
				<c:forEach items="${list}" var="blog">
					<!--要循环的博客概要-->
					<tr class="personbloginfo_tr">
						<td class="line"><a
							href="personbloglist.action?type=1&uid=${blog.uid }">${blog.authorName }</a></td>
						<td class="line"><span class="schema_title"><a
								href="bloginfo.action?bid=${blog.id }">${blog.title }</a></span></td>
						<td class="line"><span class="schema_time">时间：${blog.dateTime }
						</span> <span class="blogedit"> <a
								onclick="delete_blog(${blog.id })">删除</a>&nbsp;|&nbsp; <a
								href="editblog.action?type=2&id=${blog.id }">编辑</a>
						</span></td>
					</tr>
					<tr class="personbloginfo_tr">
						<td class="layout" colspan="3"><a
							href="bloginfo.action?bid=${blog.id }"> ${blog.content } </a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>
</html>