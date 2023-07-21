import java.util.*;
class countinrow
{
	public static void main(String[] args)
	{
    int i,j,n,m;
    Scanner s=new Scanner(System.in);
	n=s.nextInt();
	m=s.nextInt();
    int a[][]=new int[n][m];
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            a[i][j]=s.nextInt();
        }
    }
    int max=0;
    for(i=0;i<n;i++)
    {
        int sum=0;
        for(j=0;j<m;j++)
        {
         sum+=a[i][j];
            if(sum>max)
            {
                max=sum;
            }
        }
    }
	System.out.println(max);
	}
}