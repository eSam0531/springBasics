package com.hcl.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Emp {
	
	private int id;
	private String firstName;
	private String lastName;
}