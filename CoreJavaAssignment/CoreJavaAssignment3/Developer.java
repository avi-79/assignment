package CoreJavaAssignmaent3;

public class Developer extends Employee {
	@Override
	public double salCal() {
		
	return empSal+(empSal*0.2);
	}
	public static void main(String[] args)
	{
		Developer d1=new Developer();
		d1.empId=201;
		d1.empName="avinesh";
		d1.empSal=600000;
		d1.display();
		System.out.println(d1.salCal());
	}
		
	
}
