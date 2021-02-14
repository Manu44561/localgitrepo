package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconce {

	public static void main(String[] args)
	
	{
LinkedList<String> ll= new LinkedList<String>();
System.out.println(ll.size());

ll.add("hh");
ll.add("MANU");
System.out.println(ll);
System.out.println(ll.get(1));

Iterator<String> it=ll.iterator();
while(it.hasNext())
{
	//it.next();
	System.out.println(it.next());
}

System.out.println("==============");

ll.add(1, "how ru");
System.out.println(ll);
//System.out.println(ll.size());
System.out.println("====================");

LinkedList<String> l= new LinkedList<String>();
l.add("Raghu");
l.add("raj");
l.addAll(ll);

System.out.println(l);

System.out.println("====================");

ll.remove();
System.out.println(ll);

System.out.println("=======");

l.remove(1);

System.out.println("=======");

ll.clear();
System.out.println(ll);

System.out.println("============");


//reverse the list

LinkedList<String> lang= new LinkedList<String>();
lang.add("hey");
lang.add("manu");
lang.add("kalla");

Iterator<String> it1 = lang.descendingIterator();

while(it1.hasNext())
{
	System.out.println(it1.next());
}

System.out.println("=============");
//sorted order means from letter a to z

Collections.sort(lang);
System.out.println(lang);




	}

}
