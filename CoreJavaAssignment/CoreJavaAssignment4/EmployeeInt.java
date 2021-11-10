package com.sonata.CoreJavaAssignment4;
import java.util.LinkedList;
import java.util.List;

public interface EmployeeInt {
	
	List<Employee> emplist = new LinkedList<>();

	public void addEmployee(Employee e);

	public void deleteEmployee(Employee e);

	public double yearSalary(Employee e1);

	public double appSalary(Employee e1);
}