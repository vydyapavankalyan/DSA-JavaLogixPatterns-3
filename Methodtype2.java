import java.util.*;
import java.lang.Math;

class Methodtype2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.println("enter the values of a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		largest_of_three(a,b,c); //calling method
		
	}
		static void largest_of_three(int a,int b,int c)// called method
		{
			if(a>b)
			{
				if(a>c)
				{
					System.out.println(a+"is largest");
				}
				else
				{
					System.out.println(c+"is largest");
				}
			}
			else
			{
				if(b>c)
				{
					System.out.println(b+"is largest");
				}
				else
				{
					System.out.println(c+"is largest");
				}
			}
			
		}
}