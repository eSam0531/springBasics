package com.hcl;

import com.hcl.dto.EmpDTO;
import com.hcl.mapper.EmpMapper;
import com.hcl.mapper.EmpMapperImpl;
import com.hcl.model.Emp;

public class App 
{
	private static EmpMapper instance = new EmpMapperImpl();
    public static void main( String[] args )
    {
        Emp emp = Emp.builder().id(100).firstName("Esmee").lastName("Samarripa").build();
        
        EmpDTO empDTO = instance.toDTO(emp);
        
        System.out.println(empDTO);
    }
}
