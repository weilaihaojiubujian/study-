<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
<meta charset="utf-8">
<title>系统登陆</title>
<body>  
<div id="login_frame">  
 <%@page import="java.sql.*" %> 

  
<ul>
<li><p><b></b>
<%

String name = request.getParameter("username");
%>
  <p>尊敬的 <%=session.getAttribute("username") %></p>
</p></li>
<li><p>
<%

String pass =request.getParameter("pass");
%>
 
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
		      sql = "SELECT 用户名, 密码 FROM user";
		      ResultSet rs = stmt.executeQuery(sql);
		      int i=0;
		      while(rs.next()){  
	            
                  String first=rs.getString("用户名");
	              String last=rs.getString("密码"); 
	              if(first.compareTo(name)==0 && last.compareTo(pass)==0)
	              { session.setAttribute("username",name);
	            	  i=1;
	            	  break;
	              }
	              
          } 
		      if(i==1)
		      {%>
		    	  <p>登陆成功</p>
		    <br>
	
   <a href="page1.jsp" rel="external nofollow" rel="external nofollow" >page1</a>
	 <% 
       request.setCharacterEncoding("utf-8");
       //首先判断用户是否选择了记住登录状态
       String[] isUseCookies = request.getParameterValues("isUseCookie");
       if(isUseCookies!=null&&isUseCookies.length>0)
       {
          //把用户名和密码保存在Cookie对象里面
          String username = URLEncoder.encode(request.getParameter("username"),"utf-8");
          //使用URLEncoder解决无法在Cookie当中保存中文字符串问题
          String password = URLEncoder.encode(request.getParameter("pass"),"utf-8");
          
          Cookie usernameCookie = new Cookie("username",username);
          Cookie passwordCookie = new Cookie("pass",password);
          usernameCookie.setMaxAge(864000);
          passwordCookie.setMaxAge(864000);//设置最大生存期限为10天
          response.addCookie(usernameCookie);
          response.addCookie(passwordCookie);
       }
       else
       {
          Cookie[] cookies = request.getCookies();
          if(cookies!=null&&cookies.length>0)
          {
             for(Cookie c:cookies)
             {
                if(c.getName().equals("username")||c.getName().equals("pass"))
                {
                    c.setMaxAge(0); //设置Cookie失效
                    response.addCookie(c); //重新保存。
                }
             }
          }
       }
    %>
   	    <p> <a href="users.jsp" target="_blank">查看用户信息</a></p>
		    <br>
		     <%  }
		      else
		      {%>
		    	 <p>登陆失败</p>
		     <%  }
		      rs.close();
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		 
		
		
		      %>   
		   <%--    response.sendRedirect("page1.jsp"); 将页面重新跳转到page1--%>
</p></li>
</ul>
</div>  
  
</body>  
</html> 