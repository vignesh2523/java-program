import java.util.Scanner;
class str
{
  public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     char[] a=s.toCharArray();
     int size=a.length;
     int i,sum=0;
     for(i=0;i<size;i++)
     {
       if(a[i]>='0' && a[i]<='9')
     { 
         sum+=a[i]-48;
    }
}
System.out.println(+sum);
}
}