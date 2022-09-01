package com.samco.springBatchDemoUsingPostman.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.samco.springBatchDemoUsingPostman.entity.Employee;

@Service
public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {
		@Override
	    public Employee process(Employee employee){
	            return employee;
	    }
}


