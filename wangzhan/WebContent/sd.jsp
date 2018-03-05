<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>功能</title>
<style type="text/css">


  body {  
    background: url(36.jpg);  
    background-size: 100%;  
    background-repeat: no-repeat;  
}  
  #btn_login {  
    font-size: 14px;  
    font-family: 宋体;  
  
    width: 120px;  
    height: 28px;  
    line-height: 28px;  
    text-align: center;  
  
    color: white;  
    background-color: #3BD9FF;  
    border-radius: 6px;  
    border: 0;  
  
    float: left;  
}  

#login_control {  
    padding: 0 28px;  
}  
</style>
</head>
</head>
<body>
<div id="login_frame">  
 <%@page import="java.sql.*" %> 

  
<ul>
<li><p><b></b>
    <hr>
    <%!  int pageSize=4;
 int pageCount;
 int showPage;
 %>
    <% 
     
      request.setCharacterEncoding("utf-8");
      String username="";
      String password = "";
      Cookie[] cookies = request.getCookies();
      if(cookies!=null&&cookies.length>0)
      {
           for(Cookie c:cookies)
           {
              if(c.getName().equals("username"))
              {
                   username = URLDecoder.decode(c.getValue(),"utf-8");
              }
              if(c.getName().equals("pass"))
              {
                   password = URLDecoder.decode(c.getValue(),"utf-8");
              }
           }
      }
    %>



</p></li>
<li><p>

 
<%
		
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "jdbc:mysql://localhost/text?useUnicode=true&characterEncoding=utf-8&useSSL=false";

	   //  Database credentials
	    final String USER = "root";
	    final String PASS = "1004758012";

	  
	   Connection conn = null;
	   Statement stmt = null;
	   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      
		      ResultSet  rs=stmt.executeQuery("select * from pinglun");
		      rs.last();
		      int recordCount=rs.getRow();
		      pageCount=(recordCount%pageSize==0)?(recordCount/pageSize):(recordCount/pageSize+1);
		      String integer=request.getParameter("showPage");
		      if(integer==null){
		       integer="1";
		      }
		      try{showPage=Integer.parseInt(integer);
		      }catch(NumberFormatException e){
		       showPage=1;
		      }
		      if(showPage<=1){
		       showPage=1;
		      }
		      if(showPage>=pageCount){
		       showPage=pageCount;
		      }
		      int position=(showPage-1)*pageSize+1;
		      rs.absolute(position);
		     
		      for(int i=1;i<=pageSize;i++){  
		    	  
		    	  String first=rs.getString("文章");
	              String wenben=rs.getString("评论人");
	              String second=rs.getString("评论");
		    	  if(second.compareTo(q)!=0 && first.compareTo(article)==0){ %>
		    	    <table>
		    	     <tr> 
		    	      <p>尊敬的<%=first %></p>
		    	      <p><%=wenben %></p>
		    	      <p><%=second %></p>
		    	     </tr>
		    	   
		    	     <%   }
   rs.next();
  } 
  rs.close();
  conn.close();
  }
  catch(Exception e){
  e.printStackTrace();}
 %>
 <br>
 第<%=showPage %>页（共<%=pageCount %>页）
 <br>
 <a href="pinglun.jsp?showPage=1">首页</a>
 <a href="pinglun.jsp?showPage=<%=showPage-1%>">上一页</a>
<% //根据pageCount的值显示每一页的数字并附加上相应的超链接
  for(int i=1;i<=pageCount;i++){
 %>
   <a href="pinglun.jsp?showPage=<%=i%>"><%=i%></a>
<% }
 %> 
 <a href="pinglun.jsp?showPage=<%=showPage+1%>">下一页</a>
 <a href="pinglun.jsp?showPage=<%=pageCount%>">末页</a>
 <!-- 通过表单提交用户想要显示的页数 -->
 <form action="" method="get">
  跳转到第<input type="text" name="showPage" size="4">页
  <input type="submit" name="submit" value="跳转">
 </form> 
		      
 
</p></li>
</ul>
</div>  
 <form name="regForm" action="shixian.jsp"method="post">
                 <tr>
			    	<td class="label">文章：</td>
			    	<td class="controler">
			    		<textarea name="article" id="article" rows="10" cols="40""></textarea>
			    	</td>
			    </tr>
			    <div id="login_control">  
           <input type="submit" id="btn_login" value="上传博客" onclick="login();name="submit""/> 
             
        </div>
 </form> 
</body>
</html>