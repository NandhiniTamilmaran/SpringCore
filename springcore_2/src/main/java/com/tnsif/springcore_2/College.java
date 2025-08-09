package com.tnsif.springcore_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private Student student;

	@Autowired
	public College(Student student) {
		this.student=student;
	}
	public void showCollegeDetails() {
		System.out.println("Welcome to college...");
		student.showStudent();
	}
}
