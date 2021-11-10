package com.sonata.CoreJavaAssignment4;
import java.util.ArrayList;
import java.util.List;
public class StudentCmp {
public static void main(String args[]) 
{
	List<Student> studentlist=new ArrayList<Student>();
	studentlist.add(new Student(999,"avinesh",1000));
	studentlist.add(new Student(888,"chinnu",998));
	studentlist.add(new Student(777,"ganesh",990));
	studentlist.add(new Student(666,"mahesh",875));
	studentlist.add(new Student(555,"kiran",870));
	studentlist.add(new Student(444,"sravan",860));
	studentlist.add(new Student(333,"vamsi",900));
	System.out.println("before sorting");
	studentlist.forEach((s)->System.out.println(s));
	System.out.println("after sorting");
	studentlist.sort((Student s1, Student s2)->s2.getStdid()-s1.getStdid());
	studentlist.forEach((s)->System.out.println(s));
}
}
