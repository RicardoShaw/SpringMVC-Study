<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


		<h1>Spring 4 MVC Multi File Upload Example </h1>
		<form:form method="POST" modelAttribute="multifileModel" enctype="multipart/form-data" class="form-horizontal">
		
			<c:forEach var="v" varStatus="vs" items="${multifileModel.files}">
				<form:input type="file" path="files[${vs.index}].file" id="files[${vs.index}].file" class="form-control input-sm"/>
				<div class="has-error">
					<form:errors path="files[${vs.index}].file" class="help-inline"/>
				</div>
			</c:forEach>
			<br/>
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="multifileUpload" class="btn btn-primary btn-sm">
				</div>
			</div>
		</form:form>
		<br/>
</body>
</html>
