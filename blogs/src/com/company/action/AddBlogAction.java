package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.bean.BlogKind;
import com.company.bean.User;
import com.company.service.IBlogKindService;
import com.company.service.IBlogService;
import com.company.service.impl.BlogKindServiceImpl;
import com.company.service.impl.BlogServiceImpl;

/**
 * @author ZH
 * @category 增加博客控制器 type:1.准备创建,2.保存博客
 */
@WebServlet("/addblog.action")
public class AddBlogAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBlogAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("user");
		if (obj != null) {
			User user = (User) obj;
			IBlogService blogService = new BlogServiceImpl();
			IBlogKindService blogKindService = new BlogKindServiceImpl();
			if (type.equals("1")) {
				List<BlogKind> blogKinds = blogKindService.findList();
				System.out.println(blogKinds.size());
				request.setAttribute("blogKinds", blogKinds);
				request.getRequestDispatcher("addblog.jsp").forward(request, response);

			} else if (type.equals("2")) {
				String kind = request.getParameter("kind");
				String title = request.getParameter("title");
				String schema = request.getParameter("schema");
				String content = request.getParameter("c1");
				boolean flag = blogService.add(user.getUid(), kind, title, schema, content);
				if (flag) {
					// 添加成功
					response.sendRedirect("personbloglist.action?uid=" + user.getUid());
				} else {
					request.getRequestDispatcher("error.jsp").forward(request, response);
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
