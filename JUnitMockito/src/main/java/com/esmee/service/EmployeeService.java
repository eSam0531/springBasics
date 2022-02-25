package com.esmee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esmee.model.Employee;
import com.esmee.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public List<Employee> findAllEmp() {
		List<Employee> result = repo.findAll();
		if (result.size() > 0) {
			return result;
		} else {
			return new ArrayList<Employee>();
		}
	}

	public void deleteAllEmp() {
		repo.deleteAll();
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public Employee insertEmp(Employee emp) {
		return repo.save(emp);

	}

}
