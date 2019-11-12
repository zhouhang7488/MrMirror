package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.City;
import com.company.bean.Province;
import com.company.dao.ICityDao;

/**
 * @author ZH
 * @category 城市数据访问实现类
 */
public class CityDaoImpl extends BaseDao implements ICityDao {

	@Override
	public List<City> findCitiesByPid(String provinceId) {
		City city = null;
		List<City> list = new ArrayList<City>();
		try {
			super.regist();
			super.connection();
			String sql = "select * from city where provinceID=?";
			super.getPst(sql);
			pstmt.setString(1, provinceId);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				city = new City(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4));
				list.add(city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public City findObject(String cityId) {
		return null;
	}

}
