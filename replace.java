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
		 char[] c=b[i].toCharArray();
		 count=0;
		  for(j=0;j<c.length;j++)
		  {
			if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')
			{
				count++;
			}
		  }
		  System.out.printf("%d ",count);
		}
	}
}