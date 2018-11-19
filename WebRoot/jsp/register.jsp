<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript">
	function doSubmit() {
		registerForm.action = "<%=basePath%>jsp/register";
		registerForm.submit();
	}
</script>
</head>
<body>
	<form name="registerForm" method="post">
		<table>
			<tr>
				<td>账号:</td>
				<td><input type="text" name='username' /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="text" name='password' /></td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type="text" name='age' /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="注册"
					onclick="doSubmit()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>