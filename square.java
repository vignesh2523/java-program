import java.util.Scanner;
class square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		 for(j=1;j<=n;j++)
		 {			 
      		if(a[i]==j*j)
		   {
     		count++;
		   }
		}
		}
		System.out.print(+count);
	}
}