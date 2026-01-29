package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ApplicationContext ref = SpringApplication.run(Project1Application.class, args);
		Student student = ref.getBean(Student.class);
		System.out.println(student);
	}

}
