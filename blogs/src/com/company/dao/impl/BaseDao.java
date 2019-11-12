package com.company.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZH
 * @category 数据访问层基类
 */
public class BaseDao {

	/**
	 * 数据库连接对象
	 */
	protected Connection conn;
	/**
	 * 预编译指令
	 */
	protected PreparedStatement pstmt;
	/**
	 * 结果集
	 */
	protected ResultSet rs;
	protected void regist(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	protected void connection(){
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blogmanager","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void getPst(String sql){
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void close(){
		try {
			if(rs!=null){
				rs.close();
			}
			if(conn!=null){
				conn.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
