abstract class bike{
	bike(){System.out.println("bike is created");}
	abstract void run();
	void changegear(){System.out.println("gear changed");}
}
class honda extends bike{
	void run(){
	System.out.println("running safely...");}
}
class test {
	public static void main(String[] args)
	{
		bike b=new honda();
		b.run();
		b.changegear();
	}
}