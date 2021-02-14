package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.*;

public class HashMapExample
{

	public static void main(String[] args) {

		
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a.size());
		System.out.println(a);
		a.remove(2);
		
		System.out.println(a);
		
		ArrayList a1 = new ArrayList();
		
		LinkedList l1 = new LinkedList();
		List l = Collections.synchronizedList(a1);
		l1.add("A");
		l1.add("A");
		System.out.println(l1);
		//System.out.println(a1 InstanceOf Serializable);
		
	HashMap<String,Integer> h = new HashMap<String,Integer>();
	 h.put("lol", 14);
	 h.put("mmm", 15);
	 
	 System.out.println(h.size());
		//h.put
		
	}

}
