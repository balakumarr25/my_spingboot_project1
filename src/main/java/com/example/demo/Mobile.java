package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Mobile implements ElectronicDevices{
	
	public void usingDevice() {
		System.out.println("Mobile is using");
	}

}
