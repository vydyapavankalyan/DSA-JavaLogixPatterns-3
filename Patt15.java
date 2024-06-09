import java.util.*;
class Patt15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		//int n;

		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
				System.out.print(j);
			System.out.println("");
		}
	}
}