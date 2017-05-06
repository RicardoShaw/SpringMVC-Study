<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>

<h2>提交的学生信息如下 - </h2>
<h1>${message }</h1>
   <table>
    <tr>
        <td>名称：</td>
        <td>${name}</td>
        <td>${command.name}</td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td>${age}</td>
        <td>${command.age}</td>
    </tr>
    
    <tr>
        <td>年龄：</td>
        <td>${email}</td>
        <td>${command.email}</td>
    </tr>

</table>  
</body>
</html>