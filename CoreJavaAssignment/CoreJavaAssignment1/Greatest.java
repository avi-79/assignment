package CoreJavaAssignment;

public class Greatest {
	public static void main(String args[])
	{    //instalising the numbers
		int a=12;
		int b=25;
		int c=89;
		//comparing  a with b and a with c
		if(a>=b&&a>=c)
			System.out.println(a+" the greatest number ");	
		//comaring b with a and b with c
		else if(b>=a&&b>=c)
			System.out.println(b+" the greatest number ");	
		else
			System.out.println(c+" the greatest number ");	
	}

}
