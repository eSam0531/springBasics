package com.esmee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmee.model.Employee;

@RestController
public class EmpController {
	
	@GetMapping("/")
	public Employee displayAllEmps() {
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Esmee");
		e1.setEmpAddress("Texas");
		
		return e1;
		
	}

}
