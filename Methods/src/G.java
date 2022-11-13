class G 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begins "+i);
		test();
		System.out.println("main begins "+i);
		
	}
	public static void test()
	{
		int i = 20;
		
		System.out.println("From Test "+ i);
	}
}
