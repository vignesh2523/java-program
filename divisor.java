import java.util.Scanner;  
class divisor 
{  
public static void main(String args[])  
{  
int n,a,i;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();
for(i=1;i<n;i++)
{ 
int s=n/i;
  if(s==0)
{
 System.out.println(+i);
}
}
}
}