package CoreJavaAssignment2;
public class Truck extends Car {
	int weight;
	Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	public double getSalePrice()
	{
		if(weight>2000)
		{
			return super.getSalePrice()-(0.1*super.getSalePrice());
		}
		else
		{
			return super.getSalePrice()-(0.2*super.getSalePrice());
		}
	}
	public static void main(String args [])
	{
		Truck t=new Truck(250,1700000,"blue",3000);
		System.out.println(t.getSalePrice());
	}
}