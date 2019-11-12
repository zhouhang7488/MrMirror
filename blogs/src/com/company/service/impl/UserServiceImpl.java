package com.company.service.impl;

import java.util.Date;
import java.util.List;

import com.company.bean.User;
import com.company.dao.IUserDao;
import com.company.dao.impl.UserDaoImpl;
import com.company.service.IUserService;

/**
 * @author ZH
 * @category 用户业务逻辑实现类
 */
public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();
	@Override
	public User find(String id, String pass) {
		
		return null;
	}

	@Override
	public User findByName(String name, String pass) {
		User user = null;
		if(name!=null&&pass!=null&&!name.equals("")&&!pass.equals("")){
			user=userDao.find(name, pass);
		}
		return user;
	}

	@Override
	public boolean add(User user) {
		return userDao.add(user)>0?true:false;
	}

	@Override
	public List<User> findUserList() {
		return userDao.findUserList();
	}

	@Override
	public boolean delete(String id) {
		return false;
	}

	@Override
	public User find(String id) {
		User user = null;
		if(id!=null&&!id.equals("")){
			int uid = Integer.valueOf(id);
			user=userDao.find(uid);
		}
		return user;
	}

	@Override
	public boolean update(User user) {
		return false;
	}

	@Override
	public boolean findByUserName(String name) {
		return userDao.findByUserName(name)==null?true:false;
	}

	@Override
	public boolean add(String name, String pass, String sex,String age,
			String tel, String ip) {
		int age_int = Integer.valueOf(age);
		User user = new User(name, pass, sex, age_int, tel,new Date(), ip);
		int i = userDao.add(user);
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

}
