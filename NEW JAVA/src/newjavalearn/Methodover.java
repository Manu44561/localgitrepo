package newjavalearn;

public class Methodover
{
	void cla()
	{
		System.out.println("this is first");
	}
	static int  cla(int a)
	{
		System.out.println("this is second");
		return a;
		
	}
	void cla(int a , double b)
	{
		System.out.println("this is third");
	}

	public static void main(String[] args)
	{
		cla(5);
		Methodover s = new Methodover();
		s.cla(5, 5.5);
		s.cla();
		
	}

}
