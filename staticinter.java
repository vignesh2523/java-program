import java.util.*;
interface printable
{
	void print(); //static
default void msg()
{
	System.out.println("default msg");
}
}
class a6 implements printable{
	public void print()
	{
		System.out.println("hello");
	}
public static void main(String[] args)
{
	printable p=new a6();
	p.print();
	p.msg();
}
}