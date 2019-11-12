<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<style type="text/css">
		.d1{
		width: 100%
		
		}
		.d2{
		width:30%;
		margin: auto;
		}
		</style>
	</head>

	<body>
		<!--导航栏盒子-->
		<div class="d1">
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<div class="container-fluid allwidth">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">欢迎来到博客园</a>
					</div>
					<div>
						<ul class="nav navbar-nav">
							<li class="active">
								<a href="index.jsp">网站首页</a>
							</li>
							<li>
								<a href="bloglist.jsp">博客浏览</a>
							</li>
							<li>
								<a href="userlist.jsp">用户列表</a>
							</li>							
							<li>
								<a href="login.jsp">登录</a>
							</li>
							<li>
								<a href="regist.jsp">注册</a>
							</li>
							<li>
								<a href="blogcreate.jsp">博客创建</a>
							</li>
							<li>
								<a href="personblogschemalist.jsp">我的博客</a>
							</li>
							<li>
								<a href="index.jsp">退出</a>
							</li>
							<li>
								<a onclick="window.history.go(-1)" style="cursor: pointer;">返回</a>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									博客类型
									<b class="caret"></b>
								</a>
								<ul class="dropdown-menu">
									<li>
										<a href="#">原创</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">转载</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">经典</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">另一个分离的链接</a>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<!--第一个banner的内容-->
		<div class="banner1">
			<div class="container">
				<h1>博客园</h1>
				<h2>博客园软件工程师的宝典，让web开发更迅速、简单。</h2>
				<p class="masthead-button-links">
					<a class="btn btn-lg btn-primary btn-shadow" href="https://v3.bootcss.com/css/" target="_blank" role="button" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap3中文文档'])">Bootstrap3中文文档(v3.3.7)</a>
				</p>
				<ul class="masthead-links">
					<li>
						<a href="https://v3.bootcss.com/css/" target="_blank" role="button" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap2中文文档'])">Bootstrap2中文文档(v2.3.2)</a>
					</li>
				</ul>
			</div>
		</div>
		<!--热门社区-->
		<div class="bc-social">
			<div class="container">
				<ul class="bc-social-buttons">
					<li class="social-forum">
						<a class="" href="http://wenda.bootcss.com" title="Bootstrap问答社区" target="_blank" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-Bootstrap问答社区'])">
							<i class="fa fa-comments"></i> Bootstrap问答社区
						</a>
					</li>
					<li class="social-weibo">
						<a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank" onclick="_hmt.push(['_trackEvent', 'masthead', 'click', 'masthead-新浪微博'])"><i class="fa fa-weibo"></i> 新浪微博：@Bootstrap中文网</a>
					</li>
				</ul>
			</div>
		</div>
		<!-- 内容模块1 -->
		<div class="d1">
		<div class="d2">
			<h1>登录成功</h1>
			<p>用户ID：${user.uid }</p>
			<p>用户名：${user.name }</p>
			<p>密码：${user.pass }</p>
			<p>性别：${user.sex }</p>
			<p>注册的IP地址：${user.ip }</p>
			<p>注册的时间：${user.inputdate }</p>
			<p><a href="update.action?type=1&id=${user.uid }">点击我进入修改</a></p>
		</div>
	</div>
		<!-- 脚部 -->
		<footer class="footer ">
			<div class="container allwidth">
				<div class="row footer-top">
					<div class="col-md-6 col-lg-6">
						<h3>博客园</h3>
						<p>我们一直致力于为广大开发者提供更多的优质技术文档和辅助开发工具！</p>
					</div>
					<div class="col-md-6  col-lg-5 col-lg-offset-1">
						<div class="row about">
							<div class="col-sm-3">
								<h4>关于</h4>
								<ul class="list-unstyled">
									<li>
										<a href="/about/">关于我们</a>
									</li>
									<li>
										<a href="/ad/">广告合作</a>
									</li>
									<li>
										<a href="/links/">友情链接</a>
									</li>
									<li>
										<a href="/hr/">招聘</a>
									</li>
								</ul>
							</div>
							<div class="col-sm-3">
								<h4>联系方式</h4>
								<ul class="list-unstyled">
									<li>
										<a href="http://weibo.com/bootcss" title="Bootstrap中文网官方微博" target="_blank">新浪微博</a>
									</li>
									<li>
										<a href="mailto:admin@bootcss.com">电子邮件</a>
									</li>
								</ul>
							</div>
							<div class="col-sm-4">
								<h4>旗下网站</h4>
								<ul class="list-unstyled">
									<li>
										<a href="http://www.golaravel.com/" target="_blank">Laravel中文网</a>
									</li>
									<li>
										<a href="http://www.ghostchina.com/" target="_blank">Ghost中国</a>
									</li>
									<li>
										<a href="http://www.bootcdn.cn/" target="_blank">BootCDN</a>
									</li>
									<li>
										<a href="https://pkg.phpcomposer.com/" target="_blank">Packagist中国镜像</a>
									</li>
									<li>
										<a href="https://www.return.net/" target="_blank">燃腾教育</a>
									</li>
								</ul>
							</div>
							<div class="col-sm-2">
								<h4>赞助商</h4>
								<ul class="list-unstyled">
									<li>
										<a href="http://www.maoyun.tv/" target="_blank">猫云</a>
									</li>
									<li>
										<a href="https://www.jdcloud.com/" target="_blank">京东云</a>
									</li>
									<li>
										<a href="https://www.upyun.com" target="_blank">又拍云</a>
									</li>
								</ul>
							</div>
						</div>

					</div>
				</div>
				<hr>
				<div class="row footer-bottom">
					<ul class="list-inline text-center">
						<li>
							<a href="http://www.miibeian.gov.cn/" target="_blank">京ICP备11008151号</a>
						</li>
						<li>京公网安备11010802014853</li>
					</ul>
				</div>
			</div>
		</footer>
		<!-- 脚部结束 -->
	</body>

</html>