package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhasundersatnd {

	public static void main(String[] args)
	{
		LinkedHashSet h = new LinkedHashSet();
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
