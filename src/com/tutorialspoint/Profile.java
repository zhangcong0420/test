package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Qualifier("student1")
	@Autowired
	private Student student;

	public Profile() {
		System.out.println("Inside Profile constructor.");
	}
	public void setStudent(Student student){
		System.out.println("setStudent");
		this.student = student;
	}

	public void printAge() {
		System.out.println("Age : " + student.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}
