package com.company.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CharEncodingFilter
 */
/**
 * @author ZH
 * @category 字符集过滤器
 */
@WebFilter("/*")
public class CharEncodingFilter implements Filter {

	private final static String CHARENCODING = "utf-8";
    public CharEncodingFilter() {
        
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse rsp = (HttpServletResponse)response;
		req.setCharacterEncoding(CHARENCODING);
		rsp.setCharacterEncoding(CHARENCODING);
		chain.doFilter(req, rsp);;
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
