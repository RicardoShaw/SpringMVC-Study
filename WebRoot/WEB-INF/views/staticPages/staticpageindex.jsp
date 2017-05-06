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
	
    <h2>Lesson 2:Spring MVC 静态页面</h2>
	<p>点击下面的按钮获得一个简单的HTML页面</p>
	<form:form method="GET" action="staticPage">
		<table>
   	 	<tr><td><input type="submit" value="获取HTML页面"/></td></tr>
		</table>  
	</form:form> 
	
	<hr>
	<h2>Lesson 3:Spring MVC页面重定向</h2>
    <p>点击下面的按钮将结果重定向到新页面</p>
    <form:form method="GET" action="redirect">
        <table>
            <tr>
                <td><input type="submit" value="页面重定向" /></td>
            </tr>
        </table>
    </form:form>
	
	
  </body>
</html>
