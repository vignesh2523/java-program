import java.util.*;
interface printable
{
	void print();
}
interface showable
{
	void show();
}
class a7 implements printable,showable{
	public void print()
	{
		System.out.println("hello");
	}
	public void show()
	{
		System.out.println("program");
	}
public static void main(String[] args)
{
	a6 p=new a6();
	p.print();
	p.show();
}
}