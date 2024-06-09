import java.util.*;
class Numbersrec
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int n=100;

		numbers(n); //calling method

	}

	static void numbers(int n)  //called method
	{
			if(n>0)
			{
				numbers(n-1);
				System.out.print(n+" ");
			}
	}
		
}