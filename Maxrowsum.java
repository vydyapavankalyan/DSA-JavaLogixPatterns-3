import java.util.*;
class Maxrowsum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[10][10];
		int i,j,row,col,rsum,max_rsum=0;

		System.out.println("enter the order of the matrix");
		 row=sc.nextInt();
		 col=sc.nextInt();

		System.out.println("enter the elements of matrix a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<row;i++)
		{
			rsum=0;
			for(j=0;j<col;j++)
			{
				rsum=rsum+a[i][j];
			}
			if(rsum>max_rsum)
				max_rsum=rsum;
		}
		System.out.println("maximum row sum="+max_rsum);
	}
}