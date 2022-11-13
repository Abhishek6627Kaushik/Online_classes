package app21_methods;

public class Z15
{
	public static void main(String[] args) 
	{
		System.out.println("From main");
		test();
		//her we call test method expicitly main method
		// while calling test method we required value to argument
		// if you did not gave value argument you will get compile time error at lin no 8
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("from test");
	}
}
