package newjavalearn;

public class Classunderstand {

	public static void main(String[] args)
	{
//new test.Classunderstand();
		Classunderstand c = new Classunderstand();//ne classUnderstand is object here 
		//c is the object refernce
		
		//Note : Main method is void bec it never returns anything
		
		c.test();
		int o= c.display();
		System.out.println(o);
		String su= c.method();
		System.out.println(su);
		int y=c.division(6, 2);
		System.out.println(y);
	}
	
	void test()
	{
		System.out.println("test method");
	}
	
	int display()
	{
		System.out.println("teht");
		int q=10;
		int q1=9;
		int r=q+q1;
		return r;
	}
	String method()
	{
		System.out.println("string methods");
		String u="selenium";
		return u;
	}
	
	int division(int l,int m)
	{
		System.out.println("divisiion methos called");
		int d=l/m;
		return d;
	}
}
