package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectDi1Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ProjectDi1Application.class, args);
		
		Student student = ac.getBean(Student.class);
		
		student.display();
		student.lapDisplay();
	}

}
