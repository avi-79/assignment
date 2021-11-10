package CoreJavaAssignmaent3;

public class Tester extends Employee {
	@Override
	public double salCal() {
		
	return empSal+(empSal*0.15);
	}
	public static void main(String[] args)
	{
		Tester t1=new Tester();
		t1.empId=201;
		t1.empName="avi";
		t1.empSal=600000;
		t1.display();
		System.out.println(t1.salCal());
	}
		
	
}
