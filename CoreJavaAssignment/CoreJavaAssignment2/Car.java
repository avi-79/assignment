package CoreJavaAssignment2;

public class Car {
		int speed;
		double regularPrice;
		String color;
		Car(int speed,double regularPrice,String color ){
			this.speed=speed;
			this.regularPrice=regularPrice;
			this.color=color;
		}
		public double getSalePrice()
		{
			return regularPrice;
		}
		public static void main(String args[])
		{
			Car c=new Car(300,2000000,"black");
			System.out.println(c.getSalePrice());
		}

	}

