package CoreJavaAssignment2;

public class Product {
	int Pid;
	String Pname;
	int Price;
	
	Product(int id,String name,int price)
	{
		Pid=id;
		Pname=name;
		Price=price;
	}
	static float calculate_gst(float orgcost,float Net_price)
	{
		return ((Net_price-orgcost)*100)/orgcost;
	}
	void display()
	{
	System.out.println(Pid +""+Pname+""+Price);
	
	}
    public static void main(String[] args)
    {
    	Product p1=new Product(101, "  mobile " ,15000);
    	Product p2=new Product(102, " laptop " ,20000);
    	p1.display();
    	p2.display();
    	float orgcost=15000;
    	float Net_price=20000;
    	System.out.println("GST="+calculate_gst(orgcost,Net_price)+"%");
    }
}
