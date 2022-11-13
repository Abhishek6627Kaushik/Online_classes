package app21_methods;

public class A 
{
		public static void main(String[] args) 
		{
			System.out.println("From main");// test method is not printing because of we did not call test method from main method
			// first main method excute then test methd
		}
		public static void test()
		{
			System.out.println("from test");
		}
}
