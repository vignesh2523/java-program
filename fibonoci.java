import java.Scanner;
class fibonoci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f1=1,f2=1,;
while(n<=8)
{

int f3=f1+f2;
 f1=f2;
f2=f3;
System.out.println(+f3);
}
}
}


