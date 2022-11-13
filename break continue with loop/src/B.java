class B 
{
	public static void main(String[] args) 
	{

		for (int i = 1; i <= 10 ; i ++ )
		{
			System.out.println("loop begin"+i);
			if (i == 7)
			{
				continue;
			}
			System.out.println("loop end"+i);
		}
		System.out.println("main end");
	}
}
