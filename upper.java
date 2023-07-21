import java.util.*;
class upper
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] b=str.split(" ");
		int i,j,count;
		for(i=0;i<b.length;i++)
		{	
		 String[] c=b[i].split("");
		  for(j=0;j<c.length;j++)
		  {
		   if(j==0)
		   {
			   c[j]=c[j].toUpperCase();
		  }
		  else 
		  {
			  c[j]=c[j].toLowerCase();
		  }
		}
		b[i]=String.join("",c);
		}
		str=String.join(" ",b);
		System.out.println(str);
		
	}
}