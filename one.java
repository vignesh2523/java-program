import java.util.*;
class doubl
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		char c[]=new char[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			a[i]=b[i]%a[i];
		}
		for(i=0;i<n;i++)
		{
		if(a[i]==0)
		{
			System.out.print(+a[i]);
			c[i]='N';
		}
		else if(a[i]%2==0)
		{
			System.out.print(+a[i]);
			c[i]='E';
		}
		else
		{
			System.out.print(+a[i]);
			c[i]='O';
		}
		}
		System.out.println("\n");
		for(i=0;i<n;i++)
		{
			System.out.print(c[i]);
		}
	}
}