package CoreJavaAssignment2;

public class Student {
	int Sid;
	String Sname;
	int Sclass;
	Student(int id,String name,int clas)
	{
		Sid=id;
		Sname=name;
		Sclass=clas;
	}
	void display()
	{
	System.out.println(Sid +" "+Sname+" "+Sclass);
	
	}
    public static void main(String[] args)
    {
    	Student s1=new Student(101, "ram" ,10);
    	Student s2=new Student(102, "akhil" ,10);
    	s1.display();
    	s2.display();
    }
}
