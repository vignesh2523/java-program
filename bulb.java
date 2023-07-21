import java.util.*;
class bulb
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==1 || a[i+1]==0)
			{
				count++;
			}
			else if(a[i]==0 || a[i+1]==1)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}