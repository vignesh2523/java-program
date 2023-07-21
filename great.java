import java.util.Scanner;
class great
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.printf("enter number:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if(n1>n2 && n1>n3)
{
 System.out.println("greatest number: "+n1);
}
else if(n2>n1 && n2>n3)
{
System.out.println("greatest number: "+n2);
}
else
{
System.out.println("greatest number: "+n3);
}
}
}
