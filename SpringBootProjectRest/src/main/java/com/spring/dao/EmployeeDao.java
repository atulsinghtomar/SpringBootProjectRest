package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.spring.model.Employee;
import com.spring.model.Employees;

@Repository
public class EmployeeDao {
	
	 private static Employees list = new Employees();
     
	    static
	    {
	        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
	        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
	        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
	    }
	     
	    public Employees getAllEmployees()
	    {
	        return list;
	    }
	     
	    public void addEmployee(Employee employee) {
	        list.getEmployeeList().add(employee);
	    }
	

}
