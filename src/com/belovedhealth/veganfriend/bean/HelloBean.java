package com.belovedhealth.veganfriend.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {
	private String name;
	
	public void sayHello() {
		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
