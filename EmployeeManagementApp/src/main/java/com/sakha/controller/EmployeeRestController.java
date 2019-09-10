package com.sakha.controller;
//if this is used then we can view without creating jsp pages
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakha.model.Employee;
import com.sakha.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() throws Exception{
		return es.getAll();
		
	}
	@GetMapping("/employee/{empid}")
	public Employee getEmployee(@PathVariable("empid") int empid) throws Exception{
		return es.getEmployee(empid);
		
	}
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee emp)throws Exception{
	return es.save(emp);
	}
	@DeleteMapping("/employees/{empid}")
	public void deleteEmployee(@PathVariable("empid") int empid) throws Exception{
	//System.out.println("SJHSADKJDSLKK;L");
		es.deleteEmployee(empid);
}
	@PutMapping("/employeeupdate")
	public Employee updateEmployee(@RequestBody Employee emp)throws Exception{
	 return es.updateEmployee(emp);
		
	}
	
	

}