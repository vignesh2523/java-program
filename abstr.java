abstract class bike{
	abstract void run();
}
class honda extends bike{
	void run(){
	System.out.println("running safely...");}
	public static void main(String[] args)
	{
		bike b=new honda();
		b.run();
	}
}