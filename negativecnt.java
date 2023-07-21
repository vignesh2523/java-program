import java.util.Scanner;
class ans
{
	ans()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0;
		int[] a=new int[n];
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{ 
	      if(a[i]<0)
		  {
			b[i]=a[i];
			count++;
		   }
		}
			System.out.println(+count);
	for(i=0;i<n;i++)
	{
		if(b[i]!=0)
		{
			System.out.println(+b[i]);
	}
	}

	
	}
	public static void main(String[] args)
	{
		ans obj=new ans();
	}
}
			
