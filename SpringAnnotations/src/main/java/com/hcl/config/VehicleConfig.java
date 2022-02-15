package com.hcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hcl.auto.Vehicle;
import com.hcl.autoimpl.Mazaretti;

@Configuration
@ComponentScan("com.hcl")
public class VehicleConfig {

	@Bean(name="maz")
	public Vehicle getMazaretti() {
		return new Mazaretti();
	}
}
