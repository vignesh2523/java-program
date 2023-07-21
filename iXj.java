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
				if(i==0 && j==0)
				{
					a[i][j]=a[i][j]*a[i][j+2];
					System.out.print(a[i][j]);
				}
				else if(i==1 && j==0)
				{
					a[i][j]=a[i][j]*a[i][j+2];
					System.out.print(a[i][j]);
				}
				else if(i==2 && j==0)
				{
					a[i][j]=a[i][j]*a[i][j+2];
					System.out.print(a[i][j]);
				}
				else if(i==0 && j==2)
				{
					a[i][j]=a[i][j-1]*a[i][j];
					System.out.print(a[i][j]);
				}
				else if(i==1 && j==2)
				{
					a[i][j]=a[i][j]*a[i][j-1];
					System.out.print(a[i][j]);
				}
				else if(i==2 && j==2)
				{
					a[i][j]=a[i][j]*a[i][j-1];
					System.out.print(a[i][j]);
				}
				else if(i<n  && j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.println("\n");
			
		}
		
		
	}
}
					