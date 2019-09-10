package com.sakha.repositor;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sakha.model.Employee;


@Repository
public interface Repoemployee extends JpaRepository<Employee,Integer>{

@Modifying
@Query("UPDATE Employee SET basicsalary=:salary WHERE empid=:empid")
public int updateEmployee(int empid, float salary);


}