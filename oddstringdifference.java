import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(a[i]+a[j]==a[k])
					{
						count++;
					}
					else
						continue;
				}
			}
		}
		System.out.println(count);
	}
}