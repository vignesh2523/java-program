import java.util.*;
class rearangepattern
{
public static void main(String[] args)
{
 int i,j,s,n=5;
 for(i=0;i<n;i++)
{
 for(s=0;s<n+i+1;s++)
{
 System.out.print(" ");
}
for(j=0;j<n+s;j++)
{
System.out.print("*");
}
System.out.println("\n");
}
}
}