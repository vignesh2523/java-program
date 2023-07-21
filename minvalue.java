import java.util.Scanner;   
class minvalue 
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
System.out.println("min number: "+getMinValue(array));
}
public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue ;
    }
}
