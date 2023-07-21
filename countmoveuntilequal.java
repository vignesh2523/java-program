import java.util.*;
class countinrow
{
	public static void main(String[] args)
	{
    int i,j,n,m;
    Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int c=0;
    int a[]=new int[n];
	int b[]=new int[n];
    for(i=0;i<n;i++)
    {
            a[i]=s.nextInt();
    }
	for(i=0;i<n;i++)
    {
            b[i]=s.nextInt();
    }	
	for(i=0;i<n;i++)
	{	
			Arrays.sort(a);
			Arrays.sort(b);
			if(a[i]!=b[i])
		    {
				int temp=a[i];
				a[i]=b[i];
				b[i]=temp;
				c++;
			Arrays.sort(a);
			Arrays.sort(b);
	}
	}
	boolean res=Arrays.equals(a,b);
	if(res)
	{
		System.out.println(c);
	}
	else
	{
		System.out.println("-1");
	}
	}
}
		
	
	