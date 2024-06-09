import java.util.*;
class Patt18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		//int n;

		for(i='E';i>='A';i--)
		{
			for(j=i;j>='A';j--)
				System.out.print(j);
			System.out.println("");
		}
	}
}