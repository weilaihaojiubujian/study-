<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="exception.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>测试异常的页面</h1>>
<hr>
<%
System.out.println(100/0);//抛出运行时异常,算数异常
%>

</body>
</html>