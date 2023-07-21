import java.util.*;
class cons
{
	int id;
	String name;
    Cons(int num,String n)
	{
		id=num;
		name=n;
	}
	void display()
	{
		System.out.println("id:"+id+"name:"+name);
	}
	public static void main(String[] args)
	{
		cons a=new cons(10,"vicky");
	     a.display();
	}
}
		