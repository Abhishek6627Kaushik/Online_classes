package app21_methods;

public class Z16 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(true);
		// line no8 c t e  because test argumemt is int type
//and you gave value int test is boolean
		// so erroe is incomtiable data type
		// alway give value wich data type you written
		System.out.println("ain end" );
	}
	static void test(int i)
	{
		System.out.println("from test");
	}
	
}
