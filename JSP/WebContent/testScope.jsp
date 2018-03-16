<%@ page language="java" contentType="text/html;  charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="use.Users" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>javaBean的作用域范围</h1>
<hr>
<jsp:useBean id="myUsers" class="use.Users" scope="page"/>
用户名：<jsp:getProperty property="usename" name="myUsers"/><br>
密码:<jsp:getProperty property="password" name="myUsers"/><br>
<!-- 使用内置对象来获取用户名和密码 -->
<%-- 
用户名：<%=((Users)application.getAttribute("myUsers")).getUsename()%><br>
密码:<%=((Users)application.getAttribute("myUsers")).getPassword()%><br>
--%>
<%-- 
用户名：<%=((Users)session.getAttribute("myUsers")).getUsename()%><br>
密码:<%=((Users)session.getAttribute("myUsers")).getPassword()%><br>
--%>
<%-- 
用户名：<%=((Users)request.getAttribute("myUsers")).getUsename()%><br>
密码:<%=((Users)request.getAttribute("myUsers")).getPassword()%><br>
--%>
<%
   String usename="";
   String password="";
   if(pageContext.getAttribute("myUsers")!=null)
   {
	   usename=((Users)pageContext.getAttribute("myUsers")).getUsename();
	   password=((Users)pageContext.getAttribute("myUsers")).getPassword();
   }
%>
用户名：<%=usename%><br>
密码:<%=password%><br>
</body>
</html>