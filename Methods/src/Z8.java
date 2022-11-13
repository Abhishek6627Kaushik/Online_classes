class Z8 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int  i = test1();
		System.out.println("main end "+c);
	}
	public static int test1()
	{
		System.out.println("from test1");//compile time error  we cannot use  local variable without initilization
		int i;
		return i;
	}
}
