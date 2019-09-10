package com.skaha.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Before("excution (*com.sakha.ems.service.EmployeeServiceImpl.deleteEmployee(..))")
	public void ShowDeleteLog() {
		
	
	System.out.println("deleting employee details..");
	
	}

}
