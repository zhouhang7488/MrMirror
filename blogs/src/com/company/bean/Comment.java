package com.company.bean;

import java.util.Date;

/**
 * @author ZH
 * @category 评论类
 */
public class Comment {
	/**
	 * 评论编号
	 */
	private int cid;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 博客编号
	 */
	private int bid;
	/**
	 * 评论者计算机IP
	 */
	private String ip;
	/**
	 * 评论时间
	 */
	private Date datetime;
	/**
	 * 评论详情
	 */
	private String content;
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Comment(int cid, int uid, int bid, String ip, Date datetime, String content) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.datetime = datetime;
		this.content = content;
	}


	public Comment(int cid, int uid, int bid, String ip, Date datetime) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.datetime = datetime;
	}
	
}
