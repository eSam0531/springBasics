package com.hcl.autoimpl;

import com.hcl.auto.Vehicle;

public class BMW implements Vehicle{

	@Override
	public void speed() {
		System.out.println("BMW: 80 mph in 8 secs.");
		
	}

}

