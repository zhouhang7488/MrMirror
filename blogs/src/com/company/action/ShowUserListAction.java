package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.service.impl.UserServiceImpl;

/**
 * @author ZH
 * @category 用户列表控制器
 */
@WebServlet("/userlist.action")
public class ShowUserListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowUserListAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		//调用业务逻辑对象，得到集合列表
		List<User> list = userService.findUserList();
		//将集合列表放入到?作用域中
		request.setAttribute("list", list);
		//转发跳转
		request.getRequestDispatcher("userlist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
