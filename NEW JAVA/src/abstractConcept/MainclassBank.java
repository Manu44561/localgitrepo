package abstractConcept;

public class MainclassBank {

	public static void main(String[] args)
	{

		HDFCbank h = new HDFCbank();
		h.loan();
		h.credit();
		h.debit();
		h.funds();
		System.out.println("-------------------");
		Abstractclass a =new HDFCbank();
		a.credit();
		a.debit();
		a.loan();
		
	}

}
