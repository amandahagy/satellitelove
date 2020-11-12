package com.belovedhealth.veganfriend.entity;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	//password
	private String pwd;
	private Calendar creationDate;
	
	public User() {
		creationDate = Calendar.getInstance();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
}