package CoreJavaAssignmaent3;

public class Manager extends Employee {
	@Override
	public double salCal() {
		
	return empSal+(empSal*0.2);
	}
	public static void main(String[] args)
	{
		Manager m1=new Manager();
		m1.empId=201;
		m1.empName="avi";
		m1.empSal=600000;
		m1.display();
		System.out.println(m1.salCal());
	}
		
	
}
