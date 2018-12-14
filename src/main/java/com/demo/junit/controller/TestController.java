package com.demo.junit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.junit.model.Employee;
import com.demo.junit.service.EmpBusinessLogic;


@RestController
public class TestController {
	@Autowired
	private EmpBusinessLogic empBusinessLogic;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ResponseEntity<?> firstPage() {
		Employee emp = new Employee();
		emp.setName("Salma");
		emp.setDesignation("Developer");
		emp.setEmpId("1");
		emp.setSalary(10000);
		double res=empBusinessLogic.calculateYearlySalary(emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		//double response=empBusinessLogic.testCalculateAppriasal(emp);
	    //return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
   }
	

