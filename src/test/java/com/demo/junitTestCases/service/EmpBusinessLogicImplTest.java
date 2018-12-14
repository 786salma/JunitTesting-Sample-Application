package com.demo.junitTestCases.service;


import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.demo.junit.model.Employee;
import com.demo.junit.service.EmpBusinessLogicImpl;
import com.demo.junitTestCases.SpringBootAppTest;

public class EmpBusinessLogicImplTest extends SpringBootAppTest{
	private static final double appraisal = 0;
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private EmpBusinessLogicImpl impl;
	
	
	@Before
	public void setup() {
			impl = new EmpBusinessLogicImpl();
	}
	
	//test to check monthly salary   	
	   @Test
	   public void calculateYearlySalaryTest() throws Exception {
		   System.out.println("---test case for monthly salary---" );
		//   mockMvc.perform(requestBuilder)  
		   Employee emp = new Employee();
		   emp.setName("Salma");
		     emp.setEmpId("1");
		      emp.setSalary(8000);
				
		      double sal = impl.calculateYearlySalary(emp);
		      assertEquals("96000.0", String.valueOf(sal));
		     
	   }
	 
	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasalTest() throws Exception {
		   System.out.println("---test case for appraisal salary---" );
		//   mockMvc.perform(requestBuilder)  
		   Employee emp = new Employee();
		   emp.setName("Salma");
		     emp.setEmpId("1");
		      emp.setSalary(8000);
				
		      double appraisal = impl.testCalculateAppriasal(emp);
		      assertEquals("500.0", String.valueOf(appraisal));
		     
	   }
	   
		  
	   }
	   
		
			
	  

	  
	



	


