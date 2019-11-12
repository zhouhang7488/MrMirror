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
	<div class="container allwidth">
		<h1>blog info</h1>
		<div class="templatemo-container bloginfo">
			<h3 style="font-size: 32px;">${blog.title }</h3>
			<div id="content" class="content">

				<!-- content start -->

				${blog.content }
				<!-- end -->
			</div>
			<!-- 评论开始 -->
			<div class="commentboth">
				<h5 class="comment_title">文章评论</h5>
				<!-- 需要循环的评论内容 -->
				<div class="comment">
					<div class="comment_author">
						<span>1楼</span><span>詹姆斯*高林思</span><span>2016/12/23</span>
					</div>
					<div class="comment_text">好文章，值得收藏！</div>
				</div>
				<div class="comment">
					<div class="comment_author">
						<span>1楼</span><span>詹姆斯*高林思</span><span>2016/12/23</span>
					</div>
					<div class="comment_text">好文章，值得收藏！</div>
				</div>
				<!-- 循环结束 -->
			</div>
			<!-- 评论结束 -->
			<div class="tocomment">
				<span>发表评论</span>
				<textarea></textarea>
				<button class="btn btn-success">submit</button>
			</div>
		</div>

	</div>
	<!--内容部分结束-->

	<!-- 脚步 -->
	<c:import url="footer.jsp"></c:import>
	<!-- 脚部结束 -->
</body>

</html>