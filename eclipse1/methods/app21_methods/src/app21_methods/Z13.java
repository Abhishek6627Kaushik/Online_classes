package app21_methods;

public class Z13 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		String b1=	test1();
		
		System.out.println("main end"+b1);
	}
	
	static String test1()
	{
			System.out.println("From test1");
			
			String str = "hello";
			return str;
	}
}
