/*

Each row containg 10 elements
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111
	1111111111


*/

class P1 
{
	public static void main(String[] args) 
	{
		for (int rows = 1 ; rows <= 10 ; rows++  )
		{
			for (int colm = 1 ; colm <= 10; colm++ )
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}
}

 

 /*
 D:\Online Class\logical-codeing\patterns\src>javac -d ../classes P1.java

D:\Online Class\logical-codeing\patterns\src>java -cp ../classes P1
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
 
 
 
 */