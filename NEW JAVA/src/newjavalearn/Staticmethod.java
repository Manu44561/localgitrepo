package newjavalearn;

public class Staticmethod
{
	int a =10;
	String c ="JAVA";
public static void main(String args[])
{
	System.out.println("oyeeee");
	System.out.println("==============");
	three();
	Staticmethod t= new Staticmethod();
			t.two();
	new Staticmethod().two();
	System.out.println(t.a);
	System.out.println(t.c);
	
}
static void three() {
	System.out.println("Hi");
}
static void two()
{
	System.out.println("hello");
}
}
