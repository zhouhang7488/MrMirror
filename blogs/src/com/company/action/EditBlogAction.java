package com.company.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.User;
import com.company.service.IBlogKindService;
import com.company.service.IBlogService;
import com.company.service.impl.BlogKindServiceImpl;
import com.company.service.impl.BlogServiceImpl;

/**
 * @author ZH
 * @category 博客编辑控制器
 * @category 1.删除博客，2.准备编辑，3.保存编辑信息
 */
@WebServlet("/editblog.action")
public class EditBlogAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EditBlogAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IBlogService blogService = new BlogServiceImpl();
		IBlogKindService blogKindService = new BlogKindServiceImpl();
		String type = request.getParameter("type");
		HttpSession session = request.getSession();
		Object obj = request.getParameter("user");
		int id = Integer.valueOf(request.getParameter("bid"));
		if(obj!=null){
			User user=(User)obj;
			if(type.equals("1")){
				boolean flag = blogService.delete(id);
				response.sendRedirect("personbloglist.action?uid="+user.getUid());
			}else if(type.equals("2")){
				
			}else if(type.equals("3")){
				
			}
		}else{
			response.sendRedirect("index.action");
		}
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
