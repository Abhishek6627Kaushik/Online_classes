class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false); //If Block is get ended at line number 6 itself because of (;) this
			System.out.println("from if1 "); 
			System.out.println("from if2 ");
			System.out.println("from if3 ");

		System.out.println("main end");   
	}
}
/*

Output is

main begin
from if1
from if2
from if3
main end

*/