<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*,java.text.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>session内置对象</h1>>
<hr>
<%
SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); 
Date d=new Date(session.getCreationTime());
session.setAttribute("usename","admin");
%>
<%//将创建时间转化为日期 %>

session的id编号:<%=session.getId() %><BR>
从session中获取用户名:<%=session.getAttribute("usename") %><br>
</body>
</html>