package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hcl.model.Product;

public class App {
	public static void main(String[] args) {
		//Resource objcet represents the information of spring.xml files
//		Resource r = new ClassPathResource("spring.xml");
		//BeanFactory is an IOC container & is responsible to inject the dependencies
//		BeanFactory factory = new XmlBeanFactory(r);
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		
		//getBean() returns the object of the product class
		Product p = (Product) factory.getBean("prd");
		p.getProductDetails();
		
		
	}
}
