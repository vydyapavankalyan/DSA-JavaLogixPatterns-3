import java.lang.*;
import java.util.*;
class Outer
{
	static void f1()
	{
		System.out.println("welcome to satya");
	}
	static class Inner
	{
		static void f2()
		{
			System.out.println("welcome to core java");
		}
	}
	public static void main(String args[])
	{
		Outer.f1();
		Outer.Inner.f2();		
	}
}