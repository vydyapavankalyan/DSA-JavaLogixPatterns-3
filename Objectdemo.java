import java.util.*;
class Student
{
	int rollno=1234;
	String name="Sachin";
	String branch="CSE";
	int semester=4;
	float marks=456.0f;
}
class Objectdemo
{
	public static void main(String args[])
	{
		Objectdemo o=new Objectdemo();
		Student s=new Student();

		o.display(s); //calling method
	}
		void display(Student s1) //called method or user-defined method
		{
			System.out.println(s1.rollno);
			System.out.println(s1.name);
			System.out.println(s1.branch);
			System.out.println(s1.semester);
			System.out.println(s1.marks);
		}
}
			
			
			