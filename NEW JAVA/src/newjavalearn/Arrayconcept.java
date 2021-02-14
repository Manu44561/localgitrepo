package newjavalearn;

public class Arrayconcept {

	public static void main(String[] args)
	{
		int a[]= new int[3];
		a[0]=40;
		a[1]=30;
		a[2]=60;
		
		System.out.println(a[1]);
		//System.out.println(a[4]);
			System.out.println(a.length);
			System.out.println("=====================");
			
			for(int b=0;b<a.length;b++)
			{
				System.out.println(a[b]);
			}
			
			System.out.println("=====================");
			double c[]= new double[3];
			c[0]=55.23;
			c[1]=30.52;
			c[2]=60.56;
			
			System.out.println(c.length);
			for(int b=0;b<a.length;b++)
			{
				System.out.println(a[b]);
			}
			
			System.out.println("=====================");	
			char d[]= new char[3];
			d[0]='a';
			d[1]='b';
			d[2]='b';
			
			System.out.println(d.length);
			System.out.println("=====================");
			
			Object ob[] =new Object[4];
			ob[0]= 1;
			ob[1]="hello";
			ob[2]='k';
			ob[3]=4.5;
			
			System.out.println(ob.length);
			System.out.println("=====================");	
			String ob1[] =new String[4];
			ob1[0]= "hi";
			ob1[1]="hello";
			ob1[2]="java";
			ob1[3]="world";
			System.out.println(ob1.toString().contains("hello"));
			
	}
	
	
	
	
	

}
