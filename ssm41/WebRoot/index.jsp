<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登陆界面</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath }/userInfo/login.do" method="post">
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="user_name" value="${userInfo.user_name }"/></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="user_password" value="${userInfo.user_password }"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录"/><font color="red"/>
					${errorMsg }</td>
					<td><input type="reset" value="重置"/></td>
				</tr>
			</table>
		</form>
	</body>
</html>