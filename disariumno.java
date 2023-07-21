import java.util.Scanner;
class dis
{
	dis()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,temp,count=0;
		double k;
		if(n!=0)
		{
			int sc=n%10;
			count++;
			n=n/10;
		}
		temp=n;
		if(temp!=0)
		{
			int sc=temp%10;
			k=Math.pow(sc,count);
			count--;
			temp=temp/10;
		if(k==n)
		{
			System.out.println(+k);
		}
	    else
		{
			System.out.println("this number is not a disariumn number");
		}
		}
	}
	public static void main(String[] args)
	{
		dis obj=new dis();	
	}
}
		