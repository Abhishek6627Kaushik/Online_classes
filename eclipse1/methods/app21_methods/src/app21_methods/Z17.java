package app21_methods;

public class Z17 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(200);
		// because data type is int so you  gave int value
		// this compile and run is sucess but the body test method
		// you not printting i you did not get 200 as a outupt
		
		System.out.println("main end");
	}
	
	static void  test(int i)
	{
		System.out.println("from test");
	}
}
