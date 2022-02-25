package com.hcl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//TDD -> TestDriven Development

// JUnit 5 life cycle


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@BeforeAll
	static void setUp() {
		System.out.println("@B4 all is executed");
	}
	
	@BeforeEach
	void setUpThis() {
		System.out.println("@B4 each is executed");
		
	}
	
    @Test
	public void testCal() {
		System.out.println("==========TEST1 Executed");
		Calculate c1 = new Calculate();
		
		// passing condition
		Assertions.assertEquals(24, c1.add(12,12));
		
		// failing condition
		//Assertions.assertEquals(24, c1.add(12,15));
	}
    
    @Test
	public void testCal2() {
		System.out.println("==========TEST2 Executed");
		Calculate c1 = new Calculate();
		
		// failing condition
		//Assertions.assertEquals(27, c1.add(12,12));
		
		// passing condition
		Assertions.assertEquals(27, c1.add(12,15));
	}
    
    @AfterEach
    void tearThis() {
    	System.out.println("@After each is executed");
    }
    
    @AfterAll
    static void tear() {
    	System.out.println("@After All is executed");
    }
    
}
