import java.util.*;
class Missingelements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[10];
		int n,i,j,x;

		System.out.println("enter the size of array a and b");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		x=a[0];

		for(i=0;i<n;i++)
		{
			if(a[i]-i!=x)
			{
				while(x<a[i]-i)
				{
					System.out.print(x+i+" ");
					x++;
				}
			}
		}

		
	}
}