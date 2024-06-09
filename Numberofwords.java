import java.io.*;
import java.util.*;
class Numberofwords
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("E:sample1.txt");
			br=new BufferedReader(fr);
		
			String s;
			int count=0;
	
			while((s=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(s);
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("number of words in a given file="+count);
		}
		finally
		{
			if(br!=null)
			   br.close();
			if(fr!=null)
			   fr.close();
		}			
	}
}