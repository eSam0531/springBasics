package com.esmee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmpProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpProducerApplication.class, args);
	}

}
