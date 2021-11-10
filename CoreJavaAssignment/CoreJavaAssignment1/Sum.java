package CoreJavaAssignment;

public class Sum {
	public static void main(String args[])
	{
		
		int[]  a=new int[] {1,2,3,4,5,6};
		int sum=0;
		System.out.println("sum of given array is");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.println( sum+"");
		}
	}

}
