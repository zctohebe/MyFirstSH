package com.user.action;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.user.entity.Student;
import com.user.service.StudentService;
import com.user.serviceImpl.StudentServiceImpl;

//瀹炵幇ActionSupport action绫诲皝瑁呬簡HTTP璇锋眰鍙傛暟锛岀被閲岄潰搴旇鍖呭惈涓庤姹傚弬鏁板搴旂殑灞炴�э紝骞朵负灞炴�ф彁渚沢et锛宻et鏂规硶
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
		//nihao
		//buhao
		return SUCCESS;
		//jgsdgjsadgjasj
	}
}