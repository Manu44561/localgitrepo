package newjavalearn;

public class SuperCar extends Vechile {

	public static void main(String[] args)
	
	{
		BMW b = new BMW();// Compile type polimorphism 
		b.start();
		b.stop();
		b.Speed();
		b.run();

		
		System.out.println("===============");
		
		CAR C= new CAR();
		C.start();
		C.stop();
		C.run();
		
		System.out.println("===============");
		
		CAR r= new BMW();// Run time Polymorphism //dynamic polymorphsim ---->A child class object can be referred by parent class refrence variable
		r.start();
		r.run();
		r.stop();
		
		System.out.println("===============");
		
		b.engine();
		//BMW b2 = (BMW)new CAR();
		
	}

}
