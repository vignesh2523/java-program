import java.util.Scanner;
class adjoint
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float a[][]=new float[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextFloat();
			}
		}
		float d;
		d=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
		System.out.print(d);
		System.out.println("\n");
		float temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					if(i+1<2&&j+1<2)
					{
						temp=a[i][j];
						a[i][j]=a[i+1][j+1];
						a[i+1][j+1]=temp;
					}
				}
					else
					{
						a[i][j]=-a[i][j];
					}
				}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.printf("%.1f ",a[i][j]/d);
			}
			System.out.println("\n ");
		}
	}
}