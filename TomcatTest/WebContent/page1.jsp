<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
  <a href="test.jsp" rel="external nofollow" rel="external nofollow" >test</a>
  <a href="qw.jsp" rel="external nofollow" rel="external nofollow" >qw</a>
  <a href="er.jsp" rel="external nofollow" rel="external nofollow" >er</a>
  <a href="main.jsp" rel="external nofollow" rel="external nofollow" >main</a>
 
</body>
</html>