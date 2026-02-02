package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	ElectronicDevices ref;
	

	

	
	public Student(ElectronicDevices ref) {
		super();
		this.ref = ref;
	}

	void display() {
		System.out.println("student is acting");
	}
	
	void lapDisplay() {
		ref.usingDevice();;
	}
}
