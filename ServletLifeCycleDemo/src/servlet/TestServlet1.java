package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet1() {
    	System.out.println("TestServlet1���췽����ִ��");
        // TODO Auto-generated constructor stub
    }
    public void destroy(){
    	System.out.println("TestServlet1���ٷ�����ִ��");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("TestServlet1��doget������ִ��");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		
		out.println("<strong>Hello Servlet!</strong><br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("TestServlet1��dopost������ִ��");
		doGet(request, response);//��dopostִ����doget��ͬ�Ĳ���
	}
	public void init() throws ServletException{
		System.out.println("TestServlet1�ĳ�ʼ��������ִ��");
	}

}
