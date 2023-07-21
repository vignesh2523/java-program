import java.util.Scanner;
class ans
{
  public static void main(String[] args)
  {
   int n,i,j;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   for(i=0;i<n;i++)
   {
	   for(j=0;j<n;j++)
	   {
		   if(i==0 && j==0)
		   {
			   System.out.print("1");
		   }
		   else if(i==1 && j==1)
		   {
			   System.out.print("2");
		   }
		   else if(i==2 && j==2)
		   {
			   System.out.print("3");
		   }
		   else if(i==3 && j==3)
		   {
			   System.out.print("4");
		   }
		   else if(i==4 && j==4)
		   {
			   System.out.print("5");
		   }
		   else if(i==5 && j==5)
		   {
			   System.out.print("6");
		   }
		   else if(i==6 && j==6)
		   {
			   System.out.print("7");
		   }
		   else if(i==5 && j==7)
		   {
			   System.out.print("8");
		   }
		   else if(i==4 && j==8)
		   {
			   System.out.print("9");
		   }
		   else if(i==3 && j==9)
		   {
			   System.out.print("10");
		   }
		   else if(i==2 && j==10)
		   {
			   System.out.print("11");
		   }
		   else if(i==1 && j==11)
		   {
			   System.out.print("12");
		   }
		   else if(i==0 && j==12)
		   {
			   System.out.print("13");
		   }
		   else if(i==1 && j==14)
		   {
			   System.out.print("14");
		   }
		   else if(i==2 && j==15)
		   {
			   System.out.print("15");
		   }
		   else if(i==3 && j==16)
		   {
			   System.out.print("16");
		   }
		   
		   else
		   {
			   System.out.print(" ");
		   }
	   }
	   System.out.println();
   }
  }
}