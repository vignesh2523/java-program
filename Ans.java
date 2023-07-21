import java.util.*;
class Ans
{
   public static void main(String[] args)
  {
     int i,j,n=5,s;
     for(i=0;i<n;i++)
    {
      for(s=0;s<n-i-1;s++)
       {
         System.out.print(" ");
       } 
     for(j=0;j<n-s;j++)
       {
         System.out.print("*");
      }
   System.out.println("\n");
}
}
}