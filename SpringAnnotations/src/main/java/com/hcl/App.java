package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.auto.Vehicle;
import com.hcl.config.VehicleConfig;


public class App {
	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(VehicleConfig.class);
		Vehicle v = (Vehicle) factory.getBean("maz");
		v.speed();
		
	}
}
