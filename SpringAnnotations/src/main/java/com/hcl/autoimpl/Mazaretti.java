package com.hcl.autoimpl;

import com.hcl.auto.Vehicle;

public class Mazaretti implements Vehicle{

	@Override
	public void speed() {
		System.out.println("Mazaretti: 100 mph in 8 secs using Spring Annotations.");
		
	}

}
