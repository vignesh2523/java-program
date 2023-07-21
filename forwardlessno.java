import java.util.*;
class countinrow
{
	public static void main(String[] args)
	{
    int i,j,n;
    Scanner s=new Scanner(System.in);
	n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
            a[i]=s.nextInt();
    }
	int k,l;
	int count=0;
	for(i=0;i<n-3;i++)
	{
		for(j=i+1;j<n-2;j++)
		{
			for(k=j+1;k<n-1;k++)
			{
				for(l=k+1;l<n;l++)
				{
				if(a[i]<a[k]&& a[k]<a[j] && a[j]<a[l])
				{
					count++;
				}
				}
			}
		}
	}
	System.out.println(count);
	}
}