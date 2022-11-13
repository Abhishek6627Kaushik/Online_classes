class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main end");

		if (true)
		{
			System.out.println("from if1");
			System.out.println("from if1 end");
		}
		if(true) // That is not a nested if block This is a Sequancely If block if After after
		{
			System.out.println("from if2");
			System.out.println("from if2 end");
		}
	}
}
