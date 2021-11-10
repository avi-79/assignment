package com.sonata.CoreJavaAssignment4;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImp1 extends Employee implements EmployeeInt{
	List<Employee> l1=new LinkedList<>();
	
	@Override
	public void addEmployee(Employee e) {
		l1.add(e);
	}
	@Override
    public List<Employee> getEmployee(){
    	Iterator itr=l1.iterator();
    	while(itr.hasNext()) {
    		itr.next();
    	}
    	return l1;
    }
    @Override
    public void deleteEmployee(Employee e) {
    	//TODO Auto-generated method stub
    }
    @Override
    public double yearSalary(Employee e1) {
    	//TODO Auto-generated method stub
    	return Empsal*12;
    }
    @Override
    public double appSalary(Employee e1) {
    	//TODO Auto-generated method stub
    	if(Empsal<10000)
    		return Empsal+5000;
    	else
    		return Empsal;
    }
}