package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcept {

	public static void main(String[] args) {

		LinkedList<String> l=new LinkedList<String>();
		
		l.add("null");
		l.add("value");
		l.add("stored");
		System.out.println("the content is "+l);
		
		l.addFirst("run first");
		
		System.out.println("the content is "+l);
		l.addLast("at last");
		System.out.println("the content is "+l);
		
		l.set(0, "Manu");
		System.out.println("new change is" +l.get(0));
		
		l.remove();
		System.out.println(" now conetnts aee "+l);
		
		System.out.println(l.add("new"));
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("Using iteratir-------");
		
		Iterator<String> it =l.iterator();
		while(it.hasNext())
		{
			System.err.println(it.next());
			
			
			
		}
		
	
	}

}
