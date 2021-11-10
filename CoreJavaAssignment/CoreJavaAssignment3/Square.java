package CoreJavaAssignmaent3;

public class Square  extends Shape implements Shape_Interface{

	Square(){};
	
	@Override
	public float area(float len,float wi,float he) {
		return len*len;
	}

	public static void main(String args[]) {
		Square s1=new Square();
		System.out.println( "Area of Square is:"+ s1.area(10, 0, 0));
	}
}