import java.util.*;
class rev
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] b=str.split(" ");
		int i;
		for(i=b.length-1;i>=0;i--)
		{
		System.out.print(b[i]);
		System.out.print(" ");
		}
	
	}
}