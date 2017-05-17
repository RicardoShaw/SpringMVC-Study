<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring MVC上传处理</title>
</head>
<body>

		<c:forEach var="fileName" items="${fileNames}">

				File:<strong>${fileName}</strong> uploaded successfully<br/>

				File  <strong>${fileName}</strong> uploaded successfully<br/>

		</c:forEach>
		
</body>
</html>
