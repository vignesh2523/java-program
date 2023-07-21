import java.util.Scanner;
class ans
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,j,sum=0;
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	  }
	for(i=0;i<n;i++)
	{
	  if(i%2!=0)
	  {
	   sum=sum+a[i];
	   }
	   }
	 System.out.println(+sum);
	 }
	 }