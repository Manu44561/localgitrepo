package newjavalearn;

public class MethodOverlo
{

	int a=10;
	int b =20;
	public static  void main(String[] args) 
	{

		MethodOverlo m = new MethodOverlo();
		m.show();
	
	
	
	}
	public static void main(int[] args) 
	{

		
		MethodOverlo m1 = new MethodOverlo();
		m1.show(5);
		System.out.println("this is main method");
	}
	
public void show()

{
	System.out.println("hello");
	
	}
public void show(int a)
{
	System.out.println("world");
	
}
}
