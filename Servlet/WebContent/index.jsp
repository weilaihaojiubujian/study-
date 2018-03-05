<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>第一个servlet小例子</h1>
<hr>
<a href="servlet/HelloServlet">Get方式请求HelloServlet</a><br>
<form action="servlet/HelloServlet" method="post">
<input type="submit" value="post方式提交HelloServlet"/>
</form>
</body>
</html>