package newjavalearn;

public class Supercalling
{

	public static void main(String args[])
	{
		C c = new C();
		
	}
}

class A
{
	A()
	{
		
	super();
	System.out.println("A class");
	}
}
class B extends A
{
	B(int a)
	{
		super();
		System.out.println("B class");
	}
}

class C extends B
{
	C()
{
		super(5);
		
System.out.println("C class");		
	}
}