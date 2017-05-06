<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <a href="hello">hello world</a><hr>
    
    <a href="sayHello">Say  Hello</a><hr>
    
    <a href="sayAgain">Say  Again</a><hr>
    
    <a href="addStudent">Lesson 1:Student form</a><hr>
    
    <a href="user">Lesson 4: User form</a><hr>
    
    <a href="staticpageindex">lesson 2 & 3:staticpageindex</a><hr>
    
    <a href="fileUpload">lesson 5: upload</a><hr>
    
      <a href="rssfeed">lesson 6: RSS</a><hr>
      
	<a href="user/ricardo">Lesson 7 : XML</a><hr>
	
	<a href="pdf/pdfshow">Lesson 8 : PDF</a><hr>
	
	<a href="xlsshow">Lesson 8: Excel</a><hr>
  </body>
</html>
