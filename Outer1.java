import java.lang.*;
import java.util.*;
class Outer1
{
	static void f1()
	{
		System.out.println("welcome to satya");
	}
	static class Inner
	{
		void f2()
		{
			System.out.println("welcome to core java");
		}
	}
	public static void main(String args[])
	{
		Outer1.f1();
		Outer1.Inner.f2();		
	}
}