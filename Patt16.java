import java.util.*;
class Patt16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		//int n;

		for(i='E';i>='A';i--)
		{
			for(j='E';j>=i;j--)
				System.out.print(i);
			System.out.println("");
		}
	}
}