package com.esmee.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.esmee.model.Employee;
import com.esmee.repo.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	@InjectMocks //create class instances which needs to be tested in the test class
	EmployeeService service;
	
	@Mock //used to create mocks which are needed to support testing of class to be tested
	EmployeeRepository repo;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void findAllEmpsTest() {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Esmee","esmee@email.com");
		Employee e2 = new Employee("David","david@email.com");
		Employee e3 = new Employee("John","john@email.com");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		when(repo.findAll()).thenReturn(list);
		
		//test
		List<Employee> empList = service.findAllEmp();
		Assertions.assertEquals(3,empList.size());
		verify(repo,times(1)).findAll();
	}
	
	@Test
	void addEmpTest() {
		Employee ee = new Employee("AP","ap@hcl.com");
		service.insertEmp(ee);
		verify(repo,times(1)).save(ee);
	}
	
}
