package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�̳���HelloServlet
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("����get����");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("<strong>Hello Servlet!</strong><br>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("����post����");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("<strong>Hello Servlet!</strong><br>");
	}

}