package newjavalearn;

public class Twodimensional {

	public static void main(String[] args)
	{
		int x[][]= new int[3][3];
		x[0][0]=5;
		x[0][1]=6;
		x[0][2]=4;
		
		x[1][0]=1;
		x[1][1]=3;
		x[1][2]=8;
		
		System.out.println(x[1][2]);
		
		System.out.println(x[0][2]);
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println("=====================");
		
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
		}
	}
	

}
