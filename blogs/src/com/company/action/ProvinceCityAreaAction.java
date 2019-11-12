package com.company.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.IAreaService;
import com.company.service.ICityService;
import com.company.service.IProvinceService;
import com.company.service.impl.AreaServiceImpl;
import com.company.service.impl.CityServiceImpl;
import com.company.service.impl.ProvinceServiceImpl;

import net.sf.json.JSONObject;

/**
 * @author ZH
 * @category 省市县控制器
 */
@WebServlet("/pca.action")
public class ProvinceCityAreaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProvinceCityAreaAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建业务逻辑对象
		IProvinceService provinceService = new ProvinceServiceImpl();
		ICityService cityService = new CityServiceImpl();
		IAreaService areaService = new AreaServiceImpl();
		//接受type类型参数
		String type = request.getParameter("type");
		//声明集合
		List list = null;
		if(type.equals("1")){
			list=provinceService.findAll();
		}
		if(type.equals("2")){
			String provinceId = request.getParameter("provinceId");
			list=cityService.findCitiesByPid(provinceId);
		}if(type.equals("3")){
			String cityId = request.getParameter("cityId");
			list=areaService.findAreasByCid(cityId);
		}
		//创建JSON对象
		JSONObject json = new JSONObject();
		json.put("list", list);
		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
