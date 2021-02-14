package newjavalearn;

public class Constrctor 
{
	Constrctor()
	{
		System.out.println("hey buddy");
	}
	Constrctor(int a)
	{
		
		System.out.println("first Constrctor");
		
	}
	Constrctor(int a, char c)
	{
		this(5);
		 System.out.println("second Constrctor");
	}
	
	Constrctor(char c,int b,double s)
	{
		this(5,'a');		
			
     System.out.println("third Constrctor");
	}
	public static void main(String[] args) 
	{
		new Constrctor();
new Constrctor('a',5,5.6);

	}

}
