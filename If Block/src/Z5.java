class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		boolean b1 = true ;
		if (b1 = !b1) // thats mean b1 is not equal to b1  
		{
			System.out.println("from  if1");
			System.out.println("from  if2");
			System.out.println("from  if3");
			System.out.println("from  if4");
		}
		System.out.println("main end : "+b1);// false is printing
	}
}
