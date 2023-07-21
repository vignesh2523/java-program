import java.util.Scanner;
class checking
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     char[] a=s.toCharArray( );
      int size=a.length;
      if(size>0)
      {
         System.out.println("The string is not empty");
     }
    else
   {
    System.out.println("The string is empty");
}
 }
}