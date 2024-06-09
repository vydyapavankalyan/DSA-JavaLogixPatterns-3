import java.util.*;
class Patt19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char i,j;
		//int n;

		for(i='A';i<='E';i++)
		{
			for(j=i;j>='A';j--)
				System.out.print(j);
			System.out.println("");
		}
	}
}