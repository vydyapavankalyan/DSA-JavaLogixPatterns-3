import java.util.*;
class Patt4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		for(i=n;i>=1;i--)
		{
			for(j=n;j>=1;j--)
				System.out.print(i);
			System.out.println("");
		}
	}
}