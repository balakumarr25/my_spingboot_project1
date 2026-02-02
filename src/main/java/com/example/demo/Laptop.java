package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements ElectronicDevices{
	
	public void usingDevice() {
		System.out.println("Laptop is using");
	}
}
