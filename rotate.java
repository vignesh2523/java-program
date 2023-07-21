import java.util.*;
class rotate
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,j,count=0;
		int temp;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
				
			}
		}
		System.out.print(a[i]);
	}
}
				  
				  
				  
 
 