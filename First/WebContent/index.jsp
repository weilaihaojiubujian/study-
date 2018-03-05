<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="use.Users" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Users use=new Users();
   use.setUsename("admin");//设置用户名
   use.setPassword("123456");//设置密码
%>
<h1>使用普通方式创建javabean的实例</h1>
<hr>
用户名：<%=use.getUsename() %><br>
密码:<%=use.getPassword() %><br>
</body>
</html>