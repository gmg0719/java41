<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'saveUserInfo.jsp' starting page</title>  
	
  </head>
  
  <body>
 	<form action="${pageContext.request.contextPath }/userInfo/saveUserInfo.do">
 	<input type="hidden" name="user_id" value="${userInfo.user_id }"/>
 		<table>
 			<tr>
 				<th colspan="2">${agreed}</th>
 			</tr>
 			<tr>
 				<td>用户名：</td>
 				<td><input type="text" name="user_name" value="${userInfo.user_name }"/> </td>
 			</tr>
 			<tr>
 				<td>密码：</td>
 				<td><input type="password" name="user_password" value="${userInfo.user_password }"/> </td>
 				
 			</tr>
 			<tr>
 				<td>权限</td>
 				<td>
 					<select name="state">
 						<option value="1">超级管理员</option>
 						<option value="2">普通管理员</option>
 						<option value="3">用户</option>
 					</select> 
 				</td>
 			</tr>
 			<tr>
					<td><input type="submit" value="登录"/></td>
					<td><input type="reset" value="重置"/></td>
				</tr>
 		</table>
 	
 	</form>
   		
  </body>
</html>
