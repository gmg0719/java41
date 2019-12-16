<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>用户列表</title>

  </head>
  <script type="text/javascript" src="js/jquery-3.1.1.js"></script>
  <body>
  		
    		<a href="${pageContext.request.contextPath }/userInfo/addUserInfo.do">添加</a>
    		<input type="text" id="user_name" name="user_name">
  			<input type="button" value="查询" onclick="selectUserInfo()"/>
    	<table border="1" cellspacing="0">
    		<tr>
    			<th colspan="5">用户列表</th>
    		</tr>
    		<tr>
    			<th>编码</th>
    			<th>用户名</th>
    			<th>密码</th>
    			<th>权限</th>
    			<th>操作</th>
    		</tr>
    		
    			<c:forEach items="${resultUser}" var="userInfo">
	    			<tr>
		    			<td>${userInfo.user_id}</td>
		    			<td>${userInfo.user_name }</td>
		    			<td>${userInfo.user_password }</td>
		    			<td>${userInfo.state }</td>
		    			<td>
		    				<a href="${pageContext.request.contextPath }/userInfo/deleteUserInfo.do?user_id=${userInfo.user_id}">删除</a>
		    				<a href="${pageContext.request.contextPath }/userInfo/updateUserInfo.do?user_id=${userInfo.user_id}">修改</a>
		    			</td>
	    			</tr>
    			</c:forEach>
    		
   		</table>
   		<script type="text/javascript">
   			function selectUserInfo(){
   			var user_name=$("#user_name").val();
   			alert(user_name);
	   			/* $.ajax({
	   			url:"${pageContext.request.contextPath }/userInfo/selectUserInfo.do",
	   			type:"post",
	   			data:{user_name:user_name}
	   			}); */
   			};
   		
   		
   		</script>
   		
  </body>
</html>
