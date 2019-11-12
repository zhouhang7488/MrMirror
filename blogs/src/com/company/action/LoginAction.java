package com.company.action;

import java.io.Console;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author ZH
 * @category 登录控制器
 */
@WebServlet(description = "登录", urlPatterns = { "/login.action" })
public class LoginAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* System.out.println("in"); */

		// 创建业务逻辑对象
		IUserService userService = new UserServiceImpl();

		// 获取参数
		String name = request.getParameter("n");
		String pass = request.getParameter("p");

		// 传递业务逻辑对象，得到返回值
		User user = userService.findByName(name, pass);
		if (user != null) {
			System.out.println("登录成功");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			request.getRequestDispatcher("index.action").forward(request, response);
		} else {
			String mess = "用户名或密码错误";
			request.setAttribute("mess", mess);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
