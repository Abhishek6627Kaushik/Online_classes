class V1  
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");	
		test();
		System.out.println("----------");
		test();
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("from test");

		return false;
	}
}
/*
		 This program gave compile time error  Because we can't convert int value to boolean;
15: error: incompatible types: boolean cannot be converted to int
                return false;
                       ^
1 error


*/