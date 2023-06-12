package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	@Autowired  
	EmployeeRepository employeerepsoitory;  
	
	public List<Employee> getAllEmployee()   
	{  
		List<Employee> employee = new ArrayList<Employee>();  
		employeerepsoitory.findAll();
		return employee;  
	}  
	public void save(Employee employee)   
	{  
		employeerepsoitory.save(employee);  
	}  
}
