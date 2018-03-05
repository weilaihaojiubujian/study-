<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
  <title>Title</title>
</head>
<body>
  这里是测试页面<br>
  <%if (session.getAttribute("username")==null){%>
  用户还没有登录
  <%}else {%>
  已登录，用户名：<%= session.getAttribute("username")%>
  <%}%>
  <br>
  
  <a href="qw.jsp" rel="external nofollow" rel="external nofollow" >登陆首页</a>
  
  <a href="main.jsp" rel="external nofollow" rel="external nofollow" >注册</a>
 <a href="gongneng.jsp" rel="external nofollow" rel="external nofollow" >功能</a>
</body>
</html>