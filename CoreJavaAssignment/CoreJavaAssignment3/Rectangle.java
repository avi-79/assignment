

package CoreJavaAssignmaent3;
public class Rectangle extends Shape implements Shape_Interface{
	
	Rectangle(){};
	
	@Override
	public float area(float len,float wi,float he) {
		return len*wi;
	}

	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		System.out.println( "Area of Rectangle is:"+ r1.area(10, 20, 0));
	}



}
