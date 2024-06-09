import java.util.*;
class Maximumoccurrence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a[]=new int[10];
		int n,i,j,count=0,max_count=0,max_ele;

		System.out.println("enter the size of array a and b");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>max_count)
			{
				max_count=count;
				max_ele=a[i];
			}
		}
		System.out.println("maximum occurring element in array a="+max_ele);			
		
	}
}