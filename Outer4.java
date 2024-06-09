import java.lang.*;
import java.util.*;
class Outer4
{
	static final int a=20;
	class Inner
	{
		private void display()
		{
			System.out.println("weclome to satya");
			System.out.println(Outer4.a);
		}
	}
	public static void main(String args[])
	{
		new Outer4().new Inner().display();
	}
}
	