package com.sonata.CoreJavaAssignment4;

import java.util.List;

public class Employee {
	int Empid;
	String Empname;
	double Empsal;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public double getEmpsal() {
		return Empsal;
	}
	public void setEmpsal(double empsal) {
		Empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsal=" + Empsal + "]";
	}
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
