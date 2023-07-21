import java.util.Scanner;
class byteExample
{
  public static void main(String[] args)
     { 
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value int,Boolean,long,float,byte,string,short,double");
        int a=s.nextInt();
        Boolean b=s.nextBoolean();
        long c=s.nextLong();
        float d=s.nextFloat();
       byte e=s.nextByte();
       String f=s.nextLine();
       short g=s.nextShort();
       double h=s.nextDouble();
      

      System.out.println("int: "+a+"\nBoolean:  "+b+"\nlong:  "+c+"\nfloat:  "+d+"\nbyte:  "+e+"\nstring:  "+f+"\nshort:  "+g+"\ndouble:  "+h);
 
      }
}