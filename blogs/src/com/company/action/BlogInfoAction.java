package com.company.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.Blog;
import com.company.service.IBlogService;
import com.company.service.impl.BlogServiceImpl;

/**
 * @author ZH
 * @category 博客详情控制器
 */
@WebServlet("/bloginfo.action")
public class BlogInfoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BlogInfoAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建博客业务逻辑对象
		IBlogService blogService = new BlogServiceImpl();
		//接收博客ID
		String idStr = request.getParameter("bid");
		System.out.println(idStr);
		if(idStr!=null&&!idStr.equals("")){
			int bid = Integer.valueOf(idStr);
			System.out.println(idStr);
			Blog blog = blogService.find(bid);
			request.setAttribute("blog", blog);
			request.getRequestDispatcher("bloginfo.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("404.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
