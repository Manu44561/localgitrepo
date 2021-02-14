package newjavalearn;

public abstract class Shape 

{
int a=100;

Shape()
{
	System.out.println("inherited class");
}

	abstract void shape();
	final void circle() {
		System.out.println("circle method");
	}
}
