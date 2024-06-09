import java.util.*;
class Longestword
{
	public static void main(String args[])
	{
		String s="welcome to java";
		String str[]=s.split(" ");

		int i,longest,pos=0;

		longest=str[0].length();

		for(i=1;i<str.length;i++)
		{
			if(str[i].length()>longest)
			{
				longest=str[i].length();
				pos=i;
			}
		}
		System.out.println("longest word in a given string="+str[pos]);
	}
}