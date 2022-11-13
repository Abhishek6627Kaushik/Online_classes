class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1, j = 20 ; i <= 10 && j <= 60 ; i++, j += 3)// after boolean condition you can not use , as a Sprater
		{
			System.out.println("loop body"+i+", "+j); // logical  && main dono value check hongi
		}
		
	}
}

/*
	loop i =10 chlega qnki i<=10 de rkha hai 
*/