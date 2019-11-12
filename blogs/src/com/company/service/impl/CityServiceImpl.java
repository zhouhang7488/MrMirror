package com.company.service.impl;

import java.util.List;

import com.company.bean.City;
import com.company.dao.ICityDao;
import com.company.dao.impl.CityDaoImpl;
import com.company.service.ICityService;

/**
 * @author ZH
 * @category 城市业务逻辑实现类
 */
public class CityServiceImpl implements ICityService {

	@Override
	public List<City> findCitiesByPid(String provinceId) {
		ICityDao cityDao = new CityDaoImpl();
		return cityDao.findCitiesByPid(provinceId);
	}

	@Override
	public City findObject(String cityId) {
		return null;
	}

}
