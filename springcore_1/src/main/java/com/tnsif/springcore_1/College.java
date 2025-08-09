package com.tnsif.springcore_1;

public class College {
private Student student;
	
	public College() { 
		System.out.println("College object created......");
	}
	
	public void setStudent(Student student) {
		this.student =student;
	}
	
	public void show() {
		System.out.println("Welcome to college");
		student.display();
	}
}
