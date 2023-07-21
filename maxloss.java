import java.util.*;  
class maxloss  
{  
public static void main(String args[])  
{  
int n;  
Scanner sc = new Scanner(System.in);   
n = sc.nextInt();  
int[] price=new int[n];
int i,j;
for(i=0;i<n;i++)
{
	price[i]=sc.nextInt();
	}
Arrays.sort(price);
System.out.println(price[n-1]-2);
}
}
	
