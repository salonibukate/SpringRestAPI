package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@Autowired  
	EmployeeService employeeService;  
	
	@GetMapping("/emp")  
	private List<Employee> getAllEmployee()   
	{  
		return employeeService.getAllEmployee();  
	}  
	@PostMapping("/addemployee")  
	private Employee saveEmployee(@RequestBody Employee employee)   
	{  
		employeeService.save(employee);  
		return employee;  
	}  
}
