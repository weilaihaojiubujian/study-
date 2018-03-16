package com.imooc.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.service.ListService;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/*
 * 列表页面初始化控制
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//设置编码
		req.setCharacterEncoding("UTF-8");
		//接受页面的值
		String command=req.getParameter("command");
		String description=req.getParameter("description");
		//向页面传值
		req.setAttribute("command",command);
		req.setAttribute("description",description);
		
		ListService listService=new ListService();
		//查询消息列表并传给页面
		try {
			req.setAttribute("messageList", listService.queryMessageList(command,description));
			req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//向页面跳转
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}