import java.util.Scanner;  
class price  
{  
public static void main(String args[])  
{  
int n, digit, multi = 1;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();  
while(n > 0)  
{      
digit = n% 10;    
multi = multi*digit;    
n = n / 10;  
}    
System.out.println("multiplication of the value  "+multi);  
}  
}