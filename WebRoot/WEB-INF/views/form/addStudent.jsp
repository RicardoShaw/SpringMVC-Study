<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<style>
.error {
    color: #ff0000;
}

.errorStyle {
    color: #000;
    background-color: #ffEEEE;
    border: 3px solid #ff0000;
    padding: 8px;
    margin: 16px;
}
</style>
<body>

<h2>Student Information</h2>
<form:form method="POST" action="addStudent" commandName="student">
<form:errors path="*" cssClass="errorStyle" element="div" />
   <table>
    <tr>
        <td>名字：</td>
        <td><form:input path="name" /></td>
        <td><form:errors path="name" cssClass="error" /></td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td><form:input path="age" /></td>
        <td><form:errors path="age" cssClass="error" /></td>
    </tr>
        <tr>
        <td>邮件：</td>
        <td><form:input path="email" /></td>
        <td><form:errors path="email" cssClass="error" /></td>
    </tr>
    
    <tr>
        <td>ID：</td>
        <td><form:input path="id" /></td>
        <td><form:errors path="id" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="提交表单"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
