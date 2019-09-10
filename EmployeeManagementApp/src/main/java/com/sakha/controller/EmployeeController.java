package com.sakha.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sakha.model.Employee;

import com.sakha.service.EmployeeService;



@Controller
public class EmployeeController{
@Autowired
EmployeeService service;
@PostMapping("/addemployee")
public String save(@ModelAttribute Employee emp,Model m) {
Employee saveEmp = service.save(emp);
System.out.println(emp);
m.addAttribute("emp",saveEmp);
return "save";
}

@GetMapping("/getemployee")
public String getEmployee(@RequestParam("empid") int empid,Model m) {
Employee getemp=service.getEmployee(empid);
m.addAttribute("getemp",getemp);
return "getviewjsp";
}
//@PostMapping("/updateemployee")
//public String updateEmployee(@RequestParam("empid") int empid,@RequestParam("basicsalary")float basicsalary,Model m) {
//Employee updateemp=(Employee) service.updateEmployee(empid,basicsalary);
//m.addAttribute("uemp",updateemp);
//return "viewupdate";
//}

@GetMapping("/delete")
public String deleteEmployee(@RequestParam("empid")int empid,Model m) {
 service.deleteEmployee(empid);
return "deleteview";
}
@GetMapping("/getall")
public String GetAll(Model m) {
	List<Employee> getall=service.getAll();
	m.addAttribute("all",getall);
return "viewall";
}

}

