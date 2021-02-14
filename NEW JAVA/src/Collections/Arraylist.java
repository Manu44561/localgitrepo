package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static <E> void main(String[] args)
	
{
ArrayList a = new ArrayList();

a.add(20);
a.add(30);
a.add(40);
a.add(80);
a.add(80);

System.out.println(a.size());
System.out.println(a.get(4));

System.out.println("=======================");

for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}
System.out.println("=============");

ArrayList<Integer> a1 = new ArrayList<Integer>();

a1.add(40);
a1.add(5);
System.out.println(a1.size());
System.out.println("-------------");

ArrayList<E> a2 = new ArrayList<E>();
Employee e1= new Employee("Manu", 20, "TESTING");
Employee e2= new Employee("Raj", 40, "dev");
Employee e3= new Employee("SAMRAT", 70, "developer");

ArrayList<Employee> a3 = new ArrayList<Employee>();



a3.add(e1);
a3.add(e2);
a3.add(e3);

Iterator<Employee> i =a3.iterator();
while(i.hasNext())
{
	Employee e= i.next();
	System.out.println(e.age);
	System.out.println(e.dept);
	System.out.println(e.name);
}


System.out.println("===============================");
ArrayList<String> a9 = new ArrayList<String>();
a9.add("guru");
a9.add("nanak");
a9.add("swamy");



ArrayList<String> a10 = new ArrayList<String>();
a10.add("nithya");
a10.add("nanda");

//add all method 

a9.addAll(a10);

for (int j=0;j<a9.size();j++)
{
	System.out.println(a9.get(j));
}

System.out.println("=================");

//Remove all
a9.removeAll(a10);
for (int j=0;j<a9.size();j++)
{
	System.out.println(a9.get(j));
}
	

	System.out.println("=================");
	
	ArrayList<String> a11 = new ArrayList<String>();
	a11.add("hello");
	a11.add("how ru");
	a11.add("how ru");
	
	
	ArrayList<String> a12 = new ArrayList<String>();
	a12.add("hello");
	a12.add("how ru");
	a12.add("how ru");
	
	a11.retainAll(a12);
	
	
	for (int j=0;j<a11.size();j++)
	{
		System.out.println(a11.get(j));
	}
}
	
}
