class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i ;
		for (i = 0; i <= 5;i++ )
	
			System.out.println("loop body : "+i);// this is sytaxtcly correct now i is local to main method
			System.out.println("loop body2 : "+i);
			System.out.println("main end ");
	}
}
