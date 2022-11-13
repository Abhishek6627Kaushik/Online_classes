class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		for (; i <= 5; i++)// if you initialize value alrady no need to initilize again
		{
			System.out.println("loop body"+i);
		}

		System.out.println("main end "+i);
	}
}
/*

Output


main begin
main end 10

*/