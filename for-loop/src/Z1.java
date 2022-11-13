class Z1 
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
	static boolean test(int i)
	{
			boolean flag =  (i <=5);
		 System.out.println("boolean status for "+i+" is "+flag);
		 return flag;
	}
}
