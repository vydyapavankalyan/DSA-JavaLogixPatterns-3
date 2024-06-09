import java.util.*;
class Multiplecatches
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String s=args[0];
			System.out.println("Input value:"+s);
			
			int a=Integer.parseInt(s);
			System.out.println(a);
		}
		/*catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("No input: failed");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid conversion: failed");
		}*/
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
	}
}