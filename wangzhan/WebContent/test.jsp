<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
<meta charset="utf-8">
<title>系统注册</title>
<body>  
<div id="login_frame">  
 <%@page import="java.sql.*" %> 

  
<ul>
<li><p><b></b>
<%

String name = request.getParameter("username");
%>

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
	              {
	            	  i=1;
	            	  break;
	              }
	              
          } 
		      if(i==1)
		      {%>  
		    	  <p>用户名和密码相同，无法注册</p>
		     <%  }
		      if(i!=1)
				 {%>
				    	 <p>注册成功</p>
				     <%  }
		      String sql_1="INSERT INTO user(用户名,密码)" +
	                   " VALUES ('"+name+"', '"+pass+"')";//插入操作...
	          stmt.executeUpdate(sql_1); 
	          
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
		      <div id="login_control">   
		      <a id="forget_pwd" href="qw.jsp">返回登录界面</a>
		      
</div>   
</p></li>
</ul>
</div>  
  
</body>  
</html> 