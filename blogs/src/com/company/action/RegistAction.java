package com.company.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.User;
import com.company.dao.IUserDao;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author ZH
 * @category 用户注册控制器
 */
@WebServlet(description = "注册", urlPatterns = { "/regist.action" })
public class RegistAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		
		//接收数据
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String tel = request.getParameter("tel");
		String ip = request.getRemoteAddr();
		//调用业务逻辑方法
		boolean flag = userService.add(name,pass,sex,age,tel,ip);
		if(flag){
			//注册成功
			response.sendRedirect("login.jsp");
		}else{
			request.setAttribute("mess", "注册失败");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
