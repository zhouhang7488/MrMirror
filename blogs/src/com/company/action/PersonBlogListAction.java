package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.Blog;
import com.company.bean.User;
import com.company.service.IBlogService;
import com.company.service.IUserService;
import com.company.service.impl.BlogServiceImpl;
import com.company.service.impl.UserServiceImpl;
import com.company.vo.BlogVO;

/**
 * @author ZH
 * @category 个人博客列表控制器
 */
@WebServlet("/personbloglist.action")
public class PersonBlogListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PersonBlogListAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入personbloglist.action");
		//创建业务逻辑对象
		IUserService userService = new UserServiceImpl();
		IBlogService blogService = new BlogServiceImpl();
		//得到用户id
		String uidStr = request.getParameter("uid");
		System.out.println("当前用户Uid:"+uidStr);
		if (uidStr!=null&&!uidStr.equals("")) {
			int uid = Integer.valueOf(uidStr);
			User user = userService.find(uidStr);
			List<BlogVO> list = blogService.findList(uid);
			System.out.println("list.size:"+list.size());
			//将用户对象、博客列表对象放入到作用域中
			request.setAttribute("user", user);
			request.setAttribute("list", list);
			
			//转发
			request.getRequestDispatcher("personblogschemalist.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("404.jsp").forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
