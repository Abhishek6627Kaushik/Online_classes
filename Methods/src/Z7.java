class Z7 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char c = test();
		System.out.println("main end "+c);
	}
	public static char test()
	{
		System.out.println("from test");
		return 'd';
	}
}
