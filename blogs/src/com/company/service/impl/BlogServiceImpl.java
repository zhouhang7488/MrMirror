package com.company.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.dao.IBlogDao;
import com.company.dao.IBlogKindDao;
import com.company.dao.ICommentDao;
import com.company.dao.IUserDao;
import com.company.dao.impl.BlogDaoImpl;
import com.company.dao.impl.BlogKindDaoImpl;
import com.company.dao.impl.UserDaoImpl;
import com.company.bean.Blog;
import com.company.bean.BlogKind;
import com.company.bean.User;
import com.company.service.IBlogService;
import com.company.vo.BlogVO;

public class BlogServiceImpl implements IBlogService {

	private IBlogDao blogDao = new BlogDaoImpl();
	private IUserDao userDao = new UserDaoImpl();
	private IBlogKindDao blogKindDao = new BlogKindDaoImpl();
	
	public void change(List<BlogVO> voList,List<Blog> blogList){
		for (Blog blog : blogList) {
			User user = userDao.find(blog.getUid());
			String authorName = user.getName();
			BlogKind blogKind = blogKindDao.find(blog.getKid());
			String kindName = blogKind.getName();
			BlogVO vo = new BlogVO(blog.getBid(), blog.getKid(), blog.getUid(),
					kindName, authorName, blog.getTitle(), blog.getSchema(),
					blog.getContent(), blog.getClicks(), blog.getDatetime());
			voList.add(vo);
		}
	}
	@Override
	public boolean delete(int id) {
		
		return blogDao.delete(id)>0?true:false;
	}

	@Override
	public boolean update(int id, String title, String kind, String schema, String content) {
		int kid = Integer.valueOf(kind);
		Blog blog = blogDao.find(id);
		blog.setTitle(title);
		blog.setSchema(schema);
		blog.setContent(content);
		return blogDao.update(blog)>0?true:false;
	}

	@Override
	public boolean add(Blog blog) {
		
		return blogDao.add(blog)>0?true:false;
	}
	public boolean add(int uid,String kind,String title,String schema,String content){
		int kid = Integer.valueOf(kind);
		int clicks = 0;
		Blog blog = new Blog(kid,uid,title, schema, content,clicks, new Date());
		int i = blogDao.add(blog);
		return i>0?true:false;
	};
	@Override
	public List<BlogVO> findList() {
		
		List<BlogVO> voList = new ArrayList<BlogVO>();
		List<Blog> blogList = blogDao.findList();
		change(voList, blogList);
		return voList;
	}

	@Override
	public List<BlogVO> findHotList() {
		List<BlogVO> voList = new ArrayList<BlogVO>();
		List<Blog> blogList = blogDao.findHotList();
		change(voList, blogList);
		return voList;
	}

	@Override
	public List<BlogVO> findIndexList() {
		List<BlogVO> voList = new ArrayList<BlogVO>();
		List<Blog> blogList = blogDao.findIndexList();
		change(voList, blogList);
		return voList;
	}

	@Override
	public List<BlogVO> findList(int uid) {
		List<BlogVO> voList = new ArrayList<BlogVO>();
		List<Blog> blogList = blogDao.findList(uid);
		change(voList, blogList);
		return voList;
	}

	@Override
	public List<BlogVO> findKindList(int kid) {
		
		return null;
	}

	@Override
	public Blog find(int id) {
		
		return blogDao.find(id);
	}

}
