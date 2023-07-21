import java.util.*;
class student
{
	int rollno;
	String name;
	void insert(int r,String n)
	{
		rollno=r;
		name=n; 
	}
	void display()
	{
		System.out.println(rollno+" "+name);
	}
}
class stude{
	public static void main(String[] args)
	{
		student s1=new student();
		s1.insert(111,"vicky");
		s1.display();
	}
}