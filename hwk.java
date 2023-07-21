import java.util.*;
class escape
{
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         String str = s.nextLine();
         System.out.println("Tab: \t"+str);
         System.out.println("Backspace: \b"+str);
         System.out.println("Carriage return: \r"+str);
         System.out.println("Form feed: \f"+str);
         System.out.println("Single quote: \'"+str);
         System.out.println("Double quote: \""+str);
         System.out.println("Backslash: \\"+str);
    }
}