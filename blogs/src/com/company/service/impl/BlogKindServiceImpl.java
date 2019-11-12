package com.company.service.impl;

import java.util.List;

import com.company.bean.BlogKind;
import com.company.dao.IBlogKindDao;
import com.company.dao.impl.BlogKindDaoImpl;
import com.company.service.IBlogKindService;

public class BlogKindServiceImpl implements IBlogKindService {

	private IBlogKindDao blogKindDao = new BlogKindDaoImpl();
	@Override
	public List<BlogKind> findList() {
		return blogKindDao.findList();
	}

	@Override
	public BlogKind find(int id) {
		return null;
	}

}
