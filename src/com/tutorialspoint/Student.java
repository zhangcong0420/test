package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	public Integer getAge() {
		return age;
	}
	@Autowired(required=false)
	public void setAge(Integer age) {
		System.out.println("setAge");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
}
