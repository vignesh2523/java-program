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
int arr[][]=new int[m][n]; 
int b[][]=new int[m][n];   
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
      arr[i][j] = sc.nextInt();     
}
}
for(i = 0;i < m;i++)
{ 
  for(j = 0;j < n;j++)
   {
      if(i==j)
      {
        b[i][j]=array[i][j]+arr[i][j]; 
}
else if(i+j==3)
{
     b[i][j]=array[i][j]+arr[i][j]; 
}
else
{
 b[i][j]=array[i][j];
}
}
}

for (i = 0; i < m; i++)   
{   
for (j = 0; j < n; j++)   
 { 
   System.out.print(b[i][j] + " ");   
    }
System.out.println();   
}   
 

}
}