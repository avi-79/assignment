package com.sonata.CoreJavaAssignment4;
public class UserEmployee extends Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpid(123);
		e1.setEmpname("avinesh");
		e1.setEmpsal(100000);
		
		Employee e2=new Employee();
		e2.setEmpid(123);
		e2.setEmpname("avi");
		e2.setEmpsal(100000);
		
		EmployeeImp1 l1=new EmployeeImp1();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}
	}