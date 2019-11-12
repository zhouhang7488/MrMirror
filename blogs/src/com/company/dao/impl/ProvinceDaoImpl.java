package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Province;
import com.company.dao.IProvinceDao;

public class ProvinceDaoImpl extends BaseDao implements IProvinceDao {

	@Override
	public List<Province> findAll() {
		Province province = null;
		List<Province> list = new ArrayList<Province>();
		try {
			super.regist();
			super.connection();
			String sql = "select provinceID,province from province";
			super.getPst(sql);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				province = new Province(rs.getInt(1), rs.getString(2));
				list.add(province);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public Province findObject(String provinceId) {
		return null;
	}

}
