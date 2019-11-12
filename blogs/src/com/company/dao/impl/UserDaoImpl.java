package com.company.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.User;
import com.company.dao.IUserDao;

/**
 * @author ZH
 * @category 数据访问实现类
 */
public class UserDaoImpl extends BaseDao implements IUserDao {

	@Override
	public User find(int id, String pass) {
		return null;
	}

	@Override
	public User find(String name, String pass) {
		
		User user = null;
		try {
			super.regist();
			super.connection();
			String sql = "select uid,name,pass from user where name=? and pass=?";
			super.getPst(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			super.rs = pstmt.executeQuery();
			while(rs.next()){
				user = new User( rs.getInt(1),rs.getString(2), rs.getString(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return user; 
	}

	@Override
	public int add(User user) {
		int i = 0;
		try {
			super.regist();
			super.connection();
			String sql = "insert into user(name,pass,sex,age,tel,inputdate,ip) values(?,?,?,?,?,?,?)";
			super.getPst(sql);
			super.pstmt.setString(1, user.getName());
			super.pstmt.setString(2, user.getPass());
			super.pstmt.setString(3, user.getSex());
			super.pstmt.setInt(4, user.getAge());
			super.pstmt.setString(5, user.getTel());
			pstmt.setDate(6, new Date(user.getInputdate().getTime()));
			super.pstmt.setString(7, user.getIp());
			i = super.pstmt.executeUpdate();//增加一个用户
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return i;
	}

	@Override
	public List<User> findUserList() {
		List<User> list = new ArrayList<User>();
		try {
			super.regist();
			super.connection();
			String sql = "select `uid`,`name`,pass,sex,age,tel,ip from user where uid<>1";
			super.getPst(sql);
			super.rs = super.pstmt.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}
	

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public User find(int id) {
		User user = null;
		try {
			super.connection();
			String sql = "select uid,name,pass,sex,age,tel,provinceid,cityid,areaid,ip from User where uid = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = createUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return user;
	}

	@Override
	public int update(User user) {
		return 0;
	}

	@Override
	public User findByUserName(String name) {
		boolean flag;
		User user = null;
		try {
			super.regist();
			super.connection();
			String sql = "select name from user where name=?";
			super.getPst(sql);
			super.pstmt.setString(1, name);
			super.rs=pstmt.executeQuery();
			
			while(rs.next()){
				user = new User( rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	private User createUser(ResultSet rs) throws SQLException{
		User user = new User();
		user.setUid(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setPass(rs.getString(3));
		user.setSex(rs.getString(4));
		user.setAge(rs.getInt(5));
		user.setTel(rs.getString(6));
		user.setProviceId(rs.getString(7));
		user.setCityId(rs.getString(8));
		user.setAreaId(rs.getString(9));
		user.setIp(rs.getString(10));
		return user;
	}
}