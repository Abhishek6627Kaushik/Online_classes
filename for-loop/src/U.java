class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for (; ; )//infinite loop because for loop not receving a false conditiion
		{
			System.out.println("loop begin"+i);
			i++;
		}
	}
}
