package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.model.Customer;


public class App {
	public static void main(String[] args) {
		//scope
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Customer c = (Customer) factory.getBean("cust");
		c.setName("ABC");
		System.out.println(c);
		
		Customer c1 = (Customer) factory.getBean("cust");
		System.out.println(c1);
		
	}
}
