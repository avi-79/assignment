package CoreJavaAssignment2;
public class MyOwnAutoShop
    {
	public static void main(String[] args) 
	{
		
		Car myCar = new Car(130, 700000.0, "Red");
		Sedan mySedan = new Sedan(120, 4000000.0, "Black",19);
		Ford myFord1 = new Ford(160,5000000.0,"Blue",2008, 500);
		Ford myFord2 = new Ford(140,4000000.0,"Pink",2009, 1000);
		System.out.println("MySedan Price"+ mySedan.getSalePrice());
		System.out.println("MyFord1 Price "+ myFord1.getSalePrice());
		System.out.println("MyFord2 Price"+ myFord2.getSalePrice());
		System.out.println("MyCar Price "+ myCar.getSalePrice());
		
	}

}
