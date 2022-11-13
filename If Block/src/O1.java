class O1 
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
		System.out.println("main end"+i);//This is give you compile time error Beacause (I) is local If Block we cannot used i outside of IF BLOCk
	}
}
/*

.java:15: error: cannot find symbol
                System.out.println("main end"+i);
                                              ^
  symbol:   variable i
  location: class O1
1 error

*/