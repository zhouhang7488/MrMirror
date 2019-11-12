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

<link rel="stylesheet"
	href="blogclub/kindeditor/themes/default/default.css" />
<script charset="utf-8" src="blogclub/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8" src="blogclub/kindeditor/lang/zh_CN.js"></script>
<script>
	var editor;
	KindEditor.ready(function(K) {
		editor = K.create('textarea[name="c1"]', {
			allowFileManager : true
		});
	});

	function check() {
		var title = $("#title").val();
		var schema = $("#schema").val();
		var content = editor.html();
		if (title.trim() == "") {
			alert("title must be not null");
			return;
		}
		if (schema.trim() == "") {
			alert("schema must be not null");
			return;
		}
		if (content.trim() == "") {
			alert("content must be not null");
			return;
		}
		/* $("#c2").val(content);
		if(confirm("save this blog, are you sure?")) {
			$("#form1").submit();
		} */
	}
</script>

<link href="blogclub/css/style.css" rel="stylesheet" />
</head>

<body>
	<!-- 头部 -->
	<c:import url="header.jsp"></c:import>
	<!-- 头部结束 -->
	<!--中间内容部分开始-->
	<div class="container allwidth">
		<div class="create">
			<h1>创建博客</h1>
			<form id="form1" action="addblog.action" method="post">
				<input type="hidden" name="type" value="2" />
				<table class="templatemo-container">
					<tr>
						<td>title:<input id="title" type="text" class="form-control"
							name="title" />
						</td>
					</tr>
					<tr>
						<td>kind:<br /> <select class="form-control" id="kind"
							name="kind">
								<c:forEach items="${blogKinds}" var="kind">
									<option value="${kind.kid}">${kind.name }</option>
								</c:forEach>
						</select>
						</td>
					</tr>
					<tr>
						<td>schema:<br /> <textarea class="form-control" id="schema"
								name="schema" style="width: 1024px; resize: none;"></textarea>
						</td>
					</tr>
					<tr>
						<td>content:<br /> <textarea class="form-control" id="c1"
								name="c1" style="width: 1024px; resize: none;" rows="30"></textarea><br />
							<input name="content" id="c2" type="hidden" />
						</td>
					</tr>
					<tr>
						<td align="center"><button type="submit"
								" class="btn btn-success">submit</button></td>
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