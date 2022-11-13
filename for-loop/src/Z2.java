class Z2
	{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for (i = 1, System.out.println("inti"); test(i);System.out.println("before change : "+i), i++ ,System.out.println("after change "+i));
		{
			System.out.println("loop body "+i);
		}
		System.out.println("main end "+i);
	}
	static double test(int i)
	{
		 double flag =  (i <=5);
		 System.out.println("boolean status for "+i+" is "+flag);// compile time error
		 return flag;
	}
}

/*
D:\Online Class\for-loop\src>javac -d ../classes Z2.java
Z2.java:7: error: incompatible types: double cannot be converted to boolean
                for (i = 1, System.out.println("inti"); test(i);System.out.println("before change : "+i), i++ ,System.out.println("after change "+i));
                                                            ^
Z2.java:15: error: incompatible types: boolean cannot be converted to double
                        double flag =  (i <=5);
                                          ^
2 errors
*/