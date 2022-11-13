class Y1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1, j = 20 ; i <= 10 && j <= 30 ; i++, j += 3)// after boolean condition you can not use , as a Sprater
		{
			System.out.println("loop body"+i+", "+j); 
		}
		
	}
}

// loop 29 tk chlega qnki j = 30 de rkha hai

