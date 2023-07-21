import java.util.*;
class tes
{
 public static void main(String[] args)
 {
   int n=9,i,j,s;
   int m=n*2-1;
   int b=11;
   for(i=0;i<m;i++)
   {
    for(s=2;s<b-2;s++)
  {
   System.out.print(" ");
  }
     for(j=0;j<b;j++)
    {
      if(i<=m && j<=1 && j==9 && j==10)
      {
        System.out.print("#");
        }
      else
        {
            System.out.print(" ");
   }
System.out.println("\n");
}
for(i=0;i<m;i++)
   {
    for(s=2;s<b-2;s++)
  {
   System.out.print(" ");
  }
     for(j=0;j<b;j++)
    {
        if(i==8 && j==2 && j<=9)
      {
        System.out.print(" $ ");
        }
 else
        {
            System.out.print(" ");
   }
 System.out.println("\n");
}
}
}
}


