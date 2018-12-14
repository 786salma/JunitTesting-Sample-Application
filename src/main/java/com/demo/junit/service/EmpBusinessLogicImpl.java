package com.demo.junit.service;

import org.springframework.stereotype.Service;

import com.demo.junit.model.Employee;


@Service
public class EmpBusinessLogicImpl implements EmpBusinessLogic {
	
	// yearly salary of employ
		public double calculateYearlySalary(Employee emp) {
			double yearlySalary = 0;
			yearlySalary = emp.getSalary() * 12;
	       return yearlySalary;
		}
		
		// appraisal of employ
	public double testCalculateAppriasal(Employee emp) {
        double appraisal = 0;
		
		if(emp.getSalary() < 10000) {
			appraisal = 500;
			} else {
				appraisal = 1000;
			}
		
		return appraisal;	
	}

	

}
