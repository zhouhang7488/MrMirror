package com.company.bean;

/**
 * @author ZH
 * @category 博客类型类
 */
public class BlogKind {
	/**
	 * 博客类型编号
	 */
	private int kid;
	/**
	 * 博客类型名称
	 */
	private String name;
	
	public BlogKind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlogKind(int kid, String name) {
		super();
		this.kid = kid;
		this.name = name;
	}

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
