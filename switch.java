import java.util.Scanner;
class scanner
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value:  ");
int a=s.nextInt();
switch(a)
{ 
case 1:
System.out.println("java");
break;
case 2:
System.out.println("data");
break;
default:
System.out.println("vignesh");
break;
}

}
}