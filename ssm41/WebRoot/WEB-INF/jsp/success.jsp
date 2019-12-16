<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>显示界面</title>

  </head>
  
  <frameset rows="15%,*">
  		<frame src="${pageContext.request.contextPath }/loyout/header.jsp">
  	<frameset cols="25%,*">
  		<frame src="${pageContext.request.contextPath }/loyout/menu.jsp">
  		<frame name="main" src="${pageContext.request.contextPath }/loyout/content.jsp">
  	</frameset>
  </frameset>
  
</html>
