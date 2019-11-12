package com.company.bean;

import java.util.Date;

/**
 * @author ZH
 * @category 博客类
 */
public class Blog {
	/**
	 * 博客编号
	 */
	private int bid;
	/**
	 * 博客类型编号
	 */
	private int kid;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 博客标题
	 */
	private String title;
	/**
	 * 博客摘要
	 */
	private String schema;
	/**
	 * 博客详情
	 */
	private String content;
	/**
	 * 博客点击量
	 */
	private int clicks;
	/**
	 * 博客发表时间
	 */
	private Date datetime;
	
	
	public Blog() {
		super();
	}


	public Blog(int bid, int kid, int uid, String title, String schema, String content, int clicks, Date datetime) {
		super();
		this.bid = bid;
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.clicks = clicks;
		this.datetime = datetime;
	}


	public Blog( String title, String schema, String content, int clicks, Date datetime) {
		super();
		this.bid = bid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.clicks = clicks;
		this.datetime = datetime;
	}


	public Blog(String title, String schema, String content, Date datetime) {
		super();
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.datetime = datetime;
	}


	public Blog(int kid, int uid, String title, String schema, String content, Date datetime) {
		super();
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.datetime = datetime;
	}


	public Blog(int kid, int uid, String title, String schema, String content, int clicks, Date datetime) {
		super();
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.schema = schema;
		this.content = content;
		this.clicks = clicks;
		this.datetime = datetime;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public int getKid() {
		return kid;
	}


	public void setKid(int kid) {
		this.kid = kid;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSchema() {
		return schema;
	}


	public void setSchema(String schema) {
		this.schema = schema;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getClicks() {
		return clicks;
	}


	public void setClicks(int clicks) {
		this.clicks = clicks;
	}


	public Date getDatetime() {
		return datetime;
	}


	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}


