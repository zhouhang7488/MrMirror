package com.company.bean;

import java.util.Date;

/**
 * @author ZH
 * @category 用户类
 */
public class User {
/**
 * 用户编号
 */
private int uid;
/**
 * 用户名
 */
private String name;
/**
 * 密码
 */
private String pass;
/**
 * 年龄
 */
private int age;
/**
 * 性别
 */
private String sex;
/**
 * 电话
 */
private String tel;
/**
 * 省份编号
 */
private String proviceId;
/**
 * 城市编号
 */
private String cityId;
/**
 * 县区编号
 */
private String areaId;
/**
 * 注册日期
 */
private Date inputdate;
/**
 * IP地址
 */
private String ip;


public User() {
	super();
}


public User(String name) {
	super();
	this.name = name;
}


public User(String name, String pass) {
	super();
	this.name = name;
	this.pass = pass;
}


public User(int uid, String name, String pass) {
	super();
	this.uid = uid;
	this.name = name;
	this.pass = pass;
}


public User(int uid, String name, String pass, int age, String tel, String proviceId, String cityId, String areaId, Date inputdate,
		String ip) {
	super();
	this.uid = uid;
	this.name = name;
	this.pass = pass;
	this.age = age;
	this.tel = tel;
	this.proviceId = proviceId;
	this.cityId = cityId;
	this.areaId = areaId;
	this.inputdate = inputdate;
	this.ip = ip;
}


public User(int uid, String name, String pass, String sex, int age, String tel, Date inputdate, String ip) {
	super();
	this.uid = uid;
	this.name = name;
	this.pass = pass;
	this.sex = sex;
	this.age = age;
	this.tel = tel;
	this.inputdate = inputdate;
	this.ip = ip;
}





public User(String name, String pass, String sex, int age, String tel, Date inputdate, String ip) {
	super();
	this.name = name;
	this.pass = pass;
	this.age = age;
	this.sex = sex;
	this.tel = tel;
	this.inputdate = inputdate;
	this.ip = ip;
}
public User(String name, String pass, String sex, int age, String tel, String ip) {
	super();
	this.name = name;
	this.pass = pass;
	this.age = age;
	this.sex = sex;
	this.tel = tel;
	this.ip = ip;
}


public User(String name, String pass, String age, String sex, String tel, Date inputdate, String ip) {
}


public User(int uid, String name, String pass, String sex, int age, String tel, String ip) {
	super();
	this.uid = uid;
	this.name = name;
	this.pass = pass;
	this.age = age;
	this.sex = sex;
	this.tel = tel;
	this.ip = ip;
}


public int getUid() {
	return uid;
}


public void setUid(int uid) {
	this.uid = uid;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getSex() {
	return sex;
}


public void setSex(String sex) {
	this.sex = sex;
}


public String getTel() {
	return tel;
}


public void setTel(String tel) {
	this.tel = tel;
}


public String getProviceId() {
	return proviceId;
}


public void setProviceId(String id) {
	this.proviceId = id;
}


public String getCityId() {
	return cityId;
}


public void setCityId(String cityId) {
	this.cityId = cityId;
}


public String getAreaId() {
	return areaId;
}


public void setAreaId(String areaId) {
	this.areaId = areaId;
}


public Date getInputdate() {
	return inputdate;
}


public void setInputdate(Date inputdate) {
	this.inputdate = inputdate;
}


public String getIp() {
	return ip;
}


public void setIp(String ip) {
	this.ip = ip;
}


}



