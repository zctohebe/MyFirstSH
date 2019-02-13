package com.user.action;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.user.entity.Student;
import com.user.service.StudentService;
import com.user.serviceImpl.StudentServiceImpl;

//实现ActionSupport action类封装了HTTP请求参数，类里面应该包含与请求参数对应的属性，并为属性提供get，set方法
public class Register extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int age;
	private Date date;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}