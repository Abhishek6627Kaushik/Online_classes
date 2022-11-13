class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		if (true) // Any variable create in if block that variable is local to if ;
		{
				int i = 10 ; // This variable is local to If Block;
				System.out.println("from if1 ");
				System.out.println("from if2 ");
				System.out.println("from if3 ");
				System.out.println("from if4 : "+ i );
		}
		System.out.println("main end");
	}
}
