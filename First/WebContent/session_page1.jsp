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
session.setMaxInactiveInterval(10);
//设置当前session的最大生成期限是10秒
%>
<%//将创建时间转化为日期 %>
session创建时间:<%=sdf.format(d)%><br> <%/*session.getCreationTime()输出session创建时间的长整型毫秒数*/ %>
session的id编号:<%=session.getId() %><BR>
从session中获取用户名:<%=session.getAttribute("usename") %><br>
<a href="session_page2.jsp" target="_blank">跳转到session_page2.jsp</a>
</body>
</html>