<%@ page language="java" import="java.util.*,java.io.*"contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<% response.setContentType("text/html; charset=UTF-8");//设置响应的MIMI类型

out.println("<h1>response内置对象</h1>");
out.println("<hr>");

PrintWriter outer=response.getWriter();
outer.println("大家好，我是response对象生成的输出流outer对象");%> 


