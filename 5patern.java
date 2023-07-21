import java.util.Scanner;
class adjoint
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}
	}
}