package com.company.service.impl;

import java.util.List;

import com.company.bean.Area;
import com.company.dao.IAreaDao;
import com.company.dao.impl.AreaDaoImpl;
import com.company.service.IAreaService;

/**
 * @author ZH
 * @category 区县业务逻辑实现类
 */
public class AreaServiceImpl implements IAreaService {

	IAreaDao areaDao = new AreaDaoImpl();
	@Override
	public List<Area> findAreasByCid(String cityId) {
		return areaDao.findAreasByCid(cityId);
	}

	@Override
	public Area findObject(String areaId) {
		return null;
	}

}
