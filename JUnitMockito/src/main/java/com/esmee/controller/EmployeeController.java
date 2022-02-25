package com.esmee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esmee.model.Employee;
import com.esmee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/employee")
	Employee create(@RequestBody Employee emp) {
		return service.insertEmp(emp);
	}
	
	@GetMapping("/employee")
	List<Employee> listAllEmp() {
		return service.findAllEmp();
	}
	
	@DeleteMapping("/employee/{id}")
	void deleteEmployee(@PathVariable Integer id) {
		service.deleteById(id);
	}
}
