package CoreJavaAssignmaent3;

public class Employee {

	 int empId;
	String empName;
	double empSal ;
	Employee(){}
Employee (int id,String name, double sal)
{
	this.empId=id;
	this.empName=name;
	this.empSal=sal;
}
public void display()
{
	System.out.println(empId+""+empName+""+empSal);
}
public double salCal() {
	return empSal+(empSal*0.05);
}
public static void main(String args[])
{
	Employee e1=new Employee(111,"avinesh",27000);
	e1.display();
	System.out.println(e1.salCal());
}
}
