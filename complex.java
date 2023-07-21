import java.util.*;
class complex
{
	void add()
	{
		int i;
		for(i=0;i<n-1;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=1;i<n;i++)
		{
			temp=a[i]+b[i];
		}
		System.out.printf("%d + %d i",c[i],temp);
	}
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int temp;
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		complex obj=new complex();
		obj.add();
	}
}