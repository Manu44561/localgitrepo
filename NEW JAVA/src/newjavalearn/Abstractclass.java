package newjavalearn;

public class Abstractclass extends Shape{

	public static void main(String[] args) 
	
	{
		Shape s = new Abstractclass();
		
		s.shape();
		s.circle();
		System.out.println(s.a);


	}
//	public void circle()
//	{
//System.out.println("circle method");		
//	}
	void shape()
	{
		System.out.println("shape method");
	}

}
