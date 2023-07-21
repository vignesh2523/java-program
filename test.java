import java.util.Scanner;
class test
{
 public static void main(String[] args)
 {
   int i,j;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(i=1;i<=n*2-1;i++)
   {
     for(j=1;j<=n+2;j++)
    {
      if(j==1 ||  j==2  ||  j==n+1 || j==n+2)
      {
        System.out.print("#");
        }
     else if(i==n && j!=1 && j!=2 && j!=n+1 && j!=n+2 )
     {
     System.out.print("$");
     }
    else
     {
         System.out.print(" ");
}
}
    System.out.println("\n");
}
}
}