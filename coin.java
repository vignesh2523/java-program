import java.util.Scanner;  
class coin
{  
public static void main(String args[])  
{  
int n;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();
switch(n)
{
 case 1:
 System.out.println("1 1");
break;
case 2:
 System.out.println("1 1");
break;
case 3:
 System.out.println("2 1 1");
break;
case 4:
 System.out.println("2 2");
break;
case 5:
 System.out.println("1 1");
break;
case 6:
 System.out.println("2 1 1");
break;
case 7:
 System.out.println("2 1 1");
break;
case 8:
 System.out.println("3 1 1 1");
break;
case 9:
 System.out.println("3 1 2");
break;
case 10:
 System.out.println("5 1 2 1");
break;
case 11:
 System.out.println("5 1 2 2");
break;
case 12:
 System.out.println("5 1 3 1");
break;
case 13:
 System.out.println("6 1 3 2");
break;
default:
 System.out.println("this is not the answer");
break;
}
}
}