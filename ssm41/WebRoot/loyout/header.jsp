<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>头名</title>

  </head>
  
  <body>
    	${currentUser.user_name}登陆成功
    	<a href="${pageContext.request.contextPath }/userInfo/logout.do" target="_parent">注销</a>
  </body>
</html>
