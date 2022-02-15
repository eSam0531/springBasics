package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hcl.util.UtilityClass;


public class App {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		UtilityClass u1 = (UtilityClass) factory.getBean("util");
		u1.output();
		
		
	}
}
