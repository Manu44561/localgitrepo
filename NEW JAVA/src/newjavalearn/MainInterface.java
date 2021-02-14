package newjavalearn;

public class MainInterface {

	public static void main(String[] args)
	
	{
		InterfaceConcept i= new InterfaceConcept();
		i.credit();
		i.deposit();
		i.transfer();
		
		i.tranferMoney();
		i.fundtranfer();
		
		i.Insurance();
		i.Interest();
		System.out.println(UKbank.a);
		
		System.out.println("==================");
		
		UKbank u= new InterfaceConcept();
		u.credit();
		u.deposit();
		u.transfer();
		
	}
	

}
