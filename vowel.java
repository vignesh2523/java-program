import java.util.Scanner;
class vowel
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     char[] a=s.toCharArray( );
      int size=a.length;
      int i,count=0;
      for(i=0;i<size;i++)
      {  
         if(a[i]=='a'  || a[i]=='e'  || a[i]=='i'  || a[i]=='o'  || a[i]=='u')
         { 
            count++;
         }
    } 
  System.out.println(count);
}
}