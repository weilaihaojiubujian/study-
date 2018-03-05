<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
request.setCharacterEncoding("utf-8");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>实现文章上传</title>
</head>
<body>  
<div id="login_frame">  
 <%@page import="java.sql.*" %> 

  
<ul>
<li><p><b></b>
    <hr>
    <% 
    String article=request.getParameter("article");
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
		      sql = "SELECT 作者,文章 FROM wenzhang";
		      ResultSet rs = stmt.executeQuery(sql);
		      int i=0;
		      while(rs.next()){  
	            
		    	  String first=rs.getString("作者");
	              String wenben=rs.getString("文章");
	              
	              if(first.compareTo(username)==0 && wenben.compareTo(article)==0)
	              {
	            	  
	            	  
	            
	            	  i=1;
	            	  
	            	  break;
	              }
	              
          } 
		      
		      if(i!=1)
		      {%>  
		    	  <p>上传成功</p>
		     <% 
		    
		     String sql_1="INSERT INTO wenzhang(作者,文章)" +
	                   " VALUES ('"+username+"', '"+article+"')";//插入操作...
	          stmt.executeUpdate(sql_1); 
		   }
		      if(i==1)
				 {%>
				    	 <p>上传失败</p>
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
		      <div id="login_control">  
		      <a id="forget_pwd" href="gongneng.jsp">返回文章界面</a> 
		      <a id="forget_pwd" href="qw.jsp">返回登录界面</a>
		      
</div>   
</p></li>
</ul>
</div>  
  
</body>  
</html> 