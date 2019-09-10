package com.sakha.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empid;
	String empname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate dob;
	float basicsalary;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", dob=" + dob + ", basicsalary=" + basicsalary
				+ "]";
	}


	
	

	public Employee() {
		
		// TODO Auto-generated constructor stub
	}





	public LocalDate getDob() {
		return dob;
	}





	public void setDob(LocalDate dob) {
		this.dob = dob;
	}





	public float getBasicsalary() {
		return basicsalary;
	}





	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}





	public void setEmpname(String empname) {
		this.empname = empname;
	}





	public Employee( String empname, LocalDate dob, float basicsalary) {
		
		
		this.empname = empname;
		this.dob = dob;
		this.basicsalary = basicsalary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}

}
