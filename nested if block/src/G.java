class G
{
	public static void main(String[] args) 
	{
		System.out.println("main end");

		if (true) //all if block excuted                 
		{
			System.out.println("if1 begin");
			if(false)// Inner s.o.p is not printing Because if is False 	
			{
				System.out.println("if2 begin");
				System.out.println("if2 end");
			}
				System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}
