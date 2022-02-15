package com.hcl.util;

import com.hcl.auto.Vehicle;

import lombok.Setter;


@Setter
public class UtilityClass {
	
	Vehicle vehicle;
	
	public void output() {
		
		vehicle.speed();
		
	}
	
}
