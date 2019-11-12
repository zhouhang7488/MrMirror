package com.company.service.impl;

import java.util.List;

import com.company.bean.Province;
import com.company.dao.IProvinceDao;
import com.company.dao.impl.ProvinceDaoImpl;
import com.company.service.IProvinceService;

public class ProvinceServiceImpl implements IProvinceService {

	IProvinceDao provinceDao = new ProvinceDaoImpl();
	@Override
	public List<Province> findAll() {
		return provinceDao.findAll();
	}

	@Override
	public Province findObject(String provinceId) {
		return null;
	}

}
