class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;//boolean condition also optional
		for ( ; ; )// if you not provide a boolean condition it is always consider as a true value
		// for loop chalta jaayega aur  line 12 excute nhi hogi;
		{ 
			System.out.println("loop body "+i);
			i++;
		}
		System.out.println("main end "+i);
	}
}

/*

D:\Online Class\for-loop\src>javac -d ../classes T.java
T.java:12: error: unreachable statement
                System.out.println("main end "+i);
                ^
1 error
*/