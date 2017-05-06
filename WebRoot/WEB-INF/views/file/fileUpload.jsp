<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring MVC上传处理</title>
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


    <form:form method="POST" modelAttribute="fileUpload"
        enctype="multipart/form-data">
      请选择一个文件上传 : 
      <input type="file" name="file" />
        <input type="submit" value="提交上传" />
    </form:form>
</body>
</html>
