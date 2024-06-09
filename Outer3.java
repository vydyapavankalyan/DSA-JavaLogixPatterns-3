import java.lang.*;
import java.util.*;
class Outer3
{
	void f1()
	{
		System.out.println("Bye bye");
	}
	class Inner
	{
		void f2() //non static member
		{
			System.out.println("welcome to core java");
		}
	}
	public static void main(String args[])
	{
		Outer3 o1=new Outer3();
		Outer3.Inner o3=o1.new Inner();
		o3.f2();
	}
}