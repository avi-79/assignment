package CoreJavaAssignment;

public class Duplicate {
	public static void main(String args[])
	{
		int[] avi=new int[] {1,2,3,4,5,6,7,8,9,9,3,5,1};
		System.out.println("the duplicate elements are");
		for(int i=0;i<avi.length;i++)
		{
			for(int j=i+1;j<avi.length;j++)
			 {
				if(avi[i]==avi[j])
			   System.out.println(avi[j]);
			}
		}
	}

}
