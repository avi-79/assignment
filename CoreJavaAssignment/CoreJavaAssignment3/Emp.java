package CoreJavaAssignmaent3;

public abstract class Emp {
	int employeeid;
	String employeename;
	String address;
	double basicpay;
	int leaves;
	Emp(){}
	public Emp(int id,String name,String address,double basicpay,int lev)
	{
		this.employeeid=id;
		this.employeename=name;
		this.address=address;
		this.basicpay=basicpay;
		this.leaves=lev;
	}
	
	public void display()
	{
		System.out.println(employeeid+employeename+address+basicpay+leaves);
	}
	
	public double salCal(double HRA) {
		return this.basicpay+HRA;
	}
	
}
	
		


