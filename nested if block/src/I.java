class I
{
	public static void main(String[] args) 
	{
		System.out.println("main end");

		if (true) //all if block excuted                 
		{
			System.out.println("if1 begin");
			if(true) 	// if if is contaning one sop then Curley bracede is optinal
				System.out.println("if2 begin");
			System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}
