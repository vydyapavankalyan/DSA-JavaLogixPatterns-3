import java.util.*;
class Student
{
	int rollno=1234;
	String name="Sachin";
	String branch="CSE";
	int semester=4;
	float marks=456.0f;
}
class Objectdemo1
{
	public static void main(String args[])
	{
		Objectdemo1 o=new Objectdemo1();
		Student s=new Student();

		s=o.display(); //calling method
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.branch);
		System.out.println(s.semester);
		System.out.println(s.marks);
	}
		Student display() //called method or user-defined method
		{
			Student s1=new Student();
			return s1;
		}
}
			
			
			