class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		int i =10 ;
		if (i = 10) //this gave compile time error because is I is Int type value its mean 10 is assign to i  
		//in if block we chek only boolean expreation (true aur false) 
		{
			System.out.println("from  if1");
			System.out.println("from  if2");
			System.out.println("from  if3");
			System.out.println("from  if4");
		}
		System.out.println("main end : "+i);	
	}
}
/*
	
	Z6.java:8: error: incompatible types: int cannot be converted to boolean

*/
