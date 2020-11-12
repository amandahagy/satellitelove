package com.shiningstars.satellitelove.entity;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private String password;
	private Calendar birthday;
	private String name;
	private Calendar creationDate;
	private int sun;
	private int asc;
	private int house5;
	private int house7;
	private int moon;
	private int venus;
	private int mars;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
	public int getSun() {
		return sun;
	}
	public void setSun(int sun) {
		this.sun = sun;
	}
	public int getAsc() {
		return asc;
	}
	public void setAsc(int asc) {
		this.asc = asc;
	}
	public int getHouse5() {
		return house5;
	}
	public void setHouse5(int house5) {
		this.house5 = house5;
	}
	public int getHouse7() {
		return house7;
	}
	public void setHouse7(int house7) {
		this.house7 = house7;
	}
	public int getMoon() {
		return moon;
	}
	public void setMoon(int moon) {
		this.moon = moon;
	}
	public int getVenus() {
		return venus;
	}
	public void setVenus(int venus) {
		this.venus = venus;
	}
	public int getMars() {
		return mars;
	}
	public void setMars(int mars) {
		this.mars = mars;
	}
}