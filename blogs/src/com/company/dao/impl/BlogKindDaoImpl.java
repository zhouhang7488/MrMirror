package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.BlogKind;
import com.company.bean.User;
import com.company.dao.IBlogKindDao;
import com.company.service.IBlogKindService;

public class BlogKindDaoImpl extends BaseDao implements IBlogKindDao {

	@Override
	public List<BlogKind> findList() {
		List<BlogKind> list = new ArrayList<BlogKind>();
		try {
			super.regist();
			super.connection();
			String sql = "select * from blogkind";
			super.getPst(sql);
			super.rs = super.pstmt.executeQuery();
			while (rs.next()) {
				BlogKind kind = new BlogKind();
				kind.setKid(rs.getInt(1));
				kind.setName(rs.getString(2));
				list.add(kind);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return list;
	}

	@Override
	public BlogKind find(int kid) {
		BlogKind blogKind = null;
		try {
			super.connection();
			String sql = "select * from BlogKind where kid = ?";
			super.getPst(sql);
			pstmt.setInt(1, kid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				blogKind = new BlogKind(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.close();
		}
		return blogKind;
	}
}
