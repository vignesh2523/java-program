import java.util.Scanner;
import java.util.*;
class shift
{
  public static void main(String[] args)
{
   int n,i,temp,temp1;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int[] a=new int[n];
 for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
for(i=0;i<2;i++)
{
  temp=a[i];
}
for(i=n;i<1;i--)
{
 temp1=a[i];
}
for(i=0;i<n;i++)
{
  temp1=temp;
 temp=a[i];
a[i]=temp1;

}
System.out.println(+a[n]);
}
}