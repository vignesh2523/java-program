import java.util.Scanner;   
class matrix  
{   
public static void main(String args[])   
{   
  int m, n, i, j;   
  Scanner sc=new Scanner(System.in);   
   System.out.print("Enter the number of rows: ");    
  m = sc.nextInt(); 
  System.out.print("Enter the number of columns: ");   
  n = sc.nextInt();   
 int array[][] = new int[m][n];    
for (i = 0; i < m; i++)    
{
  for (j = 0; j < n; j++)   
   {
      array[i][j] = sc.nextInt();     
}
}
for (i = 0; i < m; i++)   
{   
for (j = 0; j < n; j++)   
 { 
System.out.print(array[i][j] + " ");   
 }
System.out.println();   
}   
}   
}