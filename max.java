import java.util.*;
class max
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		int max,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			int count=0;
			max=0;
			for(j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					count++;
					if(max<count)
			       {
				    max=count;
			        if(max==m || max>n)
					{
						System.out.print(i+1);
					}
				   }
				}
			}
				
		}
	}
}