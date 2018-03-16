<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="person" class="com.imooc.test.Person"></jsp:useBean>
<%@page import="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--使用out标签输出常量  -->
<c:out value="这就是JSTL"></c:out><br>
<!--使用out标签输出变量  -->
<%session.setAttribute("name","Jessica"); %> 
<c:out value="${name}"></c:out><br>
<!--没有这个属性的值时，用default会输出一个默认值-->
<c:out value="${name1}" default="error"></c:out><br>
<!--escapeXml="false"就可以转义，将&lt变成<,将&gt变成>,-->
<c:out value="&ltout标签&gt" escapeXml="false"></c:out><br>
<!--会在jsp的内置对象中找username，如何没有就输出为空的字符串  -->
<c:out value="${username }"></c:out> 
<c:out value="${1+2 }"></c:out>
<%String username="";request.setAttribute("username", username); %>
<!--empty对空和空字符串都返回true  -->
<c:out value="${empty username}"></c:out><br>  


<!--将today存到名字为day的session中，存值到scope中  -->
<c:set value="today" var="day" scope="session"></c:set>
<c:out value="${day}"></c:out><br>
<!--将eleven放在标签之中，也可以输出  -->
<c:set  var="age" scope="application">eleven</c:set>
<c:out value="${age}"></c:out><br>

<!--通过set标签向person中赋值  -->
<!--&nbsp;加空格  -->
<c:set target="${person}" property="name2" value="zhangsan"></c:set>
<c:out value="${person.name2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="age2" value="26"></c:set>
<c:out value="${person.age2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="address" value="北京市 朝阳区"></c:set>
<c:out value="${person.address}"></c:out><br>

<c:set target="${person}" property="name2" >zhangsan</c:set>
<c:out value="${person.name2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="age2" >26</c:set>
<c:out value="${person.age2}"></c:out>&nbsp;&nbsp;
<c:set target="${person}" property="address" >北京市 朝阳区</c:set>
<c:out value="${person.address}"></c:out><br>

<!--remove标签的用法 ,只能去掉变量，向上面Person这样javaBean中的属性不能去掉 -->
<c:set var="lastName" value="LiLy"></c:set>
<c:out value="${lastName}"></c:out>
<c:set var="firstName" value="Wang"></c:set>
<c:remove var="firstName"/>
<c:out value="${firstName}"></c:out>


<!--catch标签的用法 -->
<c:catch var="error">
<c:set target="aa" property="bb">asasa</c:set>
</c:catch>
<c:out value="${error}"></c:out><br>


<!--if标签的用法 -->
<form action="firstDemo.jsp" method="post">
<input type="text" name="score" value="${param.score}"/>
<input type="submit"/>
</form>
<!--优秀score>=90 -->
<c:if test="${param.score>=90}" var="result">
<c:out value="恭喜，你的成绩是优秀"></c:out>
</c:if>
<c:if test="${param.score>=80&&param.score<90}" var="result">
<c:out value="恭喜，你的成绩是良好"></c:out>
</c:if>
<c:if test="${param.score>=60&&param.score<80}" var="result">
<c:out value="恭喜，你的成绩是及格"></c:out>
</c:if>
<c:if test="${param.score<60}" var="result">
<c:out value="恭喜，你的成绩是不及格"></c:out>
</c:if>
<c:out value="${result}"></c:out><br>



<!--choose,when,otherwise的用法 -->
<form action="firstDemo.jsp" method="post">
<input type="text" name="scor" value="${param.scor}"/>
<input type="submit"/>
</form>
<c:choose>

   <c:when test="${param.scor>=90&&param.scor<=100}">
   <c:out value="优秀"></c:out>
   </c:when>

   <c:when test="${param.scor>=80&&param.scor<90}">
   <c:out value="良好"></c:out>
   </c:when>

   <c:when test="${param.scor>=70&&param.scor<80}">
   <c:out value="中等"></c:out>
   </c:when>

   <c:when test="${param.scor>=60&&param.scor<70}">
   <c:out value="及格"></c:out>
   </c:when>

   <c:when test="${param.scor>=0&&param.scor<60}">
   <c:out value="不及格"></c:out>
   </c:when>

  <c:otherwise>
   <c:out value="不成立"></c:out>
  </c:otherwise>

</c:choose>
<br>
<c:choose>
  <c:when test="${param.scor==100}">
    <c:out value="太棒啦，你是第一名"></c:out>
  </c:when>
</c:choose>


<%  List<String>fruits=new ArrayList<String>(); 
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("pear");
    fruits.add("watermelon");
    fruits.add("banana");
    fruits.add("grape");
    request.setAttribute("fruits", fruits);
    	
%>

<!--forEach标签的用法 -->
   <!--用法1:全部遍历 -->
   <c:forEach var="fruit" items="${fruits}">
       <c:out value="${fruit}"></c:out><br>
   </c:forEach>
   <c:out value="=========================================="></c:out><br>
    <!--用法2:部分遍历 -->
    <c:forEach var="fruit" items="${fruits}" begin="1" end="4">
       <c:out value="${fruit}"></c:out><br>
   </c:forEach>
   <c:out value="=========================================="></c:out><br>
   
    <!--用法3:部分遍历并且指定步长 -->
    <c:forEach var="fruit" items="${fruits}" begin="1" end="4" step="2">
       <c:out value="${fruit}"></c:out><br>
   </c:forEach>
   <c:out value="=========================================="></c:out><br>
      <!--index从0开始计数，count从1开始计数，first除了遍历的第一个为true，其他都是false，last除了遍历的最后一个为true，其他都是false -->
   <!--用法4:部分遍历并且指定步长并输出元素状态 -->
    <c:forEach var="fruit" items="${fruits}" begin="1" end="4" varStatus="fru">
       <c:out value="${fruit}的四个属性值"></c:out><br>
       <c:out value="${fruit}"></c:out><br>
       <c:out value="index属性:${fru.index}"></c:out><br>
        <c:out value="count属性:${fru.count}"></c:out><br>
        <c:out value="first属性:${fru.first}"></c:out><br>
        <c:out value="last属性:${fru.last}"></c:out><br>
       <c:out value="------------------------------------"></c:out><br>
   </c:forEach>
   <c:out value="=========================================="></c:out><br>
   
<!--forTokens的用法 -->   
<c:forTokens items="010-88096789-123" delims="-" var="num">
  <c:out value="${num}"></c:out><br>
</c:forTokens>
<c:out value="=========================================="></c:out><br>
<c:forTokens items="010-88096789-123" delims="-" var="num" begin="0" end="2" step="2">
  <c:out value="${num}"></c:out><br>
</c:forTokens>
<br><br><br>
<!--import的用法 -->   
<!--导入网络上的绝对路径-->
<c:catch var="error09">
  <c:import url="http://www.baidu.com" charEncoding="UTF-8"></c:import>
</c:catch>
<c:out value="${error09}"></c:out><br>

<!--导入相对路径的文件-->
<c:catch var="error08">
  <c:import url="tt.txt" charEncoding="UTF-8"></c:import>
</c:catch>
<c:out value="${error08}"></c:out><br>

<!--var及scope属性的用法-->
<c:catch var="error07">
  <c:import url="tt.txt" var="tt" scope="session" charEncoding="UTF-8"></c:import>
</c:catch>
<c:out value="${error07}"></c:out><br>
<c:out value="import标签储存的tt字符串变量值为:${sessionScope.tt}"></c:out><br>


<!--context属性的用法-->
<c:catch var="error06">
  <c:import url="/NewFile.jsp" context="/CxyApi" charEncoding="UTF-8"></c:import>
</c:catch>
<c:out value="${error06}"></c:out><br>

<br>
<c:out value="${param.username}"></c:out>
<c:out value="${param.password}"></c:out>
</body>
</html>