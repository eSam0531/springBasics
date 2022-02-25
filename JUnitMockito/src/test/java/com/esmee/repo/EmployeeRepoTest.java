package com.esmee.repo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.esmee.model.Employee;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepoTest {

	@Autowired
	EmployeeRepository repo;

	@Test
	public void readCreateDataTest() {
		Employee e1 = new Employee("Esmee", "esmee@email.com");
		repo.save(e1);

		List<Employee> emps = repo.findAll();
		Assertions.assertThat(emps).extracting(Employee::getEmpName).containsOnly("Esmee");
		Assertions.assertThat(repo.findAll()).isNotEmpty();
	}

}
