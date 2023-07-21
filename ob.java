import java.util.Scanner;
class perfectsq
{
  perfectsq()
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
public static void main(String[] args)
{
 perfectsq obj=new perfectsq(); 
}
}