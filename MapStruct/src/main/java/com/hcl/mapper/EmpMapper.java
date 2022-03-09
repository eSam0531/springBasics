package com.hcl.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.hcl.dto.EmpDTO;
import com.hcl.model.Emp;



@Mapper
public interface EmpMapper {
	
	@Mapping(target="fullName", source=".", qualifiedByName="fullNameByFirstAndLastName")
	public abstract EmpDTO toDTO(Emp emp);
	
	//fromDTO fullName fetch from value from fullName and sets back to firsname of emp
	@InheritInverseConfiguration(name="toDTO")
	public abstract Emp fromDTO(EmpDTO dto);
	
	@Named("fullNameByFirstAndLastName")
	static String fullNameByFirstAndLastName(Emp emp) {
		return emp.getFirstName()+" "+emp.getLastName();
	}

}
