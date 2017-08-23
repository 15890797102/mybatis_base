package com.starry.entity;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//成员变量
	private int id;
	private String userName;
	private String phone;
	private String email;
	private String userRemark;
	private String password;
	
	//构造方法
	public User() {
		super();
	}
	public User(int id, String userName, String phone, String email, String userRemark, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.userRemark = userRemark;
		this.password = password;
	}
	
	//属性
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserRemark() {
		return userRemark;
	}
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//成员方法
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", phone=" + phone + ", email=" + email + ", userRemark="
				+ userRemark + ", password=" + password + "]";
	}
	
	

}
