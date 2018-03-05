package com.runoob.test;

import java.sql.*;
public class mt {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/text?useUnicode=true&characterEncoding=utf-8&useSSL=false";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "1004758012";

	   public static void main(String[] args) {
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
		      sql = "SELECT ”√ªß√˚, √‹¬Î FROM user";
		      ResultSet rs = stmt.executeQuery(sql);
}
