package com.company.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.Area;
import com.company.bean.City;
import com.company.dao.IAreaDao;

/**
 * @author ZH
 * @category 区县数据访问实现类
 */
public class AreaDaoImpl extends BaseDao implements IAreaDao {

	@Override
	public List<Area> findAreasByCid(String cityId) {
		Area area = null;
		List<Area> list = new ArrayList<Area>();
		try {
			super.regist();
			super.connection();
			String sql = "select areaID,areas from areas where cityID=?";
			super.getPst(sql);
			pstmt.setString(1, cityId);
			super.rs=pstmt.executeQuery();
			while(rs.next()){
				area = new Area(rs.getInt(1), rs.getString(2));
				list.add(area);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			super.close();
		}
		return list;
	}

	@Override
	public Area findObject(String areaId) {
		return null;
	}

}
