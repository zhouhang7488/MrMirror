package com.company.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Blog;
import com.company.dao.IBlogDao;

public class BlogDaoImpl extends BaseDao implements IBlogDao {

	@Override
	public int add(Blog blog) {
		int i = 0;
		try {
			super.regist();
			super.connection();
			String sql = "insert into blog(kid,uid,`title`,`schema`,content,datetime) values(?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setInt(1, blog.getKid());
			pstmt.setInt(2, blog.getUid());
			pstmt.setString(3, blog.getTitle());
			pstmt.setString(4, blog.getSchema());
			pstmt.setString(5, blog.getContent());
			pstmt.setDate(6, new Date(blog.getDatetime().getTime()));
			i = super.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return i;
	}

	@Override
	public List<Blog> findList() {
		List<Blog> list = new ArrayList<Blog>();
		try {
			super.regist();
			super.connection();
			String sql = "select * from blog order by `bid` desc";
			super.getPst(sql);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				Blog blog = new Blog(rs.getInt(1), rs.getInt(2), rs.getInt(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),rs.getDate(8));
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public List<Blog> findHotList() {
		List<Blog> list = new ArrayList<Blog>();
		try {
			super.regist();
			super.connection();
			String sql = "select * from blog order by `clicks` desc limit 0,2";
			super.getPst(sql);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				Blog blog = new Blog(rs.getInt(1), rs.getInt(2), rs.getInt(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),rs.getDate(8));
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public List<Blog> findIndexList() {
		List<Blog> list = new ArrayList<Blog>();
		try {
			super.regist();
			super.connection();
			String sql = "select * from blog order by `bid` desc limit 0,2";
			super.getPst(sql);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				Blog blog = new Blog(rs.getInt(1), rs.getInt(2), rs.getInt(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),rs.getDate(8));
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public List<Blog> findList(int uid) {
		List<Blog> list = new ArrayList<Blog>();
		Blog blog = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from blog where uid=?";
			super.getPst(sql);
			pstmt.setInt(1, uid);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				blog = getBlog(rs);
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public List<Blog> findKindList(int kid) {
		
		return null;
	}

	@Override
	public Blog find(int id) {
		Blog blog = null;
		try {
			super.regist();
			super.connection();
			String sql = "select * from blog where bid=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				blog = getBlog(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return blog;
	}

	@Override
	public int delete(int id) {
		int i=0;
		try {
			super.regist();
			super.connection();
			String sql = "delete from blog where bid=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return i;
	}

	@Override
	public int update(Blog blog) {
		int i=0;
		try {
			super.regist();
			super.connection();
			String sql = "update from blog set kid=?,`title`=?,`schema`=?,`content`=? where bid=?";
			super.getPst(sql);
			pstmt.setInt(1, blog.getKid());
			pstmt.setString(2, blog.getTitle());
			pstmt.setString(3, blog.getSchema());
			pstmt.setString(4, blog.getContent());
			pstmt.setInt(5, blog.getBid());
			i=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return i;
	}
	public Blog getBlog(ResultSet rs) throws SQLException {
		Blog blog = new Blog(rs.getInt(1), rs.getInt(2), rs.getInt(3),
				rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),rs.getDate(8));
		return blog;
	}
}
