class E
{
	public static void main(String[] args) 
	{
		System.out.println("main end");

		if (false) //This is called nested If Block                  
		{ //line number 8 to line no 16 is not excuted because of if is false
			System.out.println("if1 begin");
			if(true) 	
			{
				System.out.println("if2 begin");
				System.out.println("if2 end");
			}
				System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}
