import java.util.Scanner;
class perfectsq
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int i,temp=0;
	  for(i=0;i<=n;i++)
	  {
		  if(i*i==n)
		  {
			  temp=i;
		  }

	  }
	  		  System.out.println(+temp);
	  
}
}