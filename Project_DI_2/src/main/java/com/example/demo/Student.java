package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Laptop ref;
	

	public Laptop getRef() {
		return ref;
	}

	@Autowired
	public void setRef(Laptop ref) {
		this.ref = ref;
	}
	
	void display() {
		System.out.println("student is acting like ayush");
	}
	
	void lapDisplay() {
		ref.show();
	}
}
