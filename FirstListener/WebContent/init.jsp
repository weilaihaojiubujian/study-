<%@page import="com.imooc.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("requestName","requestValue");
request.getSession().setAttribute("sessionName","sessionValue");
request.getSession().getServletContext().setAttribute("contextName","contextValue");
request.setAttribute("requestName","requestValue");
request.removeAttribute("requestName");

request.getSession().setAttribute("currentUser",new User());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
这是初始化值界面
<button onclick="location.href='<%=request.getContextPath() %>/init.jsp'">Init</button>
     <button onclick="location.href='<%=request.getContextPath() %>/destory.jsp'">Destory</button>
</body>
</html>