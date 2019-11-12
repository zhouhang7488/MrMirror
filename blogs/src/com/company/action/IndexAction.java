package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.bean.BlogKind;
import com.company.service.IBlogKindService;
import com.company.service.IBlogService;
import com.company.service.impl.BlogKindServiceImpl;
import com.company.service.impl.BlogServiceImpl;
import com.company.vo.BlogVO;

/**
 * @author ZH
 * @category 首页控制器
 */
@WebServlet("/index.action")
public class IndexAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入index.action");
		//创建业务逻辑对象
		IBlogService blogService = new BlogServiceImpl();
		IBlogKindService blogKindService = new BlogKindServiceImpl();
		//调用业务逻辑对象方法，得到返回值
		List<BlogKind> blogKindList = blogKindService.findList();
		List<BlogVO> hotList = blogService.findHotList();
		List<BlogVO> indexList = blogService.findIndexList();
		//将值放到作用域中
		request.getSession().setAttribute("blogKindList", blogKindList);
		request.setAttribute("hotList", hotList);
		request.setAttribute("indexList", indexList);
		//转发
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
