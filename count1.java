import java.util.Scanner;
import java.util.Arrays;
class ans
{
  public static void main(String[] args)
  {
   int n,i,j,v=0,b=0,c=0,d=0,count=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   int[] a=new int[n];
   int[] value=new int[100];
   for(i=0;i<n;i++)
   {
	   a[i]=s.nextInt();
   }
   Arrays.sort(a);
   for(i=0;i<n;i++)
   {
	 System.out.println(+a[i]);	
   }
  v=a[i]+1;
  import
 
  b=a[2]+1;
  c=a[3]+1;
  d=a[4]+1;
  a[i]=v;
  v=b;
  b=c;
  c=d;
  d=a[i];
  System.out.println(+a[i]);
}
}