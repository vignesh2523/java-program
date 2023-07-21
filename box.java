import java.util.Scanner;
class box
{
	Scanner sc=new Scanner(System.in);
	double width=sc.nextDouble();
	double height=sc.nextDouble();;
	double depth=sc.nextDouble();;
}
class boxdemo
{
	public static void main(String[] args)
	{
		box mybox=new box();
		double vol;
		vol=mybox.width*mybox.height*mybox.depth;
		System.out.println("volume is "+vol);
	}
}