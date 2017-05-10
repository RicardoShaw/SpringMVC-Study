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
    
    <title>My JSP 'user.jsp' starting page</title>
    
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
   <h2>Student Information</h2>
<form:form method="POST" action="handlerInterceptor/addUser">
   <table>
    <tr>
        <td><form:label path="username">用户名：</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td><form:label path="password">密码：</form:label></td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
    	<td><form:label path="address">地址：</form:label></td>
    	<td><form:textarea path="address"/></td>
    </tr>
    <tr>
    	<td><form:label path="receivePaper">订阅报纸：</form:label></td>
    	<td><form:checkbox path="receivePaper"/></td>
    </tr>
    
        <tr>
    	<td><form:label path="favoriteFrameworks">喜欢的框架：</form:label></td>
    	<td><form:checkboxes items="${frameworks}" path="favoriteFrameworks"/></td>
    </tr>
    
     <tr>
    	<td><form:label path="gender">性别：</form:label></td>
    	<td><form:radiobutton path="gender" value="M" lable="男"/>
    		<form:radiobutton path="gender" value="F" lable="女"/>
    	</td>
    </tr>
    

     <tr>
    	<td><form:label path="favoriteNumber">喜欢的数字：</form:label></td>
    	<td><form:radiobuttons path="favoriteNumber" items="${numberList}"/></td>  	
    </tr>
    

     <tr>
    	<td><form:label path="country">国家：</form:label></td>
    	<td><form:select path="country">
    		<form:option value="NONE" lable="选择国籍..."></form:option>
    		<form:options items="${countryList}"/>
    	</form:select>
    </tr>
    

     <tr>
    	<td><form:label path="skills">技能：</form:label></td>
    	<td><form:select path="skills" items="${skillsList }"
    	multiple="true"/></td>
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
