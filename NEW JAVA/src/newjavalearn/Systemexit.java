package newjavalearn;

public class Systemexit {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("first construyct");
			
		}
		catch(Exception e)
		{
			
			System.out.println("finally block statment");
		}
		
		finally
		{
			System.exit(1000);
			System.out.println("finally statment");
		}
		
	}

}
