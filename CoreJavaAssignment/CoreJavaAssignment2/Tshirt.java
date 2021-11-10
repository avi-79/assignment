package CoreJavaAssignment2;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt(String col,String mater,String deg)
	{
		color=col;
		material=mater;
		design=deg;
	}
	void display()
	{
	System.out.println(color +" "+material+" "+design);
	
	}
	 public String Size(String size)
	{
		return size;
	}
	 public static void main(String args[])
	 {
		 Tshirt t1=new Tshirt("blue","fabric","prited");
		 t1.display();
		 System.out.println(t1.Size("small"));
		 
		 Tshirt t2=new Tshirt("red","woolen","textile");
		 t2.display();
		 System.out.println(t2.Size("large"));
		 Tshirt t3=new Tshirt("black","cotton","fasion");
		 t3.display();
		 System.out.println(t3.Size("extra large"));
		 
	 }
} 
