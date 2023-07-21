import java.util.Scanner;
import java.util.Arrays;
class ans
{
  public static void main(String[] args)
  {
   int n,i,j,v=0,count=0;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   m=s.nextInt();
   w=s.nextInt();
   k=s.nextInt();
   int[][] a=new int[m][w];
   int[][] b=new int[m];
   for(i=o;i<m;i++)
   {
	   for(j=0;j<w;j++)
	   {
		   a[i][j]=s.nextInt();
	   }
   }
  
     for(i=o;i<k;i++)
   {
	 for(j=0;j<w;j++)
	   {
		  
			  a[i]+a[j]=b[i];
              count++;
		       
	   }
   }
    
    for(i=o;i<m;i++)
   {
	 for(j=0;j<k;j++)
	   {
		  
			  a[i]+a[j]=b[i];
              count++;
	   }
   }
   if(count==n)
   {
   System.out.println(+count);
  }
}
}