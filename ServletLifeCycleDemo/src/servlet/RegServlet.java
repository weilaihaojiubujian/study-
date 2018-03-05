package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Users;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		Users u=new Users();
		String username;
		String mypassword;
		String gender;
		//Date birthday;
		String []favorites;
		String email;
		String introduce;
		String isAccept;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			username=request.getParameter("username");
			mypassword=request.getParameter("mypassword");
			gender=request.getParameter("gender");
			email=request.getParameter("email");
			introduce=request.getParameter("introduce");
			//birthday = sdf.parse(request.getParameter("birthday"));
			if(request.getParameterValues("isAccpet")!=null)
			{
			  isAccept = request.getParameter("isAccept");
			}
			else
			{
			  isAccept = "false";
			}
			//用来获取多个复选按钮的值
			favorites = request.getParameterValues("favorite");
			u.setUsername(username);
			u.setMypassword(mypassword);
			u.setGender(gender);
			u.setEmail(email);
			u.setFavorites(favorites);
			u.setIntroduce(introduce);
			if(isAccept.equals("true"))
			{
				u.setFlag(true);
			}
			else
			{
				u.setFlag(false);
			}
            //u.setBirthday(birthday);
			
			//把注册成功的用户对象保存在session中
			request.getSession().setAttribute("regUser", u);
			//跳转到注册成功页面
			System.out.println("进入成功");
			request.getRequestDispatcher("../userinfo.jsp").forward(request,response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

		//doGet(request, response);
	}

}
