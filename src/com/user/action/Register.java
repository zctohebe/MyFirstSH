package com.user.action;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.user.entity.Student;
import com.user.service.StudentService;
import com.user.serviceImpl.StudentServiceImpl;

//ʵ��ActionSupport action���װ��HTTP���������������Ӧ�ð��������������Ӧ�����ԣ���Ϊ�����ṩget��set����
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
		//nihao develop
		Student stu = new Student();
		stu.setUsername(username);
		stu.setPassword(password);
		stu.setAge(age);
		java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
		stu.setDate(date);
		StudentService ss = new StudentServiceImpl();
		ss.saveStudent(stu);
		return SUCCESS;
	}
}