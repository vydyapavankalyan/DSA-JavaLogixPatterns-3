import java.util.*;
//import java.lang.Math;

class Methodtype3
{
	public static void main(String args[])
	{
		
		int x;
		
		x=prime_number(); //calling method
		if(x==0)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
			
		
	}
		static int prime_number()// called method
		{
			Scanner sc=new Scanner(System.in);
			
			int n,flag=0,i;
			System.out.println("enter the value of n");
			n=sc.nextInt();

			i=2;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			    i++;
			}
			return flag;
			
		}
}