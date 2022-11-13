class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	for (int i =1; i<=5 ; i++ )
	
		System.out.println("loop body"+i);//only line no 6 is excuting
		System.out.println("loop body"+i);//we cannot use i outsude of body because i is log to for loop
		System.out.println("main end");
	
	}
}
/*
D:\Online Class\for-loop\src>javac -d ../classes Z3.java
Z3.java:9: error: cannot find symbol
                System.out.println("loop body"+i);
                                               ^
  symbol:   variable i
  location: class Z3
Z3.java:10: error: cannot find symbol
                System.out.println("main end"+i);
                                              ^
  symbol:   variable i
  location: class Z3
2 errors

*/