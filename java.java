import java.util.*;
class clas
{ 
int add(int a,int b)
{
	return a+b;
}
int sub(int a,int b)
{
	return a-b;
}
int mul(int a,int b)
{
	return a*b;
}
}
class java
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
    int[] b=new int[n];
	int i;
    for(i=0;i<n;i++)
	{
      a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
      b[i]=sc.nextInt();
	}
	clas obj=new clas();
	System.out.println(obj.add(a[0],b[0])+"+"+obj.add(a[1],b[1])+"i");
    System.out.println(obj.sub(a[0],b[0])+"+"+obj.sub(a[1],b[1])+"i");
    System.out.println(obj.mul(a[0],b[1])+obj.mul(a[1],b[0])+"+"+(obj.mul(a[0],b[1])+obj.mul(a[1],b[0]))+"i");	
  }
}