package app21_methods;

public class Z18 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(200);
		System.out.println("main end"); 
	}
	static void test(int i)
	{
		System.out.println("from test"+i);
		
		// argumet of a method is local to test method
		// i is local to test method so i is only visiable 
		
		//test method not main method
	}
}
