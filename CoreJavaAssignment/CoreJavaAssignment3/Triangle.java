package CoreJavaAssignmaent3;

public class Triangle extends Shape implements  Shape_Interface {

Triangle(){};
	
	@Override
	public float area(float len,float wi,float he) {
		return ((len*he)/2);
	}

	public static void main(String args[]) {
		Triangle t1=new Triangle();
		System.out.println( "Area of Triangle  is:"+ t1.area(10, 20, 30));
	}
}