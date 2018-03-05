<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL函数的使用</title>
</head>
<body>
<c:out value="“你好,Hello World!”中是否包含“Hello”:${fn:contains('你好,Hello World!','Hello')}"></c:out><br>
<c:out value="“你好,Hello World!”中是否包含“aaaa”:${fn:contains('你好,Hello World!','aaaa')}"></c:out><br>
<!--containsIgnoreCase忽略大小写-->
<c:out value="“你好,Hello World!”中是否包含“hello”:${fn:containsIgnoreCase('你好,Hello World!','hello')}"></c:out>
<br>

<c:out value="“你好,Hello World”中是否以“ World”结尾:${fn:endsWith('你好,Hello World','World')}"></c:out><br>
<c:out value="“你好,Hello World”中是否以“ 你好”开头:${fn:startsWith('你好,Hello World','你好')}"></c:out><br>

<book>遮天</book><br>
<c:out value="${fn:escapeXml('<book>遮天</book>')}"></c:out><br>
<c:out value="<book>遮天</book>"></c:out><br>

<c:out value="“你好,Hello World”中“llo”出现的index值:${fn:indexOf('你好,Hello World','llo')}"></c:out><br>
</body>
</html>