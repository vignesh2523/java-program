import java.util.Scanner;
class perfectno
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,temp=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				temp+=i;
			}
		}
		if(temp==n)
		{
			System.out.println(+temp);
		}
	}
}
		
	
		