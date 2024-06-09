import java.lang.*;
import java.util.*;
class Outer2
{
	static class Inner
	{
		void f2() //non static member
		{
			System.out.println("welcome to core java");
		}
	}
	public static void main(String args[])
	{
		Outer2.Inner i=new Outer2.Inner();
		i.f2();		
	}
}