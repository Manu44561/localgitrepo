package Collections;

import java.util.HashSet;

public class checkHashset {

	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add("A");
		h.add("b");
		h.add(10);
		h.add("f");
		h.add(null);
		h.add("fff");
		
		System.out.println(h.add("A"));
		System.out.println(h);
				

	}

}
