import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		int i,j,sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		  sum+=a[i];
		}
		for(i=1;i<=sum;i++)
		{
		  for(j=1;j<=sum;j++)
		  {
			  if(i==j*j)
			  {
				  count++;
			  }
		  }
		}
		System.out.print(+count);
	}
}