// learnign pull request
package com.sakha.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.model.Employee;
import com.sakha.repositor.Repoemployee;




@Service
public class EmployeeService {


@Autowired
Repoemployee repo;
public Employee save(Employee emp) {
return repo.save(emp);
}

public Employee getEmployee(int empid) {
return repo.getOne(empid);
}



public Employee updateEmployee(Employee emp) {
	Employee emp1=getEmployee(emp.getEmpid());
	emp1.setEmpname(emp.getEmpname());
	emp1.setDob(emp.getDob());
	emp1.setBasicsalary(emp.getBasicsalary());
	
	
	return repo.save(emp1);
	
}


public void deleteEmployee(int empid)
{
repo.deleteById(empid);
}
public List<Employee> getAll(){
	List<Employee> empall=repo.findAll();
	return empall;
}




}


